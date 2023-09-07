package fiap.fintech.model;

public class PessoaJuridica extends Usuario {
    private String cnpj;

    public PessoaJuridica(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

	public String getCnpj() {
		cnpj = "o cnpj é : " + cnpj;
		
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void exibir() {
		System.out.println(super.getNome());
		System.out.println(super.getEmail());
		System.out.println(super.getContas());
		System.out.println(super.getMetas());
		System.out.println(this.getCnpj());
		System.out.println("-----------------------------");

	}
	
	@Override
    public String toString() {
        return "CNPJ: " + cnpj ;
    }
	

}
