package aula06;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario2 implements Gerenciador<Funcionario> {
	private List<Funcionario> funcionarios;
	
	public GerenciadorFuncionario2() {
		//Constroi o vetor com a qtd fornecidad do parametro
		funcionarios =  new ArrayList<>();
	}
	
	
	@Override
	public void cadastrar(Funcionario func) {
		funcionarios.add(func);
	}

	@Override
	public void excluir(Funcionario func) {
		funcionarios.remove(func);
	}

	@Override
	public void imprimir() {
		for (Funcionario f: funcionarios){
			System.out.println(f);
		}
		
	}

}
