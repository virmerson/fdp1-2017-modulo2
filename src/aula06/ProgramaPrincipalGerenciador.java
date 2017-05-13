package aula06;

public class ProgramaPrincipalGerenciador {
	
	public static void main(String[] args) {
		Gerenciador<Funcionario> gerenciador = new  GerenciadorFuncionario(3);
		
		Funcionario f1 =  new Funcionario();
		f1.setCpf("777");
		
		Funcionario f2 =  new Funcionario();
		f2.setCpf("888");
		
		Funcionario f3 =  new Funcionario();
		f3.setCpf("999");
		
		gerenciador.cadastrar(f1);
		gerenciador.cadastrar(f2);
		gerenciador.cadastrar(f3);
		
		
		gerenciador.excluir(f3);
		
		
	
		
		
		
	}

}
