package org.example;

public class Multiplo {
    private float numero1;
    private float numero2;

    public Multiplo(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public boolean eDivisivel() {
        if (numero2 == 0) return false;
        return numero1 % numero2 == 0;
    }
}