import java.util.Scanner;

public class GrotacionarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Quantas posições você deseja rotacionar? ");
        int k = scanner.nextInt();

        k = k % numeros.length;  
        
        for (int i = 0; i < k; i++) {
            int temp = numeros[numeros.length - 1];  // Último elemento
            for (int j = numeros.length - 1; j > 0; j--) {
                numeros[j] = numeros[j - 1];
            }
            numeros[0] = temp;  // Coloca o último elemento na primeira posição
        }

        System.out.print("Array rotacionado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}