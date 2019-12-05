package com.POOProject;

import java.util.Arrays;

public class Local {
    private int DATA[];
    private int Nvezes;
    private String localidade;

    public Local(String localidade) {
        DATA = new int[3];
        Nvezes = 0;
        this.localidade = localidade;
    }

    public int getNvezes() {
        return Nvezes;
    }

    public void setNvezes(int nvezes) {
        Nvezes = nvezes;
    }

    public int[] getDATA() {
        return DATA;
    }

    public void setDATA(int[] DATA) {
    for(int i = 0; i<DATA.length;i++) this.DATA[i] = DATA[i];
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
                Arrays.equals(DATA, local.DATA) &&
                localidade.equals(local.localidade);
    }
    @Override
    public String toString() {
        return "Local{" +
                "DATA=" + Arrays.toString(DATA) +
                ", Nvezes=" + Nvezes +
                ", localidade='" + localidade + '\'' +
                '}';
    }

}
