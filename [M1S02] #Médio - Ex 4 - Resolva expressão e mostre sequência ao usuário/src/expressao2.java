
public class expressao2 {
	public static void main(String[] args) {
		
		//!(a + b == c) || ((c != 0) && (b - c >= 19) )
		
		int a = 34, b = 12, c = 8;
		System.out.println("As váriaveis são: a = 34, b = 12, c = 8");
		System.out.println("R1: a + b == c -> " + (a + b == c));
		System.out.println("R1: !R1 -> " + !(a + b == c));
		System.out.println("R2: c != 0 -> " + (c != 0));
		System.out.println("R3: b - c >= 19 -> " + (b - c >= 19));
		System.out.println("R4: R2 && R3 -> " + ((c != 0) && (b - c >= 19)));
		System.out.println("R5: R1 || R4 -> " + (!(a + b == c) || ((c != 0) && (b - c >= 19))));
		
		
		
		
	
}
}
