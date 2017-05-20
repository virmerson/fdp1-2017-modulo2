package aula06;

import java.util.List;

public interface Gerenciador <T> {

	void cadastrar(T o);
	void excluir(T o);
	void alterar(int indice, T o );
	List<T> buscarTodos();
	void imprimir();
	
}
