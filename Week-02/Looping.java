public class Looping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		for(int a = 0; a < 5; a++) {
			System.out.print("For Loop : "+a);
		}
		while(i < 3) {
			System.out.print("while Loop "+i);
			i++;
		}
		do {
			System.out.print("Do while "+j);
		} while(j > 3);
	}
}