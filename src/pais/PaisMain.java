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
        System.out.println("A Argentina divide território com o brasil? " + brasil.verificacaoFronteira("Argentina"));


    }
}
