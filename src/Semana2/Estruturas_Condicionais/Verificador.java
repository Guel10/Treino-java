package Semana2.Estruturas_Condicionais;

import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero: ");
        Double num = entrada.nextDouble();

        if (num > 0){
            System.out.println("Numero Positivo");
        } else if (num < 0) {
            System.out.println("Numero Negativo");
        }else{
            System.out.println("Zero");
        }
    }
}
