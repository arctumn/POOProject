package com.POOProject;

import java.io.Serializable;
import java.util.Comparator;

public class Largadas extends Tourada implements Serializable {
    private String local;

    public Largadas(Tourada t, Local l) {
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
        return "Largadas{" +
                "local='" + local + '\'' +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                ", nDeTouradas=" + nDeTouradas +
                '}';
    }

    public static Comparator<Largadas> compareLargadasbyNome = (o1, o2) -> o1.getNomeEvento().compareTo(o2.getNomeEvento());

}
