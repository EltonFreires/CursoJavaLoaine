package com.loiane.cursojava.aula13;

public class Operadores {
    public static void main(String[] args){
       operadoresAritimeticos();
       operadoresRelacionais();
       operadoresLogicos();
    }

    private static void operadoresLogicos() {
        System.out.println("\noperadoresLogicos...");
        System.out.println("\ntrue || true " + (true || true));
        System.out.println("true || false " + (true || false));
        System.out.println("false || true " + (false || true));
        System.out.println("false || false " + (false || false));

        System.out.println("\ntrue && true " + (true && true));
        System.out.println("true && false " + (true && false));
        System.out.println("false && true " + (false && true));
        System.out.println("false && false " + (false && false));

        System.out.println("\ntrue ^ true " + (true ^ true));
        System.out.println("true ^ false " + (true ^ false));
        System.out.println("false ^ true " + (false ^ true));
        System.out.println("false ^ false " + (false ^ false));

        System.out.println("\n!true " + (!true));
        System.out.println("!false " + (!false));
    }

    private static void operadoresRelacionais() {
        System.out.println("\noperadoresRelacionais...");
        System.out.println("1 == 1 " + (1 == 1));
        System.out.println("1 != 1 " + (1 != 1));

        System.out.println("2 > 1 " + (2 > 1));
        System.out.println("2 < 1 " + (2 < 1));

        System.out.println("2 >= 2 " + (2 >= 2));
        System.out.println("2 <= 2 " + (2 <= 2));
    }

    static void operadoresAritimeticos() {
        System.out.println("operadoresAritimeticos...");
        int num = 5;
        System.out.println("num: "+ num);
        System.out.println("num+1: "+ (num+1));
        System.out.println("num-1: "+ (num-1));
        System.out.println("num*2: "+ (num*2));
        System.out.println("num/2: "+ (num/2));
        System.out.println("num % 2: "+ (num % 2));

        System.out.println("num++: "+ (num++));
        System.out.println("num: "+ num);
        System.out.println("num--: "+ (num--));
        System.out.println("num: "+ num);

        System.out.println("++num: "+ (++num));
        System.out.println("num: "+ num);
        System.out.println("--num: "+ (--num));
        System.out.println("num: "+ num);
    }


}
