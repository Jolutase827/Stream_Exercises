package es.ieslavereda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();

    }

    private static void ejercicio2() {
        double[] vector = new double[5];
        boolean exception;
        for (int i = 0; i < vector.length; i++){
            do {
                try {
                    rellenar(vector,i);
                    exception=false;
                } catch (Exception e) {
                    System.out.println("Valor no apto");
                    exception=true;
                }
            } while (exception);
        }
        for (double d:vector){
            System.out.println(d);
        }
    }

    private static void rellenar(double[] vector, int i)throws Exception{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dime el valor"+(i+1));
            vector[i]=sc.nextInt();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    private static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int a,b;
        try {
            System.out.println("Dame primer valor");
            a=sc.nextInt();
            System.out.println("Dame el segundo valor");
            b=sc.nextInt();
            System.out.println(a/b);
        }catch (InputMismatchException e){
            System.out.println("No puedes dividir un caracter");
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
    }
}