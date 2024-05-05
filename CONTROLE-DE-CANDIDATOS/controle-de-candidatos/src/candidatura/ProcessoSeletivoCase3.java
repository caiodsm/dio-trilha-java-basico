package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCase3 {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo a lista de candidatos informado o indice do elemento");

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " è " + candidatos[i]);
        }

        System.out.println("Forma abreviada de interação for each");
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
}
