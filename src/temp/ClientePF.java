package temp;

import aula02.Cliente;

public class ClientePF extends Cliente{
	private String cpf;

	public String getCpf() {
		return cpf;
	}
	
	public void imprimirNomeMaiusculo(){
		System.out.println(getNome().toUpperCase());
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}