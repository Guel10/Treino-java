package Semana2.Estruturas_Condicionais;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Tem mais de 18 anos");
        String idade = entrada.nextLine();

        System.out.println("É estudante? ");
        String nome = entrada.nextLine();

        if (idade.equalsIgnoreCase("sim") && nome.equalsIgnoreCase("sim")){
            System.out.println("Direito a desconto");
        }else{
            System.out.println("Sem direito a desconto ");
        }

    }
}
