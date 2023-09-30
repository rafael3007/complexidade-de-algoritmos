package br.edu.ifba.biometria.cenario2.nuvem.impl;

import br.edu.ifba.biometria.cenario2.borda.impl.SensoresImpl;
import br.edu.ifba.biometria.cenario2.models.Biometria;
import br.edu.ifba.biometria.cenario2.models.Paciente;
import br.edu.ifba.biometria.cenario2.nuvem.executor.Executor;

public class ExecutorImpl extends Executor {

    private Paciente paciente = null;
    private SensoresImpl sensores = null;

    public ExecutorImpl(
            Paciente paciente, SensoresImpl sensores,
            int totalDeLeituras) {
        super(totalDeLeituras);

        this.paciente = paciente;
        this.sensores = sensores;
    }

    // constante, O(1)
    @Override
    public void processarLeitura(int leituraAtual) {
        if (sensores.temLeitura()) {
            Biometria leitura = sensores.getLeitura();
            paciente.onLeitura(leitura);

            String informacoes = leitura.getDiagnostico();
            informacoes = informacoes == "" ? "nenhum problema encontrado, " : informacoes + ", ";
            informacoes += leitura.getTotalDePadroes() +
                    " padrões encontrados";

            System.out.println("leitura realizado no ciclo #" + leituraAtual + " para o paciente " + paciente.getNome()
                    + ":" + informacoes);
        }
    }

}
