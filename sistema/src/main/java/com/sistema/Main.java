package com.sistema;

public class Main {
        public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double notaPrimeiroBimestre = 8;
        double notaSegundoBimestre = 7;

        double media = calcularMedia(notaPrimeiroBimestre, notaSegundoBimestre);
        boolean aprovado = verificarAprovacao(media);

        apresentarResultado(nomeAluno, media, aprovado);
    }

    // Calcula a média entre duas notas
    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // Considera aprovado quem tiver média maior ou igual a 6
    private static boolean verificarAprovacao(double media) {
        final double MEDIA_MINIMA = 6.0;
        return media >= MEDIA_MINIMA;
    }

    // Exibe os dados do aluno e o resultado final
    private static void apresentarResultado(String nomeAluno, double media, boolean aprovado) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(aprovado ? "Aprovado" : "Reprovado");
    }
}