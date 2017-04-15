package aula02;

public class ClientePJ extends Cliente {
	private String cpnj;

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	public void imprimirPropriedades(){
		System.out.println("nome:" + getNome());
		System.out.println("cnpj:" + getCpnj());
	}
	
}
