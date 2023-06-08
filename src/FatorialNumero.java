
public class FatorialNumero {
	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {
			int fatorial = 1;
			
			for (int index = 1; index <= n; index++) {
				fatorial *= index;
			}
			System.out.println("O fatorial de " + n + "!= " + fatorial);;
		}
	}
}
