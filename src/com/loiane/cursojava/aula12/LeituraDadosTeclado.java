package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args){
        metodo1();
        metodo2();
    }

    public static void metodo1 (){
        System.out.println("metodo1...");
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o nome");
        String nome = scan.nextLine();

        System.out.println("digite sua idade");
        int idade = scan.nextInt();

        System.out.println("digite sua altura");
        double altura = scan.nextDouble();

        printScreenData(nome, idade, altura);
    }

    public static void metodo2 (){
        System.out.println("metodo1...");
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o nome, idade e altura");
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();

        printScreenData(nome, idade, altura);
    }

    public static void printScreenData(String nome, int idade, double altura){
        System.out.println("\nSeus dados são...");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("\n");
    }


}
