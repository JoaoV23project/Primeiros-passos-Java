import java.util.Scanner;
public class Carro {
    private int ano;
    private String fabricante;

    public Carro(int ano, String fabricante){
        this.ano = ano;
        this.fabricante = fabricante;
    }
    @Override
    public String toString(){
        return "'carro': {\n'ano' = '" + ano + "', \n'fabricante' = '" + fabricante + "'\n}";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro(0, null);
        System.out.print("Digite o ano de fabricação do carro: ");
        carro.ano = scan.nextInt();
        System.out.print("Digite o fabricante do carro: ");
        carro.fabricante = scan.next();
        System.out.println(carro);
        scan.close();
    }
}