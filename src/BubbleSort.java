public class BubbleSort {
    public static void index(int[] vetor){
        // Início cronômetro
        long inicio = System.nanoTime();

        // Script de ordenação (Bubble Sort)
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Fim cronômetro
        long fim = System.nanoTime();

        // Cálculo de tempo
        long duracaoEmNano = fim - inicio;
        double duracaoEmMillis = duracaoEmNano / 1_000_000.0;

        // Impressão de resultados
        System.out.println("------------------- BUBBLE SORT ------------------");
        System.out.println("|                                                |");
        System.out.println("| Tempo (ms): " + duracaoEmMillis);
        System.out.println("|                                                |");
        System.out.println("##################################################");
        System.out.println();

        // Arquivo com resultado ordenado
        String nomeArquivo = "bubble_sort.txt";
        EscritorResultados.index(vetor, nomeArquivo);
    }
}
