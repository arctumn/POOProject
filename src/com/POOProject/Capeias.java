package com.POOProject;

public class Capeias extends Tourada {
    public Capeias(int assistencia, String data, String nomeEvento) {
        super(assistencia, data, nomeEvento);
    }

    @Override
    public String toString() {
        return "Capeias{" +
                "assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }
}
