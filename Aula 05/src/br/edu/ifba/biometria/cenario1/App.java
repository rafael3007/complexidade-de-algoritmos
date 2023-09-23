package br.edu.ifba.biometria.cenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.github.javafaker.Faker;

import br.edu.ifba.biometria.cenario1.borda.impl.SensoresImpl;
import br.edu.ifba.biometria.cenario1.models.Biometria;
import br.edu.ifba.biometria.cenario1.models.Paciente;
import br.edu.ifba.biometria.cenario1.nuvem.impl.ExecutorImpl;

public class App {
    private static final int TOTAL_DE_PACIENTES = 10;
    private static final int TOTAL_DE_LEITURAS = 50;

    private static List<Thread> executores = new ArrayList<>();

    // linear, O(N)
    public static void iniciarProcessamentoDeLeituras(Map<Paciente, SensoresImpl> pacientes) {
        List<Biometria> padrao = new ArrayList<>();
        padrao.add(new Biometria(80, 34));
        padrao.add(new Biometria(82, 32));
        padrao.add(new Biometria(84, 30));
        padrao.add(new Biometria(85, 28));

        for (Entry<Paciente, SensoresImpl> item : pacientes.entrySet()) {
            Paciente paciente = item.getKey();
            SensoresImpl sensores = item.getValue();

            Thread executor = new Thread(new ExecutorImpl(paciente, sensores, padrao, TOTAL_DE_LEITURAS));
            executores.add(executor);

            executor.start();
        }
    }

    // linear, O(N)
    public static void esperarFinalizacaoDeProcessamento() throws InterruptedException {
        for (Thread executor : executores) {
            executor.join();
        }
    }

    // linear, O(N)
    public static Map<Paciente, SensoresImpl> gerarPacientes() {
        Faker faker = new Faker(Locale.forLanguageTag("pt-BR"));

        Map<Paciente, SensoresImpl> pacientes = new TreeMap<>();
        for (int i = 0; i < TOTAL_DE_PACIENTES; i++) {
            Paciente paciente = new Paciente(faker.code().ean13(), faker.name().fullName());

            pacientes.put(paciente, new SensoresImpl());
        }

        return pacientes;
    }

    public static void main(String[] args) throws Exception {
        Map<Paciente, SensoresImpl> pacientes = gerarPacientes();

        System.out.println("iniciando o processamento");
        iniciarProcessamentoDeLeituras(pacientes);
        esperarFinalizacaoDeProcessamento();

        System.out.println("processamento finalizado");
    }
}
