public class ImaiorSomaSubarray {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoma = array[0];
        int somaAtual = array[0];

        for (int i = 1; i < array.length; i++) {
            somaAtual = Math.max(array[i], somaAtual + array[i]);
            maxSoma = Math.max(maxSoma, somaAtual);
        }

        System.out.println("A maior soma do subarray é: " + maxSoma);
    }
}