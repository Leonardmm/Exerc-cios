import java.util.Scanner;

public class sobrenome {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	System.out.println("Olá, qual o seu sobrenome?");
	String sobrenome = leitor.nextLine().toUpperCase();
	int tamanhoSobrenome = sobrenome.length();
	
	System.out.println("Olá, " + sobrenome + ". Seu sobrenome contém " + tamanhoSobrenome + " letras.");
	
	}
}
