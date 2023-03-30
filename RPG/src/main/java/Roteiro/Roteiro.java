/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roteiro;

/**
 *
 * @author Zile
 */
public class Roteiro {

    public static void main(String[] args) {

        String classe = "guerreiro"; //variavel que salva a classe do jogador
        String nome = "zile";

        String situacao1_p1 = "";
        String situacao2_p1 = "";

        String situacao1_p2 = "";

        String situacao1_p3 = "";

        String situacao1_p5 = "";
        String situacao2_p5 = "";

        if (classe.equals("guerreiro")) {
            situacao1_p1 = "informações sobre uma espada lendaria de Excalibur a lendária espada do Rei Arthur, que segundo a lenda, \nfoi forjada em uma ilha mística e concedia poderes mágicos ao seu portador.\n";
            situacao2_p1 = "depois de vagar por horas pela vila, dentro de uma taverna ele comprou um mapa que supostamente daria informaçoes sobre a tal espada,\nporem repentinamente goblins atacaram a taverna.";

            situacao1_p2 = "um globin que havia sobrevivido acaba pegando o mapa da espada Excalibur e fugido para dentro \nde "
                    + "uma floresta misteriosa.\n";

            situacao1_p3 = "pilhas e pilhas de tesouros em uma destas pilhas voce avista o seu mapa roubado.\n";

            situacao1_p5 = "o tesouro encontrado na caverno junto do seu mapa";
            situacao2_p5 = "da lendaria espada Excalibur, porem agora com o mapa em mãos.";

        } else if (classe.equals("mago")) {
            situacao1_p1 = "informções sobre o lendario livro de Grimoire of Armadel um livro de magia cerimonial escrito\nno século XVII que inclui invocações de anjos e demônios, existem um total de 3 livros.\n";
            situacao2_p1 = "depois de vagar horas pela vila, dentro de uma bilbioteca antiga ele encontrou um livro com certas infomações sobre o livro, porem repentinamente\ngoblins atacaram a biblioteca.\n";

            situacao1_p2 = "um globin que havia sobrevivido acaba pegando o lendario livro de Grimoire of Armadel e fugido\n"
                    + "para dentro de uma floresta misteriosa.\n";

            situacao1_p3 = "pilhas e pilhas de tesouros, em uma destas pilhas voce avista o seu livro roubado.\n";

            situacao1_p5 = "o tesouro encontrado na caverno junto do seu livro";
            situacao2_p5 = "dos lendarios livros de Grimoire of Armadel, agora faltam apenas 2 livros para ele completar seu objetivo.";

        } else if (classe.equals("arqueiro")) {
            situacao1_p1 = "informações sobre o lendario arco The Full Moon Bow é feito de madeira da árvore mais antiga\n"
                    + "da floresta e é capaz de aumentar a precisão do arqueiro sob a luz da lua cheia. Diz-se que foi criada por um arqueiro excepcionalmente habilidoso que aprimorou sua técnica de tiro com arco\n"
                    + "ao longo de toda a sua vida.";

            situacao2_p1 = "depois de vagar por horas pela vila, ele chegou no armeiro da vila ele encontrou o mapa que supostamente levaria ele\n"
                    + "ao lendario arco, porem repentinamente goblins atacaram o armeiro.";

            situacao1_p2 = "um globin que havia sobrevivido acaba pegando o mapa do arco lendário The Full Moon Bow e fugido\n"
                    + "para dentro de uma floresta misteriosa.\n";

            situacao1_p3 = "pilhas e pilhas de tesouros, em uma destas pilhas voce avista o seu mapa roubado.\n";

            situacao1_p5 = "lendario arco lendário The Full Moon Bow,porem agora com o mapa em mãos.";
            situacao2_p5 = "do lendario arco da lua, porem agora com o mapa em mãos.";
        }

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 1 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("Era uma vez um aventureiro solitário chamado " + nome + ", que vagava pelas estradas em busca de " + situacao1_p1 + " Ele havia chegado a pequena vila de Stonehill, "
                + "" + situacao2_p1+ " " + nome + ", com seu instinto de herói, rapidamente se juntou aos habitantes da vila para enfrentar os invasores.");

        System.out.println("\n");
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓combate com goblins↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 2 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("Depois de uma batalha árdua, " + nome + " e os habitantes da vila conseguiram derrotar os goblins. Porém " + situacao1_p2 + "a vitória foi amarga mas com a ajuda dos habitantes da vila " + nome + " descobriram que os goblins "
                + "foram enviados por um troll temível que protegia a entrada de uma caverna misteriosa que\n"
                + "ficava floresta a dentro.");
        System.out.println("\n");

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 3 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("" + nome + " entao explorou a floresta em busca da tal caverna que o troll protegia, depois de uma longa caminhada floresta a dentro " + nome + " avistou goblins junto de um enorme troll\n"
                + "levando " + situacao1_p3 + "curioso em saber quais mais tesouros o troll guardava dentro daquela misteriosa caverna,voce decide enfrentalo para recuperar seus itens roubados e descobrir\n"
                + "quais segredos a caverna guarda.");
        System.out.println("\n");
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓combate com troll↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \

        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓ Paragrafo 4 ↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \\
        System.out.println("Depois de uma das batalhas mais épicas de sua vida," + nome + " não imaginava o que o aguardava dentro da caverna. Após descansar e se recuperar dos ferimentos por algumas horas, " + nome + " decide finalmente\n"
                + "entrar na caverna. Conforme avança, o ar vai ficando mais quente e escasso. Um dos diversos caminhos da caverna chama sua atenção está repleto de tesouros completamente derretidos.\n"
                + "Isso parece muito estranho e" + nome + "começa a seguir a trilha que os tesouros formam. No final da trilha, ele encontra algo incrível: um terrível e enorme dragão deitado sobre uma montanha\n"
                + "de ouro e tesouros. Rapidamente, o dragão avista " + nome + " e parte para cima dele. Não há escapatória você terá que enfrentar o terrível dragão.");
        System.out.println("\n");
        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-↓combate com o dragao↓=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- \

        System.out.println("Com " + situacao1_p5 + " " + nome + " retornou à vila de Stonehill e como forma de agradecimento " + nome + " entrega todo o tesouro encontrado,\n"
                + "na caverna junto da cabeça do dragão deixando todos habitantes agradecidos. Sua coragem e dedicação tornaram-no um herói na vila, e sua fama se espalhou por todo o reino. " + nome + " continuou\n"
                + "sua jornada em busca " + situacao2_p5 + " ,mas a lembrança de sua vitória contra os goblins, o troll e o dragão permaneceu viva em sua memória para sempre.");
    }
}
