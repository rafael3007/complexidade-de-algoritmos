package br.edu.ifba.biometria.cenario2.nuvem.impl;

import java.util.List;

import br.edu.ifba.biometria.cenario1.borda.impl.SensoresImpl;
import br.edu.ifba.biometria.cenario1.models.Biometria;
import br.edu.ifba.biometria.cenario1.models.Paciente;
import br.edu.ifba.biometria.cenario1.nuvem.executor.Executor;

public class ExecutorImpl extends Executor {

    private Paciente paciente = null;
    private SensoresImpl sensores = null;

    Diagnostico diagnostico = new Diagnostico();
    AnalisadorDePadroes analisador = null;

    public ExecutorImpl(
            Paciente paciente, SensoresImpl sensores, List<Biometria> padraoDeLeitura,
            int totalDeLeituras) {
        super(totalDeLeituras);

        this.paciente = paciente;
        this.sensores = sensores;
        this.analisador = new AnalisadorDePadroes(padraoDeLeitura);
    }

    // compleixade linear O(N)

    @Override
    public void processarLeitura(int leituraAtual) {
        if (sensores.temLeitura()) {
            Biometria leitura = sensores.getLeitura();
            paciente.onLeitura(leitura);

            String informacoes = diagnostico.atuar(paciente.getLeituras());
            informacoes = informacoes == "" ? "nenhum problema encontrado " : informacoes + ", ";
            informacoes += analisador.atuar(paciente.getLeituras()) +
                    " padrões encontrados ";

            System.out.println("leitura realizado no ciclo #" + leituraAtual + " para o paciente " + paciente.getNome()
                    + ":" + informacoes);
        }

    }

}
