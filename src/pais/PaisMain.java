package pais;

import java.util.ArrayList;
import java.util.List;

public class PaisMain {
    public static void main(String[] args) {
        List<String> vizinhosBrasil = new ArrayList<>();
        vizinhosBrasil.add("Argentina");
        vizinhosBrasil.add("Peru");

        Pais pais = new Pais("Brasil", 300, vizinhosBrasil);
        System.out.println(pais.getNome());
        System.out.println("A argentina fraz froenteira: " + pais.verificacaoFronteira("Peru"));

    }
}
