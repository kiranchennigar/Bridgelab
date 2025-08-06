public class PrintOneToHundred {
	PrintOneToHundred(int n){
		System.out.println(n);
		if(n<100) new PrintOneToHundred(n+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintOneToHundred(1);

	}

}