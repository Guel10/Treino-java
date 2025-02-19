package Semana1.Operadores_logicos;

public class intervalo {
    public static void main(String[] args) {
        int num = 18;
        boolean dentroDoIntervalo = (num >= 10 && num <= 50 )&& true;

        if (num >= 10 && num <= 50){
            System.out.println("Dentro do intervalo");
        }
        else {
            System.out.println("fora do intervalo");
        }
    }
}
