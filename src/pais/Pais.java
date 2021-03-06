package pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String codigoIso;
    private String nomeDoPais;
    private double populacao;
    private double dimensao;
    private List<String> listaVizinhos = new ArrayList<>();

    public Pais(String codigoIso, String nomeDoPais, double populacao, double dimensao, List<String> listaVizinhos) {
        this.codigoIso = codigoIso;
        this.nomeDoPais = nomeDoPais;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.listaVizinhos = listaVizinhos;
    }


    public void status() {
        System.out.println("\n--------------------------------");
        System.out.println("Informa??es referente ao pa?s: ");
        System.out.println("--------------------------------");
        System.out.println("C?digo ISO: " + getCodigoIso() + "\nNome do pais: " + getNomeDoPais() +
                "\nN?mero populacional: " + getPopulacao() + " milh?es de habitantes " + "\nDimens?o: "
                + getDimensao() + " km?");
        System.out.printf("A sua densidade demogr?fica ? de: %.2f km?", this.densidadeDemografica());
    }


    public boolean verificacaoFronteira(String nomePais) {
        if (listaVizinhos.contains(nomePais)) {
            return true;
        } else {
            return false;
        }

    }

    public double densidadeDemografica() {
        return this.populacao / this.dimensao;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNomeDoPais() {
        return nomeDoPais;
    }

    public void setNomeDoPais(String nomeDoPais) {
        this.nomeDoPais = nomeDoPais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<String> getListaVizinhos() {
        return listaVizinhos;
    }

    public void setListaVizinhos(List<String> listaVizinhos) {
        this.listaVizinhos = listaVizinhos;
    }


}

