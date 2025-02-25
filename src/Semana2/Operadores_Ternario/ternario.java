package Semana2.Operadores_Ternario;

import java.awt.*;
import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        String resultado = idade >= 18 ? "Voce é maior de idade":" voce é menor de idade";
        System.out.println(resultado);
    }
}
