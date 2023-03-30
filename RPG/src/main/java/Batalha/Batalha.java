package Batalha;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author Zile
 */
public class Batalha {

    public static void main(String[] args) {
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Variaveis ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        boolean teste = true;
        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count = 40; // numero de vezes que a o caractere -= sera reptido

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Dados ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        double dado_jogador = Math.floor(Math.random() * 21);
        double dado_inimigo = Math.floor(Math.random() * 21);
        String rolar_dado = "";
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Jodador ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        double vida_jogador = 25;
        double dano_jogador = 0;

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Inimigos ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        double vida_inimigo1 = 15; //inimigo 1 é o "Urso" 
        double dano_inimigo = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("" + string.repeat(count));
        System.out.println("voce esta andando tranquilamente pela floresta, quando derrepente...");
        System.out.println("voce se depera com um enorme urso, ele esta com fome e furioso!!!");
        System.out.println("voce esta apavorado porem, tem que tomar uma decisão rapido. você decide:");

        System.out.println("" + string.repeat(count));
        System.out.println("opção 1 - correr(minimo nescessario para fugir do urso 15)");
        System.out.println("opção 2 - lutar");
        int decisao = input.nextInt();

        if (decisao == 1) {
            Scanner input2 = new Scanner(System.in);

            System.out.println("" + string.repeat(count));
            System.out.println("voce decidiu tentar fugir, aperte enter para rolar o dado");
            rolar_dado = input2.nextLine();

            dado_jogador = Math.floor(Math.random() * 21);
            System.out.printf("voce rolou o dado e ele caiu " + dado_jogador + "\n");
            if (dado_jogador < 19) {
                System.out.println("voce nao conseguiu fugir e tera que lutar se prepare!!!!");
                decisao = 2;
            } else if (dado_jogador >= 19) {
                System.out.println("voce conseguiu fugir do urso");
            }
        }
        if (decisao == 2) {
            System.out.println("" + string.repeat(count));
            System.out.printf("o HP total do urso é inimigo é: " + vida_inimigo1 + "\n");
            System.out.printf("o seu HP atual é de: " + vida_jogador + "\n");

            System.out.println("" + string.repeat(count));
            System.out.println("voce deseja rolar o dado para:");
            System.out.println("1 - atacar");
            System.out.println("2 - defender");
            double decisao2 = input.nextDouble();

            while (vida_inimigo1 > 0) {

                if (decisao2 == 1) {

                    Scanner input2 = new Scanner(System.in);

                    dado_jogador = Math.floor(Math.random() * 21);
                    dado_inimigo = Math.floor(Math.random() * 21);

                    System.out.println("" + string.repeat(count));
                    System.out.println("aperte enter para rolar o dado de ataque.");
                    rolar_dado = input2.nextLine();
                    System.out.printf("seu ataque foi de: " + dado_jogador + "\n");
                    System.out.println("");
                    System.out.println("seu inimigo rolou o dado de defesa.");
                    System.out.printf("a defesa do inimigo foi de: " + dado_inimigo + "\n");
                    System.out.println("" + string.repeat(count));

                    if (dado_jogador > dado_inimigo) {
                        vida_inimigo1 = vida_inimigo1 - dado_jogador;
                        System.out.printf("a vida atual do seu inimigo é de: " + vida_inimigo1 + "\n");
                    } else {
                        System.out.println("seu inimigo conseguiu defender, ataque ineficaz.");
                    }

                    if (vida_inimigo1 > 0) {
                        System.out.println("" + string.repeat(count));
                        System.out.printf("Vida atual do seu inimigo é de: " + vida_inimigo1 + "\n");
                        System.out.println("seu inimigo rolou o dado de ataque.");
                        System.out.printf("ataque do seu inimigo foi de: " + dado_inimigo + "\n");
                        System.out.println("");
                        System.out.println("aperte enter para rolar o dado de defesa.");
                        rolar_dado = input2.nextLine();
                        System.out.printf("sua defesa foi de: " + dado_jogador + "\n");
                        System.out.println("" + string.repeat(count));
                    }

                    if (dado_inimigo > dado_jogador) {
                        vida_jogador = vida_jogador - dado_inimigo;
                        System.out.printf("a sua vida atual é de: " + vida_jogador + "\n");

                    } else {
                        System.out.println("" + string.repeat(count));
                        System.out.println("ataque ineficas, voce conseguiu defender");
                        System.out.printf("a sua vida atual é de: " + vida_jogador + "\n");
                    }

                }
                
                if (decisao2 == 2){
                    
                    Scanner input2 = new Scanner(System.in);

                    dado_jogador = Math.floor(Math.random() * 21);
                    dado_inimigo = Math.floor(Math.random() * 21);  
                    
                    
                    if (vida_jogador > 0){
                        System.out.println("");
                        System.out.println("aperte enter para rolar o dado de defesa.");
                        rolar_dado = input2.nextLine();
                        System.out.printf("sua defesa foi de: " + dado_jogador + "\n");
                        System.out.println("" + string.repeat(count));
                        System.out.printf("Vida atual do seu inimigo é de: " + vida_inimigo1 + "\n");
                        System.out.println("seu inimigo rolou o dado de ataque.");
                        System.out.printf("ataque do seu inimigo foi de: " + dado_inimigo + "\n");
                        System.out.println("" + string.repeat(count));
                    }
                    
                    if (dado_inimigo > dado_jogador) {
                        vida_jogador = vida_jogador - dado_inimigo;
                        System.out.printf("a sua vida atual é de: " + vida_jogador + "\n");

                    } else {
                        System.out.println("" + string.repeat(count));
                        System.out.println("ataque ineficas, voce conseguiu defender");
                        System.out.printf("a sua vida atual é de: " + vida_jogador + "\n");
                    }
                }
            }

            System.out.println("" + string.repeat(count));
            System.out.println("seu inimigo foi derrotado.");
            System.out.printf("A sua vida atual é de: " + vida_jogador + "\n");
        };
    }
}
