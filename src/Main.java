import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Criação de vetor
        int[] vetor = LeitorArquivo.lerInteiros("arquivos/inteiros.txt");

        String[] scripts = {"BUBBLE", "INSERTION"};

        Ordenador.index(vetor, scripts);
        // Execução de scripts
         InsertionSort.index(vetor);

    }
}