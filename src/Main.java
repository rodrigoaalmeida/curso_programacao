

public class Main {

	public static void main(String[] args) {

		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		int tamanho = vect.length;
		for (int i = 0; i < tamanho; i++) {
			System.out.println(vect[i]);
		}
		

	}

}