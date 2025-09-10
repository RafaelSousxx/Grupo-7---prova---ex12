import java.util.Scanner;


public class PrecoPromocional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual o valor do produto sem desconto em R$? ");
        double precoinicial = sc.nextDouble();

        double diminuicao5porcento = precoinicial * 0.95;

        System.out.println("O preço do produto após o desconto de 5% ficou na casa dos R$" + diminuicao5porcento);

        sc.close();

    }
}