import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        // Exercício 4 - Identificação de Dia Útil

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 (Referente aos dias da semana | 1 - Domingo, 2 - Segunda, 3 - Terça, etc...).");

        int dia = scanner.nextInt();

        switch(dia){
            case 1:
                System.out.println("Domingo: É final de semana");
                break;
            case 2:
                System.out.println("Segunda: É um dia útil");
                break;
            case 3:
                System.out.println("Terça: É um dia útil");
                break;
            case 4:
                System.out.println("Quarta: É um dia útil");
                break;
            case 5:
                System.out.println("Quinta: É um dia útil");
                break;
            case 6:
                System.out.println("Sexta: É um dia útil");
                break;
            case 7:
                System.out.println("Sábado: É final de semana");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        scanner.close();
    }
}
