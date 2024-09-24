//exercise statement link: https://joaquim.craft.me/2024.02-ps2-lab-classe-abstrata

package lab3;

public class Main {
	public static void main(String[] args) {
		
		Campanha sm = new SocialMedia(); //polymorphism: i'm using the same class to instance objects of 2 subclasses
		sm.avaliar();
		sm.configurar();
		sm.executar();
		
		System.out.println();
		
		Campanha e = new Email();
		e.avaliar();
		e.configurar();
		e.executar();
	}
}

