package com.POOProject;

import java.util.*;

public class Local {
    private int Nvezes;
    private String localidade;
    private String pais;

    public Local(String localidade,String pais) {
        Nvezes = 0;
        this.localidade = localidade;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNvezes() {
        return Nvezes;
    }

    public void setNvezes(int nvezes) {
        Nvezes = nvezes;
    }


    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Local{" +
                "Nvezes=" + Nvezes +
                ", localidade='" + localidade + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Local)) return false;
        Local local = (Local) o;
        return Nvezes == local.Nvezes &&
                Objects.equals(localidade, local.localidade) &&
                Objects.equals(pais, local.pais);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static Comparator<Local> compareLocalbyNome = (o1, o2) -> o1.getLocalidade().compareTo(o2.getLocalidade());
    public ArrayList<Local> sortLocalByName(ArrayList<Local> A){
        A.sort(Local.compareLocalbyNome);
        return A;
    }

}
