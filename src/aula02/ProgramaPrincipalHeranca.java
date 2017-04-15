package aula02;

import temp.ClientePF;

public class ProgramaPrincipalHeranca {

	public static void main(String[] args) {
			ClientePF clipf = new ClientePF();
			clipf.setCpf("9090909");
			clipf.setNome("Jão");
			
			
			ClientePJ clipj = new ClientePJ();
			clipj.setNome("Zé ME Ltda");
			clipj.setCpnj("10.999.976/0001-32");//##
			
			
			Cliente[] vetor = new Cliente[2];
			vetor[0]=clipf;
			vetor[1]=clipj;
			
			for(int i=0; i<vetor.length; i++){
				System.out.println(vetor[i].getNome());
				if (vetor[i] instanceof ClientePF){
					System.out.println(  ((ClientePF) vetor[i] )   .getCpf()     );
				}else{
					System.out.println( ( (ClientePJ) vetor[i] ).getCpnj());
				}
			}
			
	
	}

}
