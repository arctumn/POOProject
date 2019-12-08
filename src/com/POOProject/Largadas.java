package com.POOProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class Largadas extends Tourada implements Serializable {
    private String local;
    private ArrayList<Ganadaria> ga;
    public Largadas(Tourada t, Local l) {
        super(t.getAssistencia(),t.getDATA(),t.getNomeEvento());
        this.local = l.getLocalidade();
        ga = new ArrayList<>();
    }

    public ArrayList<Ganadaria> getGa() {
        return ga;
    }

    public void setGa(ArrayList<Ganadaria> ga) {
        this.ga = ga;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Largadas{" +
                "local='" + local + '\'' +
                ", ga=" + ga +
                ", assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }

    public static Comparator<Largadas> compareLargadasbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());

}
