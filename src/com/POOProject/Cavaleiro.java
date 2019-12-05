package com.POOProject;

import java.util.Objects;

public class Cavaleiro extends Entidade {
    private Local terra;
    private static int nVezes;

    public Cavaleiro(String nome, int IDADE, Local terra) {
        super(nome, IDADE);
        nVezes++;
        this.terra = terra;
    }

    public Local getTerra() {
        return terra;
    }

    public void setTerra(Local terra) {
        this.terra = terra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cavaleiro)) return false;
        if (!super.equals(o)) return false;
        Cavaleiro cavaleiro = (Cavaleiro) o;
        return Objects.equals(terra, cavaleiro.terra);
    }

    @Override
    public String toString() {
        return "Cavaleiro{" +
                "terra=" + terra +
                ", nome='" + nome + '\'' +
                ", IDADE=" + IDADE +
                '}';
    }
    public void numeroCavaleiros(){
        System.out.println(nVezes);
    }
}
