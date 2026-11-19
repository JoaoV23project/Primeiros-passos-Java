import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class calcularMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, num3, media;
        System.out.print("Digite o 1º número: ");
        num1 = scan.nextDouble();
        System.out.print("Digite o 2º número: ");
        num2 = scan.nextDouble();
        System.out.print("Digite o 3º número: ");
        num3 = scan.nextDouble();
        media = (num1 + num2 + num3) / 3; 
        System.out.print("Sua média aritmética: " + BigDecimal.valueOf(media).setScale(2, RoundingMode.HALF_UP).doubleValue());
        scan.close();
    }
}