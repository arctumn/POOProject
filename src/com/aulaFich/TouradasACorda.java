package com.aulaFich;

public class TouradasACorda extends Tourada {
    public TouradasACorda(int assistencia, String data, String nomeEvento) {
        super(assistencia, data, nomeEvento);
    }

    @Override
    public String toString() {
        return "TouradasACorda{" +
                "assistencia=" + assistencia +
                ", DATA='" + DATA + '\'' +
                ", NomeEvento='" + NomeEvento + '\'' +
                '}';
    }
}
