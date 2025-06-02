public class ResultadoOrdenacao {
    private long inicio;
    private long fim;
    private int[] vetor;

    ResultadoOrdenacao(long inicio, long fim, int[] vetor) {
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor;
    }

    public long getInicio() {
        return inicio;
    }

    public long getFim() {
        return fim;
    }

    public int[] getVetor() {
        return vetor;
    }
}
