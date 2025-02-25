package Semana2.Estruturas_Repetiçao;

import java.util.Scanner;

public class wsoma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();

        int soma = 0;
        int i = 1;

        // Loop while para somar os números até o valor informado
        while (i <= num) {
            soma += i;
            i++;
        }

        // Exibe o resultado
        System.out.println("A soma dos números de 1 até " + num + " é: " + soma);

    }
    }

