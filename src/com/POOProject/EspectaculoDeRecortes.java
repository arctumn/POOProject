package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class EspectaculoDeRecortes extends Tourada implements Serializable {
    private int bilhete = 0;
    private int total = 0;
    private String local;
    private  ArrayList<Toiros> toiros = new ArrayList<>();
    private ArrayList<Ganadaria> ga = new ArrayList<>();
    public EspectaculoDeRecortes(Tourada t, Local l, Ganadaria g,Toiros toiro) {
        super(t.getAssistencia(),t.getDATA(),t.getNomeEvento());
        this.total = t.getAssistencia();
        this.local = l.getLocalidade();
        ga.add(g);
        toiros.add(toiro);
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Toiros> getToiros() {
        return toiros;
    }

    public void setToiros(ArrayList<Toiros> toiros) {
        this.toiros = toiros;
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

    public void setLocal(String local) {
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
                ", toiros=" + toiros +
                ", ga=" + ga +
                ", assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }

    public static Comparator<EspectaculoDeRecortes> compareEspectaculoDeRecortesbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());
}
