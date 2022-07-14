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
        vizinhosBrasil.add("Bolívia");
        vizinhosBrasil.add("Peru");
        vizinhosBrasil.add("Colômbia");
        vizinhosBrasil.add("Venezuela");
        vizinhosBrasil.add("Guiana");
        vizinhosBrasil.add("Guiana Francesa");
        vizinhosBrasil.add("Suriname");
        brasil.statusBrasil();
        System.out.printf("A sua densidade demográfica é de: %.2f km²\n", brasil.densidadeDemografica());
        System.out.println("O Brasil tem fronteira com a Argentina? " + brasil.verificacaoFronteira("Argentina"));

        List<String> vizinhosArgentina = new ArrayList<>();
        Pais argentina = new Pais("AR","Argentina",45.38,2.780,vizinhosArgentina);
        vizinhosArgentina.add("Brasil");
        vizinhosArgentina.add("Uruguai");
        vizinhosArgentina.add("Paraguai");
        vizinhosArgentina.add("Bolívia");
        vizinhosArgentina.add("Chile");
        argentina.statusArgentina();
        System.out.printf("A sua densidade demográfica é de: %.2f km²\n", argentina.densidadeDemografica());
        System.out.println("A Argentina tem fronteira com o Brasil? " + argentina.verificacaoFronteira("Brasil"));

        List<String> vizinhosParaguai = new ArrayList<>();
        Pais paraguai = new Pais("PRY","Paraguai", 63.4, 4.06,vizinhosParaguai);
        vizinhosParaguai.add("Argentina");
        vizinhosParaguai.add("Bolívia");
        vizinhosParaguai.add("Brasil");
        paraguai.statusParaguai();
        System.out.printf("A sua densidade demográfica é de: %.2f km²\n", paraguai.densidadeDemografica());
        System.out.println("O Paraguai faz fronteira com a Bolívia? " + paraguai.verificacaoFronteira("Bolívia"));

        List<String> vizinhosBolivia = new ArrayList<>();
        Pais bolivia = new Pais("BOL", "Bolívia",12.57, 1.09,vizinhosBolivia);
        vizinhosBolivia.add("Argentina");
        vizinhosBolivia.add("Brasil");
        vizinhosBolivia.add("Paraguai");
        vizinhosBolivia.add("Peru");
        vizinhosBolivia.add("Chile");
        bolivia.statusBolivia();
        System.out.printf("A sua densidade demográfica é de: %.2f km²\n", bolivia.densidadeDemografica());
        System.out.println("A Bolívia faz fronteira com o Uruguai? " + bolivia.verificacaoFronteira("Uruguai"));

    }
}
