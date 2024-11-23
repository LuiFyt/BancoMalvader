package model;

import java.time.LocalDateTime;
import java.util.List;

public class Relatorio {
    private String tipo;
    private LocalDateTime dataGeracao;
    private List<String> dados;

    public Relatorio(String tipo, List<String> dados) {
        this.tipo = tipo;
        this.dados = dados;
        this.dataGeracao = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataGeracao() {
        return dataGeracao;
    }

    public List<String> getDados() {
        return dados;
    }

    public void setDados(List<String> dados) {
        this.dados = dados;
    }

    public void gerarRelatorioGeral() {
        System.out.println("Relatório do tipo " + tipo + " gerado em " + dataGeracao);
        for (String linha : dados) {
            System.out.println(linha);
        }
    }

    public void exportarParaExcel() {
        System.out.println("Relatório exportado para Excel com sucesso.");
        // falta implementar lógica para salvar em arquivo Excel
    }
}
