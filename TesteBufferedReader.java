import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TesteBufferedReader {
    public static void main(String[] args) {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite seu nome: ");
        String nome = "";
        try {
            nome = tec.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(nome);
    }
}