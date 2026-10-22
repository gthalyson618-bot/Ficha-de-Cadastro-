import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        String continuar = "s";
        int numeroJogador = 1;

        while (continuar.equalsIgnoreCase("s")) {

        System.out.print("Nome do jogador? ");
        String nome = entrada.nextLine();
    

        System.out.print("Nick do Jogador? ");
        String nick = entrada.nextLine();

        System.out.print("Idade do Jogador? ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do teclado

        System.out.print("Jogo favorito? ");
        String jogo = entrada.nextLine();

        System.out.print("Level jogador? ");
        int level = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do teclado


        System.out.println("=====FICHA DO JOGADOR " + numeroJogador + " =====");
        System.out.println("Nome: " + nome);
        System.out.println("Nick: " + nick);
        System.out.println("Idade: " + idade);
        System.out.println("Jogo favorito: " + jogo);
        System.out.println("Level jogador: " + level);

          numeroJogador++;

            System.out.print("\nDeseja cadastrar outro jogador? (s/n): ");
            continuar = entrada.nextLine();
        }

        System.out.println("Cadastro encerrado!");
        entrada.close();
    }
}
