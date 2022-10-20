package model;

import java.io.Serializable;
import java.util.List;

public class Estado implements Serializable {

    private static final long serialVersionUID=1L;

    private String nome;

    private String sigla;

    private List<Cidade> cidades;

    public Estado() {
    }

    public Estado(String nome, String sigla, List cidades) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidades = cidades;
    }


    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", cidades='" + cidades + '\'' +
                '}';
    }
}
