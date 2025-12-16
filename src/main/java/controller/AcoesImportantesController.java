package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcoesImportantesController {

    public AcoesImportantesController() {
    }

    public String fazerBackup() {
        StringBuilder sb = new StringBuilder();

        try {
            sb.append("Iniciando backup...\n");
            String caminho = System.getProperty("user.home") + "\\Desktop\\backup.sql";
            String comando = "cmd /c mysqldump --no-tablespaces -u developer -pdeveloper123@ diariodetrade > \"" + caminho + "\"";

            sb.append("Executando comando: ").append(comando).append("\n");

            ProcessBuilder pb = new ProcessBuilder(comando.split(" "));
            pb.redirectErrorStream(true);
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))) {

                String linha;
                while ((linha = reader.readLine()) != null) {
                    sb.append(linha).append("\n");
                }
            }

            int exitCode = process.waitFor();
            sb.append("Backup finalizado com código de saída: ").append(exitCode).append("\n");

        } catch (IOException e) {
            sb.append("Erro :      ").append(e.getMessage()).append("\n");
        } catch (InterruptedException e) {
            sb.append("Processo interrompido: ").append(e.getMessage()).append("\n");
            Thread.currentThread().interrupt();
        }

        return sb.toString();
    }
}
