package Semana1.Operadores_logicos;

public class variaveis_boolean {
    public static void main(String[] args) {
        var num = 5;
        boolean positivo = (num > 0);
        boolean negativo = (num < 0);
        boolean zero = (num == 0);

        if (num > 0){
            System.out.println("valor Positivo: ");
        }
        else if (num < 0){
            System.out.println(" valor negativo");
        }
       else {
            System.out.println(" valor zero");
        }

    }
}
