package projeto;

public class Moto extends Veiculo{

    @Override
    public void mostrarStatus() {
        if (this.status) {
            System.out.println("A moto está disponível");
        } else {
            System.out.println("A moto está indisponível");
        }
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Modelo da Moto: " + this.modelo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Ano de Fabricação: " + this.ano);
        mostrarStatus();
    }
}
