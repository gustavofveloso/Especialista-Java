public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    int calcularTempoDeUsoEmAno() {
        return 2025 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAno();
        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if(valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

    void imprimirResumoDepreciacao() {
        double valorRevenda = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAno();

        System.out.printf(
            "Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro 
        );

        System.out.printf(
            "Valor de revenda: R$ %.2f%n", valorRevenda
        );
    }
}