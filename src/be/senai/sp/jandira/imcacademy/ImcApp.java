package be.senai.sp.jandira.imcacademy;

import be.senai.sp.jandira.imcacademy.model.ImcCalculadora;

public class ImcApp {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa...");

        ImcCalculadora calculadora = new ImcCalculadora();
        calculadora.obterDados();
    }
}
