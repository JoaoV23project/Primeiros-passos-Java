import java.util.Scanner;

public class pegarInformacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = scanner.nextDouble(); // Lê um número decimal

        // Exibe os dados informados
        System.out.println("\n--- Dados Recebidos ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");

        scanner.close(); // 4. Fecha o recurso do Scanner
    }
}