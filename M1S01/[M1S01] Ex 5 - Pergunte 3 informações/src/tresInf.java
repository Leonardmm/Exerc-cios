import java.util.Scanner;

public class tresInf {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	System.out.println("Qual o seu nome?");
	String nome = leitor.nextLine();
	System.out.println("Quantos anos você tem?");
	int idade = leitor.nextInt();
	System.out.println("Você gosta de praticar algum esporte?");
	String esporte = leitor.nextLine();
	boolean pergunta = "sim".equalsIgnoreCase(leitor.nextLine());
				
		System.out.println("O seu nome é " + nome + ", você tem " + idade + " anos e " + (pergunta ? "gosta" : "não gosta") + " de praticar esportes.");
	}
		
	}

	


