import java.util.Scanner;

public class perguntar {
	
	public static void main(String[] args) {

		
	Scanner leitor = new Scanner(System.in);
	System.out.println("Qual o seu sobrenome?");
	String sobrenome = leitor.nextLine();
	System.out.println("Qual o seu nome?");
	String nome = leitor.nextLine();
	int tamanhoNome = nome.length();
	int tamanhoSobrenome = sobrenome.length();
	int tamanho = tamanhoNome + tamanhoSobrenome;
	
	
	System.out.println("Olá " + nome + " " + sobrenome + ", seu nome tem " + tamanho + " letras.");
	
	
	
}
	
	
}
