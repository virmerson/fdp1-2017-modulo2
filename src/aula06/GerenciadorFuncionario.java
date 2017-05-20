package aula06;

import java.util.List;

public class GerenciadorFuncionario implements Gerenciador<Funcionario> {
	private Funcionario[] funcionarios;
	private int posicao=0;
	private int qtdExcluido=0;
	
	public GerenciadorFuncionario(int qtd) {
		//Constroi o vetor com a qtd fornecidad do parametro
		funcionarios =  new Funcionario[qtd];
	}
	
	@Override
	public void cadastrar(Funcionario func) {
		if (posicao<funcionarios.length)
			funcionarios [posicao++] = func;
	}

	@Override
	public void excluir(Funcionario func) {
		for(int i= 0 ; i<funcionarios.length; i++){
			
			if (funcionarios[i]!=null){
				if (func.getCpf().equals(funcionarios[i].getCpf())){
					for (int j = i ; j < funcionarios.length-1; j++ ){
						funcionarios[j] =  funcionarios[j+1];
					}
					
					posicao --;
					qtdExcluido++;
					funcionarios[funcionarios.length- qtdExcluido] =null;
					break;
				}
			}
		}
	}

	@Override
	public void imprimir() {
		for (Funcionario f: funcionarios){
			System.out.println(f);
		}
		
	}

	@Override
	public void alterar(int indice, Funcionario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
