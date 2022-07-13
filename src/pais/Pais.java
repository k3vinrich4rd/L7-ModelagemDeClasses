package pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private int populacao;
    private List<String> listaVizinhos = new ArrayList<>();

    public Pais(String nome, int populacao, List<String> listaVizinhos) {
        this.nome = nome;
        this.populacao = populacao;
        this.listaVizinhos = listaVizinhos;


    }

    public boolean verificacaoFronteira(String nomePais){
        if(listaVizinhos.contains(nomePais)) {
            return true;
        }else {
            return false;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}

