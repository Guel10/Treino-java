package Semana2.Operador_Atribuiçao;

public class aplicarDesconto {
    public static void main(String[] args) {
        double preco = 150.0;
        var a = 0.9;
        var desconto = preco *= a;
        System.out.println("O desconto foi de 10%: " + desconto);
    }
}
