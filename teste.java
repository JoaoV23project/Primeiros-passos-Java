import java.util.Scanner;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu 1º contato: ");
        String contato1 = scan.nextLine();

        System.out.print("Digite seu 2º contato: ");
        String contato2 = scan.nextLine();
        
        System.out.print("Digite sua idade em anos: ");
        int idade = scan.nextInt();

        System.out.print("Digite sua massa em Kg: ");
        double massa = scan.nextDouble();
        

        System.out.println("Olá " + nome);
        System.out.println("Sua idade: " + idade + " anos");
        System.out.println("Sua massa: " + massa + " Kg");
        System.out.println("1º Contato: " + contato1);
        System.out.println("2º Contato: " + contato2);
        
        scan.close();
    }
}
