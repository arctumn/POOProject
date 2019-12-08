package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class Capeias extends Tourada implements Serializable {
    private int bilhete = 0;
    private int total = 0;
    private String local;
    private ArrayList<Toiros> toiros = new ArrayList<>();
    private ArrayList<GFA> gfa = new ArrayList<>();
    private ArrayList<Ganadaria> ga = new ArrayList<>();
    public Capeias(Tourada t, Local l, GFA g1, Ganadaria ga1, Toiros t1) {
        super(t.getAssistencia(),t.getDATA(),t.getNomeEvento());
        this.total = t.getAssistencia();
        this.local = l.getLocalidade();
        gfa.add(g1);
        ga.add(ga1);
        toiros.add(t1);
        //esses ainda nao estao implementados nas outras classes portanto desativei no contrutor
    }

    public ArrayList<Toiros> getToiros() {
        return toiros;
    }

    public void setToiros(ArrayList<Toiros> toiros) {
        this.toiros = toiros;
    }

    public ArrayList<GFA> getGfa() {
        return gfa;
    }

    public void setGfa(ArrayList<GFA> gfa) {
        this.gfa = gfa;
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

    public void setTotal(int total) {
        this.total = total;
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
        }else System.out.println("Nao temos bilhetes suficientes");
       
    }
    public void removerbilhete(int n){
        int aux = this.bilhete-n;
        if (aux <= this.total && aux>0) {
            this.bilhete=this.bilhete-n;
        }else System.out.println("Nao tem mais bilhetes para remover");
       
    }
    public void percentagem() {
        int aux = (this.bilhete / this.total) * 100;
        System.out.println("A assistência foi de " + aux + "%");
    }

    @Override
    public String toString() {
        return "Capeias{" +
                "bilhete=" + bilhete +
                ", total=" + total +
                ", local='" + local + '\'' +
                ", toiros=" + toiros +
                ", gfa=" + gfa +
                ", ga=" + ga +
                ", assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }

    public static Comparator<Capeias> compareCapeiasbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());
    
}
