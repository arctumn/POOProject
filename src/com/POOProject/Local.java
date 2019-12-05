package com.POOProject;

import java.util.*;

public class Local {
    private int Nvezes;
    private String localidade;

    public Local(String localidade) {
        Nvezes = 0;
        this.localidade = localidade;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Local)) return false;
        Local local = (Local) o;
        return Nvezes == local.Nvezes &&
                Objects.equals(localidade, local.localidade);
    }
    public  boolean exists(){
        return true;
    }
    @Override
    public String toString() {
        return "Local{" +
                "Nvezes=" + Nvezes +
                ", localidade='" + localidade + '\'' +
                '}';
    }

    public static Comparator<Local> compareLocalbyNome = (o1, o2) -> o1.getLocalidade().compareTo(o2.getLocalidade());
    public ArrayList<Local> sortEmpregadoByName(ArrayList<Local> A){
        A.sort(Local.compareLocalbyNome);
        return A;
    }

}
