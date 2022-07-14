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
        System.out.println("A Argentina divide territ�rio com o brasil? " + brasil.verificacaoFronteira("Argentina"));


    }
}
