package uninove.projeto;

public class PessoaJ extends Cliente{
    private String cnpj;

     public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        if (cnpj == null || cnpj.trim().isEmpty()) {
            System.out.println("ERROR: CNPJ Inválido");
        }
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarInformacao() {
    System.out.println("Nome do cliente: " + this.nome);
    System.out.println("Contato do cliente: " + this.contato);
    System.out.println("CNPJ do cliente: " + this.cnpj);
    }
}
