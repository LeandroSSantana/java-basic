package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatosSelecionados = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo" };
        // primeiro um for para selecionar os candidatos
        for (String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas realizadas "
                    + tentativasRealizadas);

    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo" };
        System.out.println("Imprimindo lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato de selecionado  foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor",
                "Suzana" };
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario: "
                    + String.format("%.2f", salarioPretendido));

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        } else {
            System.out.println("Aguardando demais Candidatos");
        }
    }
}
