package be.senai.sp.jandira.imcacademy.model;

import java.util.Scanner;

public class ImcCalculadora {

    String nomeDoAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imc;
    String classificacaoImc;


    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("*** CALCULADORA DE IMC ***");
        System.out.println("--------------------------");
        System.out.println(" ");

        //Obtendo o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        nomeDoAluno = leitor.nextLine();

        //Obtendo o peso do aluno
        System.out.print("Digite o peso (em kg): ");
        pesoDoAluno = leitor.nextDouble();

        //Obtendo a altura do aluno
        System.out.print("Digite a altura (em metros): ");
        alturaDoAluno = leitor.nextDouble();

        calcularImcDoAluno();
        exibirResultados();

    }

    public void calcularImcDoAluno() {
        imc = pesoDoAluno / (alturaDoAluno * alturaDoAluno);

        if (imc < 18.6) {
            classificacaoImc = "Abaixo do peso";
        } else if (imc >= 18.6 && imc < 25) {
            classificacaoImc = "Peso ideal (ou Saudável)";
        } else if (imc >= 25 && imc < 30) {
            classificacaoImc = "Levemente acima do peso";
        } else if (imc >= 30 && imc < 35) {
            classificacaoImc = "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            classificacaoImc = "Obesidade grau II (severa)";
        } else {
            classificacaoImc = "Obesidade grau III (mórbida)";
        }

    }

    public void exibirResultados() {
        String imcDoisDigitos = String.format("%.2f", imc);
        System.out.println(" ");
        System.out.println("-----------RESULTADO-----------");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("IMC Calculado: " + imcDoisDigitos);
        System.out.println("Status: " + classificacaoImc);
        System.out.println("--------------------------------");
    }

}
