package projeto;

public class PessoaF extends Cliente{
    private String cpf;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            System.out.println("ERROR: CPF Inválido");
        }
        this.cpf = cpf;
    }

    @Override
    public void mostrarInformacao() {
    System.out.println("Nome do cliente: " + this.nome);
    System.out.println("Contato do cliente: " + this.contato);
    System.out.println("CPF do cliente: " + this.cpf);
    }
}
