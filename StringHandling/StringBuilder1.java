package StringHandling;

public class StringBuilder1 {
	
	
		public static void main(String[] args) {
			StringBuilder sb=new StringBuilder();
			
			System.out.println(sb.capacity());
			sb.append("Hello");
			System.out.println(sb);
			System.out.println(sb.capacity());
			
			sb.append("Hello this is Arti");
			sb.replace(0,5,"Bye");
			System.out.println(sb);
			System.out.println(sb.capacity());
			
			StringBuffer sf=new StringBuffer();
			sf.append(" Jaigaonkar");
			System.out.println("String Buffer");
			
			System.out.println(sf);
			System.out.println(sf.substring(9));
			
			}


}
