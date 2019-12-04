package com.aulaFich;

public class Tourada {
    protected int assistencia;
    protected String DATA;
    protected String NomeEvento;

    public Tourada(int assistencia, String data, String nomeEvento) {
        this.assistencia = assistencia;
        this.NomeEvento = nomeEvento;
        this.DATA = data;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tourada)) return false;
        Tourada tourada = (Tourada) o;
        return assistencia == tourada.assistencia &&
                DATA.equals(tourada.DATA) &&
                NomeEvento.equals(tourada.NomeEvento);
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
