import java.util.Scanner;

public class calcularArea{
    public static void main(String[] args){
        /**Declaração das variáveis necessárias*/
        double comprimento, largura, area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o comprimento a ser considerado: ");
        comprimento = scan.nextDouble();
        System.out.print("Digite a largura a ser considerada: ");
        largura = scan.nextDouble();
        area = comprimento * largura;
        System.out.print("Área: " + area + " U.A (Unidades de área)");
        scan.close();
    }
}