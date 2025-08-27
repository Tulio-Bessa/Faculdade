public class HmergingArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] resultado = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                resultado[k++] = array1[i++];
            } else {
                resultado[k++] = array2[j++];
            }
        }

        // Adiciona os elementos restantes de array1
        while (i < array1.length) {
            resultado[k++] = array1[i++];
        }

        // Adiciona os elementos restantes de array2
        while (j < array2.length) {
            resultado[k++] = array2[j++];
        }

        System.out.print("Array resultante: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}