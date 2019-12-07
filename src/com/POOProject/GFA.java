package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class GFA extends Entidade implements Serializable {
    private Local terra;
    private String Fcara;
    private static int nVezes;

    public GFA(String nome, int IDADE, Local terra, String Fcara){
        super(nome,IDADE);
        this.terra = terra;
        this.Fcara = Fcara;
        nVezes++;
    }

    public void setFcara(String fcara) {
        this.Fcara = fcara;
    }

    public void setTerra(Local terra) {
        this.terra = terra;
    }

    public String getFcara() {
        return Fcara;
    }

    public Local getTerra() {
        return terra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GFA)) return false;
        if (!super.equals(o)) return false;
        GFA gfa = (GFA) o;
        return (Objects.equals(terra, gfa.terra) && Objects.equals(Fcara, gfa.Fcara));
    }

    @Override
    public String toString() {
        return "GFA{" +
                "terra=" + terra +
                ", nome='" + nome + '\'' +
                ", IDADE=" + IDADE + '\'' +
                ", Forcado de Cara=" + Fcara +
                '}';
    }

    public void nGFA(){
        System.out.println("Existem " + nVezes + " grupos de forcados amadores"); //Quantidade de objectos GFA
    }

    public static Comparator<GFA> compareGFAbyNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());

    public ArrayList<GFA> sortGFAByName(ArrayList<GFA> A) {
        Collections.sort(A, GFA.compareGFAbyNome);
        return A;
    }
}


