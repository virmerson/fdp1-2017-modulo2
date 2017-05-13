package aula06;

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
					qtdExcluido++;
					funcionarios[funcionarios.length- qtdExcluido] =null;
					break;
				}
			}
		}
	}

}
