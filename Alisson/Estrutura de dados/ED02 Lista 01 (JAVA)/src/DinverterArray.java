import java.util.Scanner;

public class DinverterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio < fim) {
            // Troca os elementos
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.print("Array invertido: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}