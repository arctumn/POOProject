package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class EspectaculoDeRecortes extends Tourada implements Serializable {
    private int bilhete = 0;
    private int total = 0;
    private String local;
    private ArrayList<Ganadaria> ga;
    public EspectaculoDeRecortes(Tourada t, Local l) {
        super(t.getAssistencia(),t.getDATA(),t.getNomeEvento());
        this.total = t.getAssistencia();
        this.local = l.getLocalidade();
        ga = new ArrayList<>();
    }

    public ArrayList<Ganadaria> getGa() {
        return ga;
    }

    public void setGa(ArrayList<Ganadaria> ga) {
        this.ga = ga;
    }

    public void setBilhete(int bilhete) {
        this.bilhete = bilhete;
    }

    public void setLocal1(String local) {
        this.local = local;
    }

    public int getBilhete() {
        return bilhete;
    }

    public int getTotal() {
        return total;
    }

    public String getLocal() {
        return local;
    }

    public void comprabilhete(int n){
        int aux = this.bilhete+n;
        if (aux <= this.total) {
            this.bilhete=this.bilhete+n;
            System.out.println("Comprou: "+n+" bilhetes");
        }else System.out.println("Nao temos bilhetes suficientes");

    }
    public void removerbilhete(int n){
        int aux = this.bilhete-n;
        if (aux <= this.total && aux>0) {
            this.bilhete=this.bilhete-n;
            System.out.println("Vendeu: "+n+" bilhetes");
        }else System.out.println("Nao tem mais bilhetes para remover");

    }
    public void percentagem() {
        int aux = (this.bilhete / this.total) * 100;
        System.out.println("A assistência atual é de " + aux + "%");
    }

    @Override
    public String toString() {
        return "EspectaculoDeRecortes{" +
                "bilhete=" + bilhete +
                ", total=" + total +
                ", local='" + local + '\'' +
                ", ga=" + ga +
                ", assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EspectaculoDeRecortes)) return false;
        if (!super.equals(o)) return false;
        EspectaculoDeRecortes that = (EspectaculoDeRecortes) o;
        return bilhete == that.bilhete &&
                total == that.total &&
                Objects.equals(local, that.local) &&
                Objects.equals(ga, that.ga);
    }

    public static Comparator<EspectaculoDeRecortes> compareEspectaculoDeRecortesbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());
}
