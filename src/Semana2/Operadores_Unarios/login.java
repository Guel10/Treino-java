package Semana2.Operadores_Unarios;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
         int tentativaslogin = 5;

        Scanner entrada = new Scanner(System.in);

        while(tentativaslogin > 0){

            System.out.println("digite seu login: ");
            String usuario = entrada.nextLine();

            System.out.println("Digite a senha do usuario: ");
            Double senha = entrada.nextDouble();
            entrada.nextLine();

            boolean login = (usuario.equals("admin") && senha.equals(1234.0));

            if (login == true){
                System.out.println("parabens, voce tem acesso a conta");
                break;
            }else {
                --tentativaslogin;
                System.out.println("usuario ou senha incorret, faltam "+ tentativaslogin);
            }
            System.out.println("voce alcançou o limite de tenataivas");
            break;
        }
    }
}
