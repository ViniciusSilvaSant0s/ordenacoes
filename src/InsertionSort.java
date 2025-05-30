public class InsertionSort {
    public static void index(int[] vetor){
        // Início cronômetro
        long inicio = System.nanoTime();

        // Script de ordenação
        for (int i = 0; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j -1;
                vetor[j + 1] = chave;
            }
        }

        // Fim cronômetro
        long fim = System.nanoTime();

        // Cálculo de tempo
        long duracaoEmNano = fim - inicio;
        double duracaoEmMillis = duracaoEmNano / 1_000_000.0;

        // Impressão de resultados
        System.out.println("----------------- SELECTION SORT -----------------");
        System.out.println("|                                                |");
        System.out.println("| Tempo (ms): " + duracaoEmMillis);
        System.out.println("|                                                |");
        System.out.println("##################################################");
        System.out.println();

        // Arquivo com resultado ordenado
        String nomeArquivo = "insertion_sort.txt";
        EscritorResultados.index(vetor, nomeArquivo);
    }
}
