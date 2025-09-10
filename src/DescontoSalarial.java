import java.util.Scanner;


public class DescontoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual o seu salário atual em R$? ");
        double salarioinicial = sc.nextDouble();

        double diminuicao5porcento = salarioinicial * 0.95;

        System.out.println("O seu salário após o desconto de 5% ficou na casa dos R$" + diminuicao5porcento);

        sc.close();

    }
}