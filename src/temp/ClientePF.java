package temp;

import aula02.Cliente;

public class ClientePF extends Cliente{
	private String cpf;

	public String getCpf() {
		return cpf;
	}
	public String getNome(){
		return super.getNome().toUpperCase();
	}
	
	public void imprimirNomeMaiusculo(){
		System.out.println(getNome().toUpperCase());
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public void imprimirPropriedades(){
		System.out.println("nome:" + getNome());
		System.out.println("cpf:" + getCpf());
	}
	
}