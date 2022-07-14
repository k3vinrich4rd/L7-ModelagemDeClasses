package pais;

import java.util.ArrayList;
import java.util.List;

public class PaisMain {
    public static void main(String[] args) {
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
        brasil.statusBrasil();
        System.out.printf("A sua densidade demogr�fica � de: %.2f km�\n", brasil.densidadeDemografica());
        System.out.println("O Brasil tem fronteira com a Argentina? " + brasil.verificacaoFronteira("Argentina"));

        List<String> vizinhosArgentina = new ArrayList<>();
        Pais argentina = new Pais("AR","Argentina",45.38,2.780,vizinhosArgentina);
        vizinhosArgentina.add("Brasil");
        vizinhosArgentina.add("Uruguai");
        vizinhosArgentina.add("Paraguai");
        vizinhosArgentina.add("Bol�via");
        vizinhosArgentina.add("Chile");
        argentina.statusArgentina();
        System.out.printf("A sua densidade demogr�fica � de: %.2f km�\n", argentina.densidadeDemografica());
        System.out.println("A Argentina tem fronteira com o Brasil? " + argentina.verificacaoFronteira("Brasil"));

        List<String> vizinhosParaguai = new ArrayList<>();
        Pais paraguai = new Pais("PRY","Paraguai", 63.4, 4.06,vizinhosParaguai);
        vizinhosParaguai.add("Argentina");
        vizinhosParaguai.add("Bol�via");
        vizinhosParaguai.add("Brasil");
        paraguai.statusParaguai();
        System.out.printf("A sua densidade demogr�fica � de: %.2f km�\n", paraguai.densidadeDemografica());
        System.out.println("O Paraguai faz fronteira com a Bol�via? " + paraguai.verificacaoFronteira("Bol�via"));

        List<String> vizinhosBolivia = new ArrayList<>();
        Pais bolivia = new Pais("BOL", "Bol�via",12.57, 1.09,vizinhosBolivia);
        vizinhosBolivia.add("Argentina");
        vizinhosBolivia.add("Brasil");
        vizinhosBolivia.add("Paraguai");
        vizinhosBolivia.add("Peru");
        vizinhosBolivia.add("Chile");
        bolivia.statusBolivia();
        System.out.printf("A sua densidade demogr�fica � de: %.2f km�\n", bolivia.densidadeDemografica());
        System.out.println("A Bol�via faz fronteira com o Uruguai? " + bolivia.verificacaoFronteira("Uruguai"));

    }
}
