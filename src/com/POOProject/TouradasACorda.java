package com.POOProject;

import java.io.Serializable;
import java.util.Comparator;

public class TouradasACorda extends Tourada implements Serializable {
    private String local;

    public TouradasACorda(Tourada t, Local l) {
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
        return "Tourada À Corda{" + "Tourada:" + super.getNomeEvento() +",  \n Local:"+this.local + "\n Data:"+super.getDATA()+'}';
    }

    public static Comparator<TouradasACorda> compareTouradasACordabyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());

}