package com.POOProject;

import java.util.Comparator;

public class Largadas extends Tourada {
    private String local;

    public Largadas(Tourada t, Local l) {
        super(t.getAssistencia(),t.getNomeEvento(),t.getDATA());
        this.local = l.getLocalidade();
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Largada{" + "Tourada:" + super.getNomeEvento() +",  \n Local:"+this.local + "\n Data:"+super.getDATA()+'}';
    }

    public static Comparator<Largadas> compareLargadasbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());

}
