import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] vetor = LeitorArquivo.lerInteiros("arquivos/inteiros.txt");

        // int[] vetorOrdenado = InsertionSort.index(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}