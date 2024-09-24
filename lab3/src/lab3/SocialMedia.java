package lab3;

public class SocialMedia extends Campanha{
	
	@Override
	public void configurar() {
		System.out.println("social media - configuracao");
	}
	
	@Override
	public void executar() {
		System.out.println("social media - execucao");
	}
	
	@Override
	public void avaliar() {
		System.out.println("social media - avaliacao por curtidas, comentarios e compartilhamentos");
	}
}
