import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FremoverDuplicados {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        

        // Usar um Set para remover duplicatas
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int numero : numeros) {
            conjunto.add(numero);
        }

        // Converter de volta para um array (se necessário)
        Integer[] semDuplicatas = conjunto.toArray(new Integer[0]);

        // Exibir o array sem duplicados
        System.out.print("Array sem duplicados: ");
        for (int num : semDuplicatas) {
            System.out.print(num + " ");
        }
    }
}
