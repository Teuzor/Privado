package org.example;

public class DivisaoCamelos {
    private int camelosHeranca;
    private static final int CAMELO_BEREMIZ = 1;

    public DivisaoCamelos(int camelosHeranca) {
        this.camelosHeranca = camelosHeranca;
    }

    public int getTotalCamelos() {
        return camelosHeranca + CAMELO_BEREMIZ;
    }

    public int getIrmao1() {
        return getTotalCamelos() / 2;
    }

    public int getIrmao2() {
        return getTotalCamelos() / 3;
    }

    public int getIrmao3() {
        return getTotalCamelos() / 9;
    }

    public int getTotalDistribuido() {
        return getIrmao1() + getIrmao2() + getIrmao3();
    }

    public int getSobras() {
        return getTotalCamelos() - getTotalDistribuido();
    }
}