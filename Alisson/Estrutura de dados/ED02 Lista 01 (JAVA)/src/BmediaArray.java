import java.util.Scanner;
public class BmediaArray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        double media = (double) soma / numeros.length;

        System.out.println("A média dos elementos é: " + media);
    }
}
