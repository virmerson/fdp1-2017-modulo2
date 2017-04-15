package aula02;

import temp.ClientePF;

public class GerenciadorCliente {

	private Cliente[] vetor ;
	private int posicao=0;
	
	public GerenciadorCliente(int qtd){
		vetor= new Cliente[qtd];
	}
	
	public void imprimirClientes(){

		for(int i=0; i<vetor.length; i++){
			
			vetor[i].imprimirPropriedades();
			/*System.out.println("NOME: " +vetor[i].getNome());
			if (vetor[i] instanceof ClientePF){
				System.out.println("CPF: "+  ((ClientePF) vetor[i] )   .getCpf()     );
			}else{
				System.out.println( "CNPJ: "+( (ClientePJ) vetor[i] ).getCpnj());
			}*/
		}
	}
	public void cadastrar(Cliente cli) {
		if(posicao<vetor.length)
			vetor[posicao++] = cli;
		
	}
}
