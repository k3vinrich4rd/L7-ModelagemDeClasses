package pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaisMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite: (1 - Brasil)  /  (2 - Argentina)  /  (3 - Paraguai)  /  (4 - Bolivia)  /  (5 - Col�mbia)" +
                "\nQual pa�s voc� gostaria de conhecer: ");
        int numeroDeEscolha = input.nextInt();

        if (numeroDeEscolha == 1) {
            List<String> vizinhosBrasil = new ArrayList<>();
            Pais brasil = new Pais("BRA", "Brasil", 212.6, 8.516, vizinhosBrasil);
            vizinhosBrasil.add("Argentina");
            vizinhosBrasil.add("Uruguai");
            vizinhosBrasil.add("Paraguai");
            vizinhosBrasil.add("Bol�via");
            vizinhosBrasil.add("Peru");
            vizinhosBrasil.add("Col�mbia");
            vizinhosBrasil.add("Venezuela");
            vizinhosBrasil.add("Guiana");
            vizinhosBrasil.add("Guiana Francesa");
            vizinhosBrasil.add("Suriname");
            brasil.status();
            System.out.print("\nDigite um nome de um pa�s (sendo a primeira letra sendo mai�scula): ");
            Scanner entrada1 = new Scanner(System.in);
            String respostaDoUsuario = entrada1.next();
            System.out.println("O Brasil tem fronteira com " + respostaDoUsuario + " ? " + brasil.verificacaoFronteira(respostaDoUsuario));


        } else if (numeroDeEscolha == 2) {
            List<String> vizinhosArgentina = new ArrayList<>();
            Pais argentina = new Pais("ARG", "Argentina", 45.38, 2.780, vizinhosArgentina);
            vizinhosArgentina.add("Brasil");
            vizinhosArgentina.add("Uruguai");
            vizinhosArgentina.add("Paraguai");
            vizinhosArgentina.add("Bol�via");
            vizinhosArgentina.add("Chile");
            argentina.status();

            System.out.println("\nDigite um nome de um pa�s (sendo a primeira letra sendo mai�scula): ");
            Scanner entrada2 = new Scanner(System.in);
            String respostaDoUsuario2 = entrada2.next();
            System.out.print("A Argentina tem fronteira com " + respostaDoUsuario2 + " ? " + argentina.verificacaoFronteira(respostaDoUsuario2));

        } else if (numeroDeEscolha == 3) {
            List<String> vizinhosParaguai = new ArrayList<>();
            Pais paraguai = new Pais("PRY", "Paraguai", 63.4, 4.06, vizinhosParaguai);
            vizinhosParaguai.add("Argentina");
            vizinhosParaguai.add("Bol�via");
            vizinhosParaguai.add("Brasil");
            paraguai.status();
            System.out.print("\nDigite um nome de um pa�s (sendo a primeira letra sendo mai�scula): ");
            Scanner entrada3 = new Scanner(System.in);
            String respostaDoUsuario3 = entrada3.next();
            System.out.println("O Paraguai tem fronteira com " + respostaDoUsuario3 + " ? " + paraguai.verificacaoFronteira(respostaDoUsuario3));

        } else if (numeroDeEscolha == 4) {

            List<String> vizinhosBolivia = new ArrayList<>();
            Pais bolivia = new Pais("BOL", "Bol�via", 12.57, 1.09, vizinhosBolivia);
            vizinhosBolivia.add("Argentina");
            vizinhosBolivia.add("Brasil");
            vizinhosBolivia.add("Paraguai");
            vizinhosBolivia.add("Peru");
            vizinhosBolivia.add("Chile");
            bolivia.status();
            System.out.print("\nDigite um nome de um pa�s (sendo a primeira letra sendo mai�scula): ");
            Scanner entrada4 = new Scanner(System.in);
            String respostaDoUsuario4 = entrada4.next();
            System.out.println("A Bol�via tem fronteira com " + respostaDoUsuario4 + " ? " + bolivia.verificacaoFronteira(respostaDoUsuario4));

        } else if (numeroDeEscolha == 5) {

            List<String> vizinhosColombia = new ArrayList<>();
            Pais colombia = new Pais("COL", "Col�mbia", 51.88, 1.14, vizinhosColombia);
            vizinhosColombia.add("Brasil");
            vizinhosColombia.add("Equador");
            vizinhosColombia.add("Venezuela");
            vizinhosColombia.add("Peru");
            vizinhosColombia.add("Panam�");
            colombia.status();
            System.out.print("\nDigite um nome de um pa�s (sendo a primeira letra sendo mai�scula): ");
            Scanner entrada5 = new Scanner(System.in);
            String respostaDoUsuario5 = entrada5.next();
            System.out.println("A Col�mbia tem fronteira com " + respostaDoUsuario5 + " ? " + colombia.verificacaoFronteira(respostaDoUsuario5));


        } else {
            System.out.println("Resposta inv�lida");
        }
    }


}
