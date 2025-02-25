package Semana2.Estruturas_Repetiçao;

import java.util.Scanner;

public class whileExc1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        int contador = 0;


        while (contador < num){
            System.out.println(contador++);        }

    }
}
