import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        // Exercicio 1 - Verificação de Categoria de Preço
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");

        double preco = scanner.nextDouble();

        if(preco < 50) {
            System.out.println("Categoria: Barato");
        } else if(preco >= 50 && preco <= 100) {
            System.out.println("Categoria: Médio");
        } else {
            System.out.println("Categoria: Caro");
        }  

        scanner.close();
    }
}
