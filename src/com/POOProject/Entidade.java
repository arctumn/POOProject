package com.POOProject;

import java.io.Serializable;
import java.util.Objects;

public class Entidade implements Serializable {
    protected String nome;
    protected int IDADE; //idade pode ser o ano de formaçao ou a idade

    public Entidade(String nome, int IDADE) {
        this.nome = nome;
        this.IDADE = IDADE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIDADE() {
        return IDADE;
    }

    public void setIDADE(int IDADE) {
        this.IDADE = IDADE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entidade)) return false;
        Entidade entidade = (Entidade) o;
        return IDADE == entidade.IDADE &&
                Objects.equals(nome, entidade.nome);
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "nome='" + nome + '\'' +
                ", IDADE=" + IDADE +
                '}';
    }
}
