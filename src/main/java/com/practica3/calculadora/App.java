package com.practica3.calculadora;

import java.util.Scanner;

import com.practica3.calculadora.mate.Operacion;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA BÁSICA - PRÁCTICA 3 ===");
        
        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            
            Operacion operacion = new Operacion(num1, num2);
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma: " + operacion.sumar());
            System.out.println("Resta: " + operacion.restar());
            System.out.println("Multiplicación: " + operacion.multiplicar());
            
            try {
                double resultadoDivision = operacion.dividir();
                // Formatear a 3 decimales
                System.out.println("División: " + String.format("%.3f", resultadoDivision));
            } catch (ArithmeticException e) {
                System.out.println("División: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Debe ingresar solo números.");
        } finally {
            scanner.close();
        }
    }
}