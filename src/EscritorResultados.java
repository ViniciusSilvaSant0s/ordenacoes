import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorResultados {
    public static void index(int[] vetor, String nomeArquivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("arquivos/resultados/" + nomeArquivo))) {
            for (int numero : vetor) {
                escritor.write(Integer.toString(numero));
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
