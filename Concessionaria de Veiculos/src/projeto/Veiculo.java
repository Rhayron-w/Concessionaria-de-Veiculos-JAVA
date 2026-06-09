package projeto;
import java.lang.Exception;
import java.time.*;

class AnoInvalidoException extends Exception{
    public AnoInvalidoException (String msg) {
        super(msg);
    }
}

public class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected String tipo;
    protected Boolean status;
    protected int ano;


/*getter*/



    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public Boolean getStatus() {
        return status;
    }

    public int getAno () {
        return ano;
    }   



/*setter*/



    public void setModelo(String modelo) {
        try {
            if (modelo == null);
        } catch (NullPointerException e){
            System.err.println("ERROR: Modelo do veículo não pode ser nulo");
        }
        this.modelo = modelo;
    } 

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setAno(int ano) throws AnoInvalidoException{
        if (this.ano >= 2027) {
            throw new AnoInvalidoException("O ano de fabricação não pode ser maior que o ano atual.");
        } else {
            this.ano = ano;
        }
    }

/* Exibir Infos */
public void mostrarStatus() {
    if (this.status = true) {
        System.out.println("O veículo está disponível ");
    } else {
        System.out.println("O veículo está indisponível");
    }
}

public void mostrarInformacao() {
    System.out.println("Modelo do veiculo: " + this.modelo);
    System.out.println("Fabricante do veículo: " + this.fabricante);
    System.out.println("Ano de Fabricação: " + this.ano);
    System.out.println("Tipo de veículo: " + this.tipo);
    mostrarStatus();
    }

public void realizarVenda() {
        if (!this.status) {
            System.out.println("O " + this.fabricante + " " + this.modelo + " não está disponível");
        } else {
            LocalDateTime data = LocalDateTime.now();
            System.out.println("Venda realizada em: " + data);
        }
    }
}