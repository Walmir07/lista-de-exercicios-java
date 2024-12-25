import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // Exercício 2 - Validação de Login

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");

        String usuario = scanner.next();

        System.out.println("Digite a senha do usuário: ");

        String senha = scanner.next();

        if(usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
        
        scanner.close();
    }
    
}
