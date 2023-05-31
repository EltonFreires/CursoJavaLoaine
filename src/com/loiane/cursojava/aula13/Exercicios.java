package com.loiane.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){
//        questao01();
//        questao02();
//        questao03();
//        questao04();
//        questao05();

//        questao06();
//        questao07();
//        questao08();
//        questao09();
//        questao10();

//        questao11();
//        questao12();
//        questao13();
//        questao14();
//        questao15();

//        questao16();
        questao17();
//        questao18();
    }

    private static void printQuestao(String questao) {
        System.out.println("\nQuestão: " + questao);
    }

    private static double roudDouble(double value, int numberPlaces) {
        DecimalFormat df = new DecimalFormat();
        switch(numberPlaces) {
            case 0:
                df = new DecimalFormat("#0");
                break;
            case 1:
                df = new DecimalFormat("#0.0");
                break;
            case 2:
                df = new DecimalFormat("#0.00");
                break;
            default:
                // code block
        }
        return Double.parseDouble(df.format(value).replace(",","."));
    }

    private static void questao01() {
        printQuestao("01");
        System.out.println("alo mundo");
    }

    private static void questao02() {
        printQuestao("02");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe um número");
        int numero = scan.nextInt();
        System.out.println("o número é " + numero);
    }

    private static void questao03() {
        printQuestao("03");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o primeiro número");
        int numero = scan.nextInt();
        System.out.println("informe o segundo número");
        int numero2 = scan.nextInt();
        System.out.println("a soma é " + (numero + numero2));
    }

    private static void questao04() {
        printQuestao("04");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe a nota 1");
        int numero = scan.nextInt();
        System.out.println("informe a nota 2");
        numero = numero + scan.nextInt();
        System.out.println("informe a nota 3");
        numero = numero + scan.nextInt();
        System.out.println("informe a nota 4");
        numero = numero + scan.nextInt();

        System.out.println("a média é " + (numero/4));
    }

    private static void questao05() {
        printQuestao("05");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o valor em metros");
        double numero = scan.nextDouble();
        System.out.println(numero + " metros são " + (numero*100) + "cm");
    }

    private static void questao06() {
        printQuestao("06");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o raio do circulo");
        int raio = scan.nextInt();
        System.out.println("sua área é " + (Math.PI * Math.pow(raio, 2)));
    }

    private static void questao07() {
        printQuestao("07");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o comprimento do lado do quadrado");
        int raio = scan.nextInt();
        int area = raio * raio;
        System.out.println("sua área é " + area);
        System.out.println("o dobro da área é " + (2 * area));
    }

    private static void questao08() {
        printQuestao("08");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe a quantidade de horas trabalhadas no mes, e o que vc ganha por hora");
        double qtdHoras = scan.nextDouble();
        double valorHora = scan.nextDouble();

        System.out.println("voce ganha por mes " + (qtdHoras * valorHora));
    }

    private static void questao09() {
        printQuestao("09");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o grau em farenheit");
        double grauF = scan.nextDouble();
        double grauC = (5 * (grauF - 32) / 9);

        System.out.println("o valor em celcius é " + grauC);
    }

    private static void questao10() {
        printQuestao("10");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o grau em celcius");
        double grauC = scan.nextDouble();
        double grauF = (grauC * 1.8 + 32);

        System.out.println("o valor em farenheit é " + grauF);
    }

    private static void questao11() {
        printQuestao("11");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe o 2 números inteiros e um real");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double num3 = scan.nextDouble();

        System.out.println("o produto do dobro do primeiro com metade do segundo " + ((2 * num1) * (num2 / 2)));
        System.out.println("a soma do triplo do primeiro com o terceiro " + ((3 * num1) + num3));
        System.out.println("o terceiro elevado ao cubo " + (num3 * num3));
    }

    private static void questao12() {
        printQuestao("12");

        Scanner scan = new Scanner(System.in);
        System.out.println("informe a altura da pessoa");
        double altura = scan.nextDouble();

        System.out.println("o peso ideal é  " + ((72.7 * altura) - 58));
    }

    private static void questao13() {
        printQuestao("13");

        double pesoIdeal;
        System.out.println("informe a altura, sexo e o peso da pessoa");

        double altura = 1.6;
        String sexo = "m";
        double pesoPessoa = 57.2;

        System.out.println("altura: " + altura);
        System.out.println("sexo: " + sexo);
        System.out.println("pesoPessoa:" + pesoPessoa);

        if (sexo.equals("m")){ pesoIdeal = (72.7 * altura) - 58;
        }else{ pesoIdeal = (62.1 * altura) - 44.7; }
        pesoIdeal = Math.round(pesoIdeal * 100.0) / 100.0;
        System.out.println("\no peso ideal é  " + pesoIdeal);

        if ( Math.round(pesoPessoa) == Math.round(pesoIdeal)){
            System.out.println("dentro do peso");
        }else if (Math.round(pesoPessoa) > Math.round(pesoIdeal)){
            System.out.println("acima do peso");
        }else{
            System.out.println("abaixo do peso");
        }
    }

    private static void questao14() {
        printQuestao("14");

        double pesoPeixe = 50.1;

        double excedente = pesoPeixe <= 50 ? 0 : (pesoPeixe - 50.0);
        DecimalFormat df = new DecimalFormat("#0.00");
        excedente = Double.parseDouble(df.format(excedente).replace(",","."));
        double multa = excedente * 4.00;

        System.out.println("pesoPeixe: " + pesoPeixe);
        System.out.println("excedente: " + excedente);
        System.out.println("multa: " + multa);
    }

    private static void questao15() {
        printQuestao("15");

        double valorHora = 10.33;
        double horasTrabalhadas = 174;
        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = roudDouble((salarioBruto * 0.11), 2);
        double inss = roudDouble((salarioBruto * 0.08), 2);
        double sindicato = roudDouble((salarioBruto * 0.05), 2);

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Salario Bruto: " + (salarioBruto - ir - inss - sindicato));
    }

    private static void questao16() {
        printQuestao("16");

        double metrosQuadrados = 54.35;

        System.out.println("metrosQuadrados: " + metrosQuadrados);
        double litros = roudDouble((metrosQuadrados / 3) + 1, 2);
        double latas = roudDouble(litros / 18, 0) + 1;


        System.out.println("Qtd latas: " + latas);
        System.out.println("Valor total: " + (latas * 80.00));
    }

    private static void questao17() {
        printQuestao("17");
        double metrosQuadrados = 0;

        metrosQuadrados = 8; // 1 galão
        metrosQuadrados = 16; // 2 galao
        metrosQuadrados = 56; // 6 galao, 2 latas ou 1 lata e 1 galoes
//        metrosQuadrados = 65; // 2 galao, 2 latas ou 1 lata e 2 galoes

        System.out.println("metrosQuadrados: " + metrosQuadrados);


        double litros = (metrosQuadrados / 3);
        double latas = litros / 18;
        double galoes = litros / 3.6;

        latas = Math.floor(latas) + 1;
        galoes = Math.floor(galoes) + 1;

        System.out.println("\nQtd latas: " + latas);
        System.out.println("Valor total: " + (latas * 80.00));

        System.out.println("\nQtd galoes: " + galoes);
        System.out.println("Valor total: " + (galoes * 25.00));

        latas = (latas-1);
        double litrosRestantes = litros - (latas * 18);
        galoes = litrosRestantes / 3.6;
        galoes = Math.floor(galoes) + 1;


        System.out.println("\nQtd latas: " + latas + ", Qtd galoes: " + galoes);
        System.out.println("Valor total: " + ((latas * 80.00) + (galoes * 25.00)) );

    }



}
