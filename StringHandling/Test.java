package StringHandling;

public class Test {
	public static void main(String[] args) {
		
		String str=new String();
		str ="This is Suraj";
		String str1=str.replaceAll(" ","");
		int num=1;
		
		for(int i=0;i<str1.length();i++) {
			
			System.out.println(num+"="+str1.charAt(i));
			num++;
			
			
		}
		
	}
}

