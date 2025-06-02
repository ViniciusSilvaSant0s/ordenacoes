public class Ordenador {
    public static void index(int[] vetor, String[] scripts){
        ResultadoOrdenacao resultados = null;
        String nomeArquivo = null;

        for(int i = 0; i < scripts.length; i++){
            switch (scripts[i]){
                case "BUBBLE":
                    resultados = BubbleSort.index(vetor);
                    nomeArquivo = "bubble_sort.txt";
                    break;

                case "INSERTION":
                    resultados = InsertionSort.index(vetor);
                    nomeArquivo = "insertion_sort.txt";
                    break;
            }
            imprimeResultados(scripts[i], resultados,  nomeArquivo);
        }
    }

    public static void imprimeResultados(String script, ResultadoOrdenacao resultados, String nomeArquivo){
        if (resultados == null) {
            System.out.println("Nenhuma ordenação foi executada.");
            return;
        }

        // Cálculo de tempo
        long duracaoEmNano = resultados.getFim() - resultados.getInicio();
        double duracaoEmMillis = duracaoEmNano / 1_000_000.0;

        // Impressão de resultados
        System.out.println("------------------- " + script + " SORT ------------------");
        System.out.println("|                                                 ");
        System.out.println("| Tempo (ms): " + duracaoEmMillis);
        System.out.println("|                                                 ");
        System.out.println("##################################################");
        System.out.println();

        // Arquivo com resultado ordenado
        EscritorResultados.index(resultados.getVetor(), nomeArquivo);
    }
}
