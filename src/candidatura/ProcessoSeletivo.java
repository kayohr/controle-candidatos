import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO", "AUGUSTO"};

        for(String candidato: candidatos){
                    entrandoEmContato(candidato);

        }

        // analisarCandidato(1900.0); 
        // analisarCandidato(2200.0); 
        // analisarCandidato(2000.0); 
        // selecaoCandidatos();
        // imprimirSelecionados();
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else{
                    System.out.println("Contanto realizado com sucesso");
            }
        } while( continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", numero maximo tentativas " + tentativasRealizadas + " tentativas");

    }

    //método auxiliar
    static boolean atender(){
            return new Random().nextInt(3)==1;
        }
    
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO", "AUGUSTO"};
        System.out.println("Imprimindo o índice do elemento dos Selecionados");
        
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de iteração for each");
        
        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado foi " + candidato);

        }

    
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while ( candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor R$" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        
    }


    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) { 
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;");
        } else { 
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    
    }
}