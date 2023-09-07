package fiap.fintech.model;

public class Conta {
	public int ID;
	public float Saldo;
	
	public Conta(int ID, float Saldo) {
		
		this.ID = ID;
		this.Saldo = Saldo;
		
	}
	
	@Override
    public String toString() {
        return "Conta número: " + ID + ", Saldo: " + Saldo;
    }
	
}
