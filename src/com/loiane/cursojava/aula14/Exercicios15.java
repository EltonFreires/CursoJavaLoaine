package com.loiane.cursojava.aula14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exercicios15 {
    public static void main(String[] args) {
        questao01(1, 3);
        questao01(4, 3);
        separador();

        questao02(2);
        questao02(3);
        separador();

        questao03("M");
        questao03("F");
        separador();

        questao04("a");
        questao04("E");
        questao04("b");
        separador();

        questao05(10, 10);
        questao05(8, 6);
        questao05(8, 5.5);
        separador();

        questao07(1, 2, 3);
        questao07(5, 4, 3);
        questao07(8, 9, 7);
        separador();

        questao09(1, 2, 3);
        questao09(2, 1, 3);
        questao09(5, 4, 3);
        questao09(5, 3, 4);
        questao09(8, 9, 7);
        questao09(7, 9, 8);
        separador();

        questao17(1992);
        questao17(1998);
        questao17(2000);
        separador();

        questao18("29/02/2000");
        questao18("29/02/2001");
        questao18("31/01/2000");
        questao18("31/04/2000");
        questao18("15/00/2000");
        questao18("15/13/2000");
        separador();

        questao19(326);
        questao19(320);
        questao19(300);
        questao19(111);
        questao19(110);
        questao19(101);
        questao19(25);
        questao19(20);
        questao19(16);
        questao19(7);
        separador();

    }

    private static void questao19(int num) {
        System.out.println("questao19:");
        System.out.printf("num: %s\n", num);

        int centena = 0;
        int dezena = 0;
        int unidade = 0;

        centena =  num / 100;
        num = num - (centena * 100);
        dezena =  num / 10;
        unidade = num - (dezena * 10);

        System.out.printf("%d centena(s), %d dezena(s), %d unidade(s)\n", centena, dezena, unidade);
    }

    private static void questao18(String data) {
        System.out.println("questao18:");
        System.out.printf("data: %s - ", data);

        String ret = "";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            df.parse(data);
            ret = "true\n";
        }catch (ParseException ex){
            ret = "false\n";
        }

        System.out.printf(ret);


    }

    private static void questao17(int ano) {
        System.out.println("questao17:");
        System.out.printf("Ano: %d - ", ano);

        String ret = "NÃO bissexto.\n";
        boolean div400 = ano % 400 == 0;

        if (ano % 4 == 0) {
            if (ano % 100 != 0 || div400) {
                ret = "bissexto.\n";
            }
        } else {
            if (div400) {
                ret = "bissexto.\n";
            }
        }

        System.out.printf(ret);
    }

    private static void questao09(int num1, int num2, int num3) {
        System.out.println("questao09:");
        System.out.printf("numeros %d, %d, %d\n", num1, num2, num3);

        int maior = num1;
        int meio = num1;
        int menor = num1;

        if (num2 > menor) {
            if (num2 > num3) {
                maior = num2;
            } else {
                meio = num2;
            }
        } else {
            menor = num2;
        }

        if (num3 > maior) {
            maior = num3;
        } else {
            if (num3 < menor) {
                meio = menor;
                menor = num3;
            } else {
                meio = num3;
            }
        }

        System.out.printf("Ordem decrescente: %d, %d, %d\n\n", maior, meio, menor);
    }

    private static void questao07(int num1, int num2, int num3) {
        System.out.println("questao07:");
        System.out.printf("num1: (%d), num2: (%d), num3: (%d)\n", num1, num2, num3);

        int maior = num1;
        int menor = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.printf("Maior: (%d), menor: (%d)\n", maior, menor);
    }

    private static void questao05(double nota1, double nota2) {
        System.out.println("questao05:");
        System.out.printf("nota1: (%f), nota2: (%f)\n", nota1, nota2);

        double media = (nota1 + nota2) / 2;
        System.out.printf("media: (%f), ", media);

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    private static void questao04(String letra) {
        System.out.println("questao04:");
        System.out.printf("letar: (%s), ", letra);
        letra = letra.toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }

    private static void questao03(String letra) {
        System.out.println("questao03:");
        System.out.printf("num: %s\n", letra);

        if (letra.equals("F")  || letra.equals("f")) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("M - Masculino");
        }
    }

    private static void questao02(int num) {
        System.out.println("questao02:");
        System.out.printf("num: %d\n", num);
        if (num % 2 == 0) {
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número Positivo");
        }
    }

    private static void separador() {
        System.out.println("\n-------------------------------------------------\n");
    }

    private static void questao01(int num1, int num2) {
        System.out.println("questao01:");
        System.out.printf("num1: %d, num2: %d", num1, num2);
        int numMaior;
        if (num1 > num2) {
            numMaior = num1;
        } else {
            numMaior = num2;
        }
        System.out.printf("Maior número %s\n", numMaior);
    }

}
