package com.POOProject;

import java.io.Serializable;
import java.util.Objects;

public class Tourada implements Serializable {
    protected int assistencia;
    protected String DATA;
    protected String NomeEvento;
    protected int nDeTouradas;

    public Tourada(int assistencia, String data, String nomeEvento) {
        this.assistencia = assistencia;
        this.NomeEvento = nomeEvento;
        this.DATA = data;
        nDeTouradas++;
    }
    public int getAssistencia() {
        return assistencia;
    }

    public void setAssistencia(int assistencia) {
        this.assistencia = assistencia;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public String getNomeEvento() {
        return NomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        NomeEvento = nomeEvento;
    }

    public int getnDeTouradas() {
        return nDeTouradas;
    }

    public void setnDeTouradas(int nDeTouradas) {
        this.nDeTouradas = nDeTouradas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tourada)) return false;
        Tourada tourada = (Tourada) o;
        return assistencia == tourada.assistencia &&
                nDeTouradas == tourada.nDeTouradas &&
                Objects.equals(DATA, tourada.DATA) &&
                Objects.equals(NomeEvento, tourada.NomeEvento);
    }

    @Override
    public String toString() {
        return "Tourada{" +
                "assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }
}
