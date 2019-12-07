package com.POOProject;

import java.io.Serializable;
import java.util.Comparator;

public class TouradasACorda extends Tourada implements Serializable {
    private String local;

    public TouradasACorda(Tourada t, Local l) {
        super(t.getAssistencia(),t.getDATA(),t.getNomeEvento());
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
        return "TouradasACorda{" +
                "local='" + local + '\'' +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }

    public static Comparator<TouradasACorda> compareTouradasACordabyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());

}