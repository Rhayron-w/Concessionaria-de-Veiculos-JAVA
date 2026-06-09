package uninove.projeto;

public class Carro extends Veiculo{
    
    @Override
    public void mostrarStatus() {
        if (this.status) {
            System.out.println("O carro está disponível");
        } else {
            System.out.println("O carro está indisponível");
        }
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Modelo do Carro: " + this.modelo);
    System.out.println("Fabricante: " + this.fabricante);
    System.out.println("Ano de Fabricação: " + this.ano);
    mostrarStatus();
    }
}
