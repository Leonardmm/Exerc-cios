import java.util.Scanner;

public class iniciais {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	System.out.println("Qual o seu sobrenome?");
	String sobrenome = leitor.nextLine();
	System.out.println("Qual o seu nome?");
	String nome = leitor.nextLine();
	char plNome = nome.charAt(0);
	char plSobrenome = sobrenome.charAt(0);
	
	System.out.println("Olá " + nome + " " + sobrenome + ", suas iniciais são " + plNome + "." + plSobrenome + ".");
	}

}
