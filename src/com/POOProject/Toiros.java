package com.POOProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Toiros {
    private String nome;
    private int peso;
    private static int nT = 0;
    private int idade;

    public Toiros(String n, int p, int i){
        this.nome = n;
        this.peso = p;
        this.idade = i;
        nT++;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public static int getnT() {
        return nT;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void setnT(int nT) {
        Toiros.nT = nT;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Toiros{" + "Nome:" + nome + ", peso: " + peso + ", quantidade de Toiros:" + nT + ", idade:" + idade + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toiros)) return false;
        Toiros toiros = (Toiros) o;
        return peso == toiros.peso &&
                idade == toiros.idade &&
                nome.equals(toiros.nome);
    }

    public static Comparator<Toiros> compareToirosbyNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());
    public ArrayList<Toiros> sortToirosByName(ArrayList<Toiros> A){
        A.sort(Toiros.compareToirosbyNome);
        return A;
    }
}

// Comentário para dar push