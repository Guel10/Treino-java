package Semana1.Operadores_Aritmetios;

import javax.swing.JOptionPane;

public class boo  {
    public static void main(String[] args) {
        int num = 2;
        String valor2 = JOptionPane.showInputDialog("digite um numero: ");
        int num2 = Integer.parseInt(valor2);

        var r = (num2 % 2 == 0)&& true;

        System.out.println(r);
    }
}
