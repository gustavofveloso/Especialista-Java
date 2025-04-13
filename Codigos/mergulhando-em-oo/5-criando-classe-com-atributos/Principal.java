public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2024;
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "azul";
        meuCarro.fabricante = "Volkswagen";
        meuCarro.precoCompra = 120000;
        
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Gustavo Farias";
        meuCarro.proprietario.cpf = "123.456.789-00";
        meuCarro.proprietario.anoNascimento = 1990;

        meuCarro.calcularValorRevenda();

        System.out.println("Ano: " + meuCarro.anoFabricacao);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("Proprietario: " + meuCarro.proprietario.nome);
        System.out.println("CPF: " + meuCarro.proprietario.cpf);
        System.out.println("Ano de Nascimento: " + meuCarro.proprietario.anoNascimento);

        System.out.println();

        Carro seuCarro = new Carro();

        seuCarro.anoFabricacao = 2024;
        seuCarro.modelo = "X6";
        seuCarro.cor = "prata";
        seuCarro.fabricante = "BMW";

        System.out.println("Ano: " + seuCarro.anoFabricacao);
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Cor: " + seuCarro.cor);
        System.out.println("Fabricante: " + seuCarro.fabricante);
    }
}