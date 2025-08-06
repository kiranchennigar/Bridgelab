public class ReverseOnlyDigits {
	public static String reverseDigits(String input) {
		char [] chars=input.toCharArray();
		int left=0;
		int right=chars.length-1;
		while(left<right) {
			while(left<right && !Character.isDigit(chars[left])) {
				left++;
			}
			while(left<right && !Character.isDigit(chars[right])) {
				right--;
			}
			if(left<right) {
				char temp=chars[left];
				chars[left]=chars[right];
				chars[right]=temp;
				left++;
				right--;
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="a1b2c3d4";
		String output=reverseDigits(input);
		System.out.println(output);

	}
}
