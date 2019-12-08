package com.POOProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Ganadaria {
    private String nome;
    private ArrayList<Toiros> toiros = new ArrayList<>();
    private static int nVezes = 0;
    private int qToiros; //Quantos toiros há nesta Ganadaria?
    private String Origem;

    public Ganadaria(String n, Toiros t, Local l){
        this.nome = n;
        nVezes++;
        this.Origem = l.getLocalidade();
        this.toiros.add(t);
        qToiros = toiros.size();
    }

    public String getNome() {
        return nome;
    }

    public int getqToiros() {
        return qToiros;
    }

    public String getOrigem() {
        return Origem;
    }

    public static int getnVezes() {
        return nVezes;
    }

    public ArrayList<Toiros> getToiros() {
        return toiros;
    }

    public void setqToiros(int qToiros) {
        this.qToiros = qToiros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setnVezes(int nVezes) {
        Ganadaria.nVezes = nVezes;
    }

    public void setOrigem(String origem) {
        Origem = origem;
    }

    public void setToiros(ArrayList<Toiros> toiros) {
        this.toiros = toiros;
    }

    @Override
    public String toString() {
        return "Ganadaria{" + "Nome:" + nome + ", Quantidade de Toiros:" + qToiros + ", Origem:" + Origem + "Toiros: " + toiros.toString() + '}';
    }

    public void numeroGanadarias() {
        System.out.println("Numero de ganadarias existentes: " + nVezes);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ganadaria)) return false;
        Ganadaria ga = (Ganadaria) o;
        return nVezes == ga.qToiros &&
                Objects.equals(nome, ga.nome) &&
                Objects.equals(toiros, ga.toiros) &&
                Objects.equals(Origem, ga.Origem);
    }

    public static Comparator<Ganadaria> compareGanadariabyNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());
    public ArrayList<Ganadaria> sortGanadariaByName(ArrayList<Ganadaria> A){
        A.sort(Ganadaria.compareGanadariabyNome);
        return A;
    }
}

// Comentário para dar push