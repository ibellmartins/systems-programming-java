package lab3;

public class Email extends Campanha{
	
	@Override
	public void configurar() {
		System.out.println("email - configuracao");
	}
	
	@Override
	public void executar() {
		System.out.println("email - execucao");
	}
	
	@Override
	public void avaliar() {
		System.out.println("email - avaliacao por taxa de abertura e cliques");
	}
	
}
