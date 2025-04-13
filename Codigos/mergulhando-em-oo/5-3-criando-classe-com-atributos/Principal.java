public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2024;
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "azul";
        meuCarro.fabricante = "Volkswagen";

        System.out.println("Ano: " + meuCarro.anoFabricacao);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Fabricante: " + meuCarro.fabricante);

        Carro seuCarro = new Carro();
    }
}