package pratica4;

import java.util.ArrayList;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
			
			
			int opcao, n, sentenca=0;
			Scanner ler  = new Scanner(System.in);
			String Frase;
			System.out.println("Digite uma frase: ");
			Frase=ler.nextLine();
			
			do {
			//Frase=Frase.split(",");
				
				System.out.println("(1) N�mero de senten�as (ponto final, exclama��o e interroga��o) ");
				System.out.println("(2) N�mero de Palavras ");
				System.out.println("(3) N�mero de Vogais ");
				System.out.println("(4) N�mero de Consoantes ");
				System.out.println("(5) Sair ");
				opcao=ler.nextInt();
			
				switch(opcao) 
					{
					case 1:
						n = Frase.length(); //tamanho da string
						for (int i=0; i<n; i++) {
					if((Frase.charAt(i) == '.') || (Frase.charAt(i) == '!') || (Frase.charAt(i) == '?')) 
						sentenca++;
						}
					System.out.println("Numero de senten�a �: "+sentenca);
					
					break;
						
					case 2:
						int var = Frase.split(" ", -1).length - 1;
						System.out.println((var+1) + " palavras");
					break;
				
					case 3:
						n = Frase.length(); //tamanho da string
						for (int i=0; i<n; i++) {
					if((Frase.charAt(i) == 'A') || (Frase.charAt(i) == 'E') || (Frase.charAt(i) == 'i') || (Frase.charAt(i) == 'O') || (Frase.charAt(i) == 'U')) 
						sentenca++;
						}
					System.out.println("Numero de vogais �: "+sentenca);
					break;
				
					case 4:
					break;
				
					default:
						System.out.print("Finalizado");
						break;
					
				}		
			}while(opcao!=5);
		}
	}
