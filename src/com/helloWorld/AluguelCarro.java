package com.helloWorld;
import java.util.Scanner;
public class AluguelCarro {
    final int PRECODIA = 60;
    final double PRECOPORKM = 0.15;
    public void precoAluguel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de dias utilizados: ");
        int dias = scanner.nextInt();
        System.out.print("Informe a quantidade de km percorridos: ");
        double km = scanner.nextDouble();
        int acumuloDias = dias * PRECODIA;
        double acumuloKm = km * PRECOPORKM;
        double resultado = acumuloDias + acumuloKm;
        System.out.println( "O valor total é de R$" + resultado );
    }
}
