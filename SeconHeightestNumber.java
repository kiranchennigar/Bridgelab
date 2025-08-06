public class SeconHeightestNumber {
	public static int SecondHeightest(int[] arr) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		//System.out.println(first);
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}
			else if(num>second && num<first) {
				second=num;
			}            
		}
	return second==Integer.MIN_VALUE ? -1:second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,1,4,4,5,5,2};
		System.out.println(SecondHeightest(arr));

	}
}

