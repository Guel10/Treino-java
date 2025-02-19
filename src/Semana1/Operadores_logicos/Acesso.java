package Semana1.Operadores_logicos;

public class Acesso {
    public static void main(String[] args) {
        String usuario = "admin";
        String senha = "1234";
        boolean acessoPermitido = (usuario.equals("admin")&&senha.equals("1234"));

        System.out.println(acessoPermitido);
    }
}
