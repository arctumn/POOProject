package com.POOProject;

import java.util.Comparator;

public class EspectaculoDeRecortes extends Tourada {
    private int bilhete = 0;
    private int total = 0;
    private String local;

    public EspectaculoDeRecortes(Tourada t, Local l) {
        super(t.getAssistencia(),t.getNomeEvento(),t.getDATA());
        this.total = t.getAssistencia();
        this.local = l.getLocalidade();
    }

    public EspectaculoDeRecortes(int assistencia, String data, String nomeEvento) {
        super(assistencia, data, nomeEvento);
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
    public void percentagem() {
        int aux = (this.bilhete / this.total) * 100;
        System.out.println("A assistência foi de " + aux + "%");
    }

    @Override
    public String toString() {
        return "EspectaculoDeRecortes{" +
                "bilhete=" + bilhete +
                ", total=" + total +
                ", local='" + local + '\'' +
                ", assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                ", nDeTouradas=" + nDeTouradas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof EspectaculoDeRecortes) ) return false;
        if ( !super.equals(o) ) return false;
        EspectaculoDeRecortes that = (EspectaculoDeRecortes) o;
        return bilhete == that.bilhete &&
                total == that.total &&
                local.equals(that.local);
    }

    public static Comparator<EspectaculoDeRecortes> compareEspectaculoDeRecortesbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());

}
