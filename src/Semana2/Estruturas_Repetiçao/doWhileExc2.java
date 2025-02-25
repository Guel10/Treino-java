package Semana2.Estruturas_Repetiçao;

import java.util.Scanner;

public class doWhileExc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("quantas vezes voce deseja repetir uma ação, r:");
            num = entrada.nextInt();
            entrada.nextLine();
        }while (num <=0);
    }
}