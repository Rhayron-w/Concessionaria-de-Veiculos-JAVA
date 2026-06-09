package projeto;

public class Cliente {
    protected String nome;
    protected int contato;

/*getter*/

    public String getNome(){
        return nome;
    }

    public int getContato() {
        return contato;
    }

/*setter*/

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public void mostrarInformacao() {
    System.out.println("Nome do cliente: " + this.nome);
    System.out.println("Contato do cliente: " + this.contato);
    }
}
