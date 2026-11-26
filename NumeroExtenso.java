import java.io.BufferedReader;
import java.io.InputStreamReader;;

public class NumeroExtenso {
    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String[] numExtenso = { "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove",
                "Dez" };
        try {
            System.out.print("Digite um número: ");
            num = Integer.parseInt(teclado.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < numExtenso.length; i++) {
            if (num == i) {
                System.out.print(numExtenso[i]);
                break;
            }
        }
    }
}
