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
			
			GerenciadorCliente g = new GerenciadorCliente(2);
			g.cadastrar(clipf);
			g.cadastrar(clipj);
			
			g.imprimirClientes();
			
			
	
	}

}
