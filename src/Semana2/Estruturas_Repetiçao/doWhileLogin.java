package Semana2.Estruturas_Repetiçao;

import java.util.Scanner;

public class doWhileLogin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner((System.in));

       String senha ="";

        do {
            System.out.println("digite senha: ");
            senha = entrada.nextLine();
        }while (!senha.equalsIgnoreCase("1234"));



        entrada.close();
    }
}
