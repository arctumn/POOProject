package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Cavaleiro extends Entidade  implements Serializable {
    private Local terra;
    private static int nVezes;
    private int nEspetaculos;

    public Cavaleiro(String nome, int IDADE, Local terra, int nEspetaculos) {
        super(nome, IDADE);
        nVezes++;
        this.terra = terra;
        this.nEspetaculos = nEspetaculos;
    }

    public int getnEspetaculos(){
        return nEspetaculos;
    }

    public void setnEspetaculos(int nEspetaculos) {
        this.nEspetaculos = nEspetaculos;
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
        return (Objects.equals(terra, cavaleiro.terra) && Objects.equals(nEspetaculos, cavaleiro.nEspetaculos));
    }

    @Override
    public String toString() {
        return "Cavaleiro{" +
                "terra=" + terra +
                ", nome='" + nome + '\'' +
                ", IDADE=" + IDADE + '\'' +
                ", Quantidade de Espetáculos=" + nEspetaculos +
                '}';
    }

    public void numeroCavaleiros() {
        System.out.println("Numero de cavaleiros existentes: " + nVezes);
    }

    public static Comparator<Cavaleiro> compareCavaleirobyNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());

    public ArrayList<Cavaleiro> sortCavaleiroByName(ArrayList<Cavaleiro> A) {
        Collections.sort(A, Cavaleiro.compareCavaleirobyNome);
        return A;
    }
}
