import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

    // Exercício 6: Classificação de Letra

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira uma letra: ");
    char letra = scanner.next().toLowerCase().charAt(0);

    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Vogal");
            break;
        default:
            System.out.println("Consoante");
    }


    scanner.close();
        
    }
}
