package revisão;

public class Ex17 {
	public static void main ( String [] args) {
		double francisco = 1.10;
		double sara = 1.50;
		int anos = 0;
		
		while (francisco<sara) {
			francisco = francisco + 0.03;
			sara =  sara + 0.02;
			anos = anos + 1;
		}
		System.out.println("francisco será maior que sara em " + anos + " anos");
	}

}
