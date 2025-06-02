public class MergeSort {

    // Início cronômetro
    long inicioTempo = System.nanoTime();

    // Função principal do Merge Sort
    public static void mergeSort(int[] A, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(A, inicio, meio);        // Ordena a metade esquerda
            mergeSort(A, meio + 1, fim);       // Ordena a metade direita
            merge(A, inicio, meio, fim);       // Combina as duas metades
        }
    }

    // Função que mescla dois subvetores ordenados
    public static void merge(int[] A, int inicio, int meio, int fim) {
        // Cria subvetores temporários
        int[] E = new int[meio - inicio + 1];
        int[] D = new int[fim - meio];

        // Copia os dados para os vetores auxiliares E e D
        for (int i = 0; i < E.length; i++)
            E[i] = A[inicio + i];

        for (int j = 0; j < D.length; j++)
            D[j] = A[meio + 1 + j];

        int i = 0, j = 0, k = inicio;

        // Intercala os vetores E e D de volta em A
        while (i < E.length && j < D.length) {
            if (E[i] <= D[j]) {
                A[k] = E[i];
                i++;
            } else {
                A[k] = D[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de E, se houver
        while (i < E.length) {
            A[k] = E[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de D, se houver
        while (j < D.length) {
            A[k] = D[j];
            j++;
            k++;
        }

    // Fim cronômetro
    long fimTempo = System.nanoTime();
    }
}
