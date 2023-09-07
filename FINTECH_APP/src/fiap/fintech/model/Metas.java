package fiap.fintech.model;

public class Metas {
	public int ID;
	public Double ValorAlvo;
	public Boolean conclusao;
	
	public Metas(int ID, Double ValorAlvo, Boolean conclusao) {
		
		this.ID = ID;
		this.ValorAlvo = ValorAlvo ;
		this.conclusao = conclusao;
		
	}
	@Override
    public String toString() {
        return "Meta Id: " + ID + ", Valor Alvo: " + ValorAlvo + ", conclusão : " + conclusao;
    }
	
}
