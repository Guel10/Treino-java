package Semana1.Operadores_logicos;

public class idade {
    public static void main(String[] args) {
        int i = 20;
        boolean maiorDeIdade = (i > 18)&& true;

        if (i > 18){
            System.out.println("Idade é maior que 18");
        }
        else{
            System.out.println("idade é menor que 18");
        }
    }
}
