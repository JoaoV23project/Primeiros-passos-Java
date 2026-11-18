import java.util.Scanner;
public class helloUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Hello " + nome + "!");
        scan.close();
    }
}