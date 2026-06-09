package uninove.projeto;

public class Utilitario extends Veiculo{
    
    @Override
    public void mostrarStatus() {
        if (this.status == true) {
            System.out.println("O utilitário está disponível");
        } else {
            System.out.println("O utilitário está indisponível");
        }
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Modelo do Utilitátio: " + this.modelo);
    System.out.println("Fabricante: " + this.fabricante);
    System.out.println("Ano de Fabricação: " + this.ano);
    mostrarStatus();
    }
}
