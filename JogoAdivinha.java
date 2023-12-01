import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha{
    public static void main (String[] agrs){

        Random random = new Random();
        int random1 = random.nextInt(100);

        int tentativas = 0;
        int numeroSelecionado;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 100: ");
        numeroSelecionado= scanner.nextInt();

        while (numeroSelecionado != random1) {
            if (numeroSelecionado < random1){
                System.out.println("Você erro! O numero é maior. Tente novamente"); 
                tentativas++;

                System.out.print("Digite novamente um numero de 1 a 100: ");
                numeroSelecionado= scanner.nextInt();
            }
            else{
                System.out.println("Você erro! O numero é menor Tente novamente"); 
                tentativas++;

                System.out.print("Digite novamente um numero de 1 a 100: ");
                numeroSelecionado= scanner.nextInt();
            }
        }

        if (numeroSelecionado == random1 ){
                System.out.println("Parabéns!! Você acertou em "+ tentativas + " tentativas");
            }
        
    }

}