import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //System.in identifica input, entrada de usuário
        
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); //string
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt(); //int
        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble(); //double
       
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        leitura.close(); //fecha o scanner para evitar vazamento de memória
    }
}    

