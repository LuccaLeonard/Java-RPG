/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagem;

import java.util.Scanner;

/**
 *
 * @author Zile
 */
public class Personagem {

    public static void main(String[] args) {
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Variaveis ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        String jogar = ""; // variavel que salva a decisao de jogar ou nao(condicao while)

        String nome = ""; // variavel que salva o nome do jogador
        int confirma_nome = 0; // variavel que confrima a escolha do nome

        String classe = ""; //variavel que salva a classe do jogador
        int confirma_classe = 0; // variavel que confrima a escolha da classe

        String descricao = ""; //variavel guarda a descricao da classe

        String barra = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ Seção Variaveis ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\ 
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Menu ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\        
        Scanner input_menu = new Scanner(System.in); //Scanner reservado para o menu

        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");;
        System.out.println("|       Seja bem vindo ao nosso RPG!!       |");
        System.out.println("|       Selecione uma das opções.           |");
        System.out.println("|       Aperte qualquer tecla para jogar    |");
        System.out.println("|       Digite não para sair.               |");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");
        jogar = input_menu.nextLine();
        jogar = jogar.toLowerCase();

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ Seção menu ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\    
        while (!"nao".equals(jogar) && !"n".equals(jogar) && !"não".equals(jogar)) { // inicio do jogo

            // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Seção Criar Personagem ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\  
            Scanner input_personagem = new Scanner(System.in); // scanner reservado para as informações do jogador nome,classe,etc...

            while (confirma_nome != 1) {
                Scanner scanner_verifica_nome = new Scanner(System.in);
                System.out.println("" + barra.repeat(25));
                System.out.println("Vamos criar o seu personagem, Digite o seu nome:");
                nome = input_personagem.nextLine();

                System.out.printf("seu nome é " + nome + " ? (1- sim 2- nao)");

                while (!scanner_verifica_nome.hasNextInt()) {;
                    System.out.println("" + barra.repeat(25));
                    System.out.println("Entrada inválida! Digite 1- para sim ou 2- para nao");
                    scanner_verifica_nome.next(); // limpa a entrada inválida
                }

                confirma_nome = scanner_verifica_nome.nextInt();

                if (confirma_nome == 2) {
                    System.out.println("Sem Problemas.");
                } else if (confirma_nome == 1) {
                    System.out.printf("ola " + nome + " :) \n");
                } else {
                    System.out.println("ERror, resposta invalida tente novamente.");
                }
            };

            // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ escolher classe ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\  
            while (confirma_classe != 1) {
                Scanner input_classe = new Scanner(System.in);
                Scanner scanner_verifica_classe = new Scanner(System.in); // scanner responsavel para verificar se o usuario informara um numero inteiro

                System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");;
                System.out.println("|       Escolha sua classe!!                |");
                System.out.println("|       1- Guerreiro.                       |");
                System.out.println("|       2- Mago.                            |");
                System.out.println("|       3- Arqueiro.                        |");
                System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-|");

                while (!scanner_verifica_classe.hasNextInt()) {;
                    System.out.println("Entrada inválida! Digite um número entre 1 e 3. ");
                    scanner_verifica_classe.next(); // limpa a entrada inválida
                }
                int escolha_classe = scanner_verifica_classe.nextInt();

                // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ escolher classe ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\ 
                // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ confirmar classe ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
                if (escolha_classe == 1) {
                    classe = "Guerreiro";
                    descricao = " Um guerreiro pode ser uma escolha sólida para jogadores que gostam de combate corpo a corpo e de causar grandes quantidades de dano. \n"
                            + "Eles são resistentes e capazes de usar várias armas e armaduras.";

                } else if (escolha_classe == 2) {
                    classe = "Mago";
                    descricao = " Um mago pode ser uma escolha poderosa para jogadores que gostam de conjurar magia e causar grandes danos de longe. \n"
                            + "Eles também podem curar aliados e manipular o ambiente.";
                } else if (escolha_classe == 3) {
                    classe = "Arqueiro";
                    descricao = "Arqueiro: Um arqueiro é um especialista em combate a distância que usa um arco e flechas para atacar seus inimigos com precisão. \n"
                            + "Eles são ágeis e podem se mover rapidamente pelo campo de batalha, tornando-se difíceis de atingir.";
                } else {
                    System.out.println("ERror, resposta invalida tente novamente.");
                }

                if (escolha_classe == 1 || escolha_classe == 2 || escolha_classe == 3) {

                    System.out.println("" + barra.repeat(30));
                    System.out.printf("Voce escolheu a classe " + classe + "," + descricao + "\n");
                    System.out.printf("Voce é " + nome + " o " + classe + "? (1- sim 2- não)\n");

                    while (!scanner_verifica_classe.hasNextInt()) {;
                        System.out.println("Entrada inválida! Digite um número entre 1 e 3. ");
                        scanner_verifica_classe.next(); // limpa a entrada inválida
                    }
                    confirma_classe = scanner_verifica_classe.nextInt();

                    if (confirma_classe == 2) {
                        System.out.println("Sem Problemas.");
                    } else if (escolha_classe != 1 && escolha_classe != 2) {
                        System.out.println("ERror, resposta invalida tente novamente.");
                    }
                }

                jogar = "nao";
                // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ confirma classe ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\ 
            }

            // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↑ Seção Criar Personagens ↑=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\    
        }

        Scanner input_historia = new Scanner(System.in);
        System.out.println("" + barra.repeat(30));
        System.out.println("Espero que esteja preparado para finalmente começar o nosso RPG!!!");
        System.out.println("Pressione enter para iniciar o nosso jogo.");
        String comecar = input_historia.nextLine();

        System.out.println(
                "" + barra.repeat(21));
        System.out.println(
                "| Confira o Github dos nossos Devs       |");
        System.out.println(
                "| viniciuszile                           |");
        System.out.println(
                "| janainaacosta                          |");
        System.out.println(
                "| wesleww                                |");
        System.out.println(
                "| RodrigoAnjos2004                       |");
        System.out.println(
                "| Obrigado por Entrar no nosso jogo!!    |");
        System.out.println(
                "" + barra.repeat(21));
    }
}
