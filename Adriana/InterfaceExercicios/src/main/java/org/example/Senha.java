package org.example;

public class Senha {
    private static final int SENHA_CORRETA = 1234;

    public boolean validar(int senhaDigitada) {
        return senhaDigitada == SENHA_CORRETA;
    }
}