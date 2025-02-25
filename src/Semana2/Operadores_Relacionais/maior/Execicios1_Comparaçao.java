package Semana2.Operadores_Relacionais.maior;

import java.util.Scanner;

public class Execicios1_Comparaçao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero1 = entrada.nextDouble();
        entrada.nextLine();


        System.out.println("Digite outro numero: ");
        double numero2 = entrada.nextDouble();
        entrada.nextLine();

        if (numero1 > numero2){
            System.out.println("numero1 é maior!! ");
        }else if(numero2 >numero1){
            System.out.println("numero2 é maior!! ");
        }else{
            System.out.println("Os dois numeros sao iguais");
        }
    }
}
