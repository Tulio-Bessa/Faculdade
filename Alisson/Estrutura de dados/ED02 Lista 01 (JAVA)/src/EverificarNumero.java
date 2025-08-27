import java.util.Scanner;

public class EverificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        
        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        

        System.out.print("Digite um número para verificar se está no array: ");
        int numero = scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + numero + " está na posição " + posicao);
        } else {
            System.out.println("O número não está presente no array.");
        }
    }
}