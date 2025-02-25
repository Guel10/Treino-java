package Semana2.Estruturas_Condicionais;

import java.util.Scanner;

public class notaAluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua Nota:");
        int nota = entrada.nextInt();



        if (nota > 7) {
            System.out.println("Aprovado");
        } else if (5 <= nota) {
            System.out.println("Recuperaçao");
        } else if (nota < 5){
        System.out.println("Reprovado");
        }

    }
}