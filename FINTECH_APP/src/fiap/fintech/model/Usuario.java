package fiap.fintech.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
	private List<Conta> conta;
    private List<Metas> metas;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.conta = new ArrayList<>();
        this.metas = new ArrayList<>(); 
    }

    public void adicionarConta(Conta conta) {
        this.conta.add(conta);
    }
    
    public void removerConta(Conta conta) {
    	exibir();
    	System.out.println(" ");
    	System.out.println(" A conta doi DELETADA! ");
        this.conta.remove(conta);
    }
    
    public void adicionarMeta(Metas meta) {
        this.metas.add(meta);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Conta> getContas() {
        return conta;
    }

    public List<Metas> getMetas() {
        return metas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println(getNome());
        System.out.println(getEmail());
        System.out.println(getContas());
        System.out.println(getMetas());
        System.out.println("-----------------------------");
    }
}
