package aula05;

public abstract class Conta {
	
	private double saldo;
	private Correntista correntista;
	
	public abstract void atualizarSaldo() ;

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Correntista getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", correntista=" + correntista + "]";
	}
	
	
}
