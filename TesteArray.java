public class TesteArray{
    public static void main(String[] args){
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int i = 0;
        while (i < meses.length) {
            System.out.print(meses[i] + ", ");
            i++;
        }
        System.out.println("");
        for(i = 0; i < meses.length; i++){
            System.out.print(meses[i] + ", ");
        }
        i = 0;
        System.out.println("");
        do {
            System.out.print(meses[i] + ", ");
            i++;
        } while (i < meses.length);
    }
}