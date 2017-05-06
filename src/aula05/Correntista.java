package aula05;

public class Correntista {

	int codigo;
	String nome;
	String cpf;
	
	public Correntista(int codigo, String nome, String cpf) {
		this.codigo =codigo;
		this.nome =nome;
		this.cpf=cpf;
	}

	@Override
	public String toString() {
		return "Correntista [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
	

}
