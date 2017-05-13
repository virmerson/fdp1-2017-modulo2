package aula06;

public interface Gerenciador <T> {

	void cadastrar(T o);
	void excluir(T o);
	void imprimir();
	
}
