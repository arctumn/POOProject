package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class Corridas extends Tourada implements Serializable {
    private int bilhete = 0;
    private int total = 0;
    private String local;
    private ArrayList<Toiros> toiros = new ArrayList<>();
    private ArrayList<Ganadaria> ga = new ArrayList<>();
    private ArrayList<GFA> gfa = new ArrayList<>();
    private ArrayList<Cavaleiro> ca = new ArrayList<>();
    public Corridas(Tourada t, Local l, GFA g1, Cavaleiro c,Ganadaria ga1,Toiros t1) {
        super(t.getAssistencia(),t.getDATA(),t.getNomeEvento());
        this.total = t.getAssistencia();
        this.local = l.getLocalidade();
        ca.add(c);
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

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Ganadaria> getGa() {
        return ga;
    }

    public void setGa(ArrayList<Ganadaria> ga) {
        this.ga = ga;
    }

    public ArrayList<GFA> getGfa() {
        return gfa;
    }

    public void setGfa(ArrayList<GFA> gfa) {
        this.gfa = gfa;
    }

    public ArrayList<Cavaleiro> getCa() {
        return ca;
    }

    public void setCa(ArrayList<Cavaleiro> ca) {
        this.ca = ca;
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
        }else System.out.println("Nao temos bilhetes suficientes");
       
    }
    public void removerbilhete(int n){
        int aux = this.bilhete-n;
        if (aux <= this.total && aux>0) {
            this.bilhete=this.bilhete-n;
        }else System.out.println("Nao tem mais bilhetes para remover");
       
    }
    public void percentagem(){
        int aux = (this.bilhete/this.total)*100;
        System.out.println("A assistência foi de "+aux+"%");
    }

    @Override
    public String toString() {
        return "Corridas{" +
                "bilhete=" + bilhete +
                ", total=" + total +
                ", local='" + local + '\'' +
                ", ga=" + ga +
                ", gfa=" + gfa +
                ", ca=" + ca +
                ", assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                ", Toiros='" + toiros + '\'' +
                '}';
    }

    public static Comparator<Corridas> compareCorridasbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());
    
}
