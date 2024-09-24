package lab2;

import java.util.List;

public interface GerenciadorNomes {
	int max_caracteres_nomes = 20;
	
	List<String> obterNomes();
	
	public void adicionarNome(String nome);
}
