public class SmallestRepeatingString {
	
	public static String findSmallestDuplicate(String str) {
		int n=str.length();
		String smallest=null;
		
		for(int len=1; len<=n; len++) {
			for(int i=0; i<=n-len;i++) {
				String sub=str.substring(i, i+len);
				int count=0;
				
				for(int j=0; j<=n-len; j++) {
					if(str.substring(j, j+len).equals(sub)) {
						count++;
					}
				}
				if(count>1) {
					if(smallest==null || sub.length()<smallest.length()) {
						smallest=sub;
					}
				}
			}
			if(smallest != null) {
				break;
			}
		}
		return (smallest != null) ? smallest: "No duplicate substring";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abcabdabc";
		String result=findSmallestDuplicate(input);
		System.out.println(result);

	}
}
