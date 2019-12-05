package com.POOProject;

public class Capeias extends Tourada {
    private int bilhete = 0;
    private int total = 0;
    private String local;

    public Capeias(Tourada t, Local l) {
        super(t.getAssistencia(),t.getNomeEvento(),t.getDATA());
        this.total = t.getAssistencia();
        this.local = l.getLocalidade();
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

    @Override
    public String toString() {
        return "Capeia{" + "Tourada:" + super.getNomeEvento() +",  \n Local:"+this.local+ ", \n Total de Bilhetes=" + this.bilhete+ "\n Data:"+super.getDATA()+'}';
    }


    
}
