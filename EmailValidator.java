public class EmailValidator {
	public static boolean isValidEmail(String email) {
		int atIndex=email.indexOf('@');
		int lastIndex=email.lastIndexOf('@');
		if(atIndex<=0 || atIndex != lastIndex) {
			return false;
		}
		
		//String F_half=email.substring(0,atIndex);
		String S_half=email.substring(atIndex+1);
		
		int dotIndex=S_half.indexOf('.');
		if(dotIndex <=0 || dotIndex==S_half.length()-1) {
			return false;
		}
		String Extension=S_half.substring(S_half.lastIndexOf('.')+1);
		if(Extension.length() < 2) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="test@gmail.com";
		System.out.println(isValidEmail(email));
		
	}

}
