import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    
    //Exercício 5: Verificação de Intervalo com AND

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira um número para ver o intervalo");
    int num = scanner.nextInt();

    if(num >= 10 && num <= 20){
        System.out.println("Dentro do intervalo");
    } else {
        System.out.println("Fora do intervalo");
    }

    scanner.close();

    }
}
