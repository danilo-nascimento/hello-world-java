package com.helloWorld;
import java.util.Scanner;
public class FahrenheitConversor {
    public FahrenheitConversor(){
        System.out.print("Insira a temperatura em graus Celsius: ");
        Scanner scanner = new Scanner(System.in);
        int graus = scanner.nextInt();
        grausToFahrenheit(graus);
    }
    public void grausToFahrenheit(double graus){
        double farenheit = graus * 9 / 5 + 32;
        System.out.println("" + graus + "  graus Celsius convertidos para Fahrenheit são: " + farenheit);
    }
}
