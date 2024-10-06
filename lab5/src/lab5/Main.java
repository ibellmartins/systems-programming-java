package lab5;

import java.util.*;

public class Main {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		
		  System.out.println("Escolha o armazenamento: ");
		  System.out.println("1 - Memória");
		  System.out.println("2 - Banco de dados");
		  
		  int opcao = sc.nextInt();
		  
		  while (opcao != 1 && opcao != 2) {
			  System.out.println("opcao invalida! tente de novo por favor");
			  opcao = sc.nextInt();
		  }
		  
		  if (opcao == 1) {
			    GerenciadorNomes gNomes = new GerenciadorNomesMem();
			    Ihm ihm = new Ihm(gNomes);
			    ihm.dialogar();
		  } else {
			    GerenciadorNomes gNomes = new GerenciadorNomesBD();
			    Ihm ihm = new Ihm(gNomes);
			    ihm.dialogar();
		      }
		    
		    sc.close();
	}
}
