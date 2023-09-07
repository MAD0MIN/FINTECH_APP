package fiap.fintech;

import fiap.fintech.model.Conta;
import fiap.fintech.model.Metas;
import fiap.fintech.model.PessoaJuridica;
import fiap.fintech.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1, 100);
		Conta conta2 = new Conta(2, 500);
		Usuario marco = new Usuario("Marco" , "marco@marco.com");
		Usuario hebert = new Usuario ("Hebert", "hebert@hebert.com");
		Metas meta1 = new Metas (1, 2000.00, false);
		Metas meta2 = new Metas (2, 1500.00, false);
		PessoaJuridica empresa1 = new PessoaJuridica ("sexshop", "sex@bol.com", "12343215421543");

		
		
		marco.adicionarConta(conta1);
		hebert.adicionarConta(conta2);
		marco.adicionarMeta(meta1);
		hebert.adicionarMeta(meta2);
		empresa1.adicionarConta(conta1);
		empresa1.adicionarMeta(meta2);
			
		empresa1.exibir();
		marco.exibir();
		hebert.exibir();
		
		
	}

}
