public class RearrangeCharacter {
	 public static void main(String[] args) {
	        System.out.println(rearrange("aaabbc"));
	    }

	    static String rearrange(String st) {
	        char[] characters = st.toCharArray();
	        for (int i = 0; i < st.length() - 1; i++) {
	            int right = i;
	            while (characters[right] == characters[right + 1]) {
	                right++;
	            }
	            swap(characters, i + 1, right + 1);
	        }
	        return new String(characters);
	    }

	    static void swap(char[] chs, int start, int end) {
	        char temp = chs[start];
	        chs[start] = chs[end];
	        chs[end] = temp;
	    }

}
