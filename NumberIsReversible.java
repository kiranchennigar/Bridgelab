public class NumberIsReversible {
	public static int reverse(int  num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		return res;
	}
	
	public static boolean check(int num) {
		while(num>0) {
			int digit=num%10;
			if(digit%2==0) {
				return false;
			}
			num=num/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=36;
		int revnum=reverse(number);
		int add=number+revnum;
		//System.out.println(add);
		System.out.println(check(add));
	}

}
