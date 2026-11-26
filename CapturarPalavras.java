import java.util.Scanner;

public class CapturarPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] palavras = new String[5];
        try {
            for (int i = 0; i < palavras.length; i++) {
                System.out.print("Digite uma palavra: ");
                palavras[i] = scan.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }
        scan.close();
    }
}
