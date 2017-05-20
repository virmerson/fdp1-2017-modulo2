package aula07;

import aula06.Funcionario;
import aula06.Gerenciador;
import aula06.GerenciadorFuncionario2;

public class ProgramaPrincipalGerenciador {
	public static void main(String[] args) {
		
		Gerenciador<Funcionario> gerenciador = new GerenciadorFuncionario2();
		
		Funcionario jao = new Funcionario();
		jao.setId(1);
		jao.setNome("Jão");
		
		
		Funcionario ze= new Funcionario();
		ze.setId(2);
		ze.setNome("Zé");
		
		
		gerenciador.cadastrar(jao);
		gerenciador.cadastrar(ze);
		
		gerenciador.imprimir();
		
		
		Funcionario novoZe= new Funcionario();
		novoZe.setId(2);
		novoZe.setNome("Zé da Silva");
		
		
		
		gerenciador.alterar(novoZe);
		
		gerenciador.imprimir();
		
		
		
	}
}
