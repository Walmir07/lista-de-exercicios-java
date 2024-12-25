import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        // Exercício 3 - Identificação de Paridade com Strings

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        // // 12 / 2 = 6 -> resto 0;
        // // 13 / 2 = 6 -> resto 1;
        
        String resultado = "";
        
        if(numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("O numero é: " + resultado);

        scanner.close();
    }
}
