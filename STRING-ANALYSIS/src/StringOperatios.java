

public class StringOperatios {

	
	public static void main(String[] args) {
		/*
		 * String s1=new String("i can change u"); String s2=new
		 * String("i can change u");
		 * 
		 * System.out.println((s1==s2)); // false System.out.println(s1.equals(s2));
		 * //true
		 * 
		 * String s3="ican";
		 * 
		 * System.out.println(s1==s3); //false String s4="i can change u";
		 * System.out.println(s3==s4); //true String s5="i"+"can";
		 * System.out.println(">>>>"); System.out.println(s3==s5); //true
		 * 
		 * String s6="i can"; String s7=s6+" change u"; // run time
		 * System.out.println(s3==s7); // false final String s8="i can"; //
		 * //s8="Hi how are you"; String s9=s8+" change u"; System.out.println(s3==s9);
		 * //true System.out.println(s6==s8);//true
		 * 
		 * 
		 * 
		 */

			String s="ABC";
			System.out.println(s);
			System.out.println("hexa code before modification >>"+s.hashCode());
			s="BCD";
			System.out.println(s);
			System.out.println("hexa code before modification >>"+s.hashCode());
			String s1="ABC";
			System.out.println(s1);
			System.out.println("hexa code before modification s1 >>"+s1.hashCode());
			
			
			final String s2="XYZ";
			System.out.println(s2);
			System.out.println("hexa code before modification >>"+s2.hashCode());
			
			//s2="YXA";
			System.out.println(s2);
			System.out.println("hexa code before modification >>"+s2.hashCode());
			
			//System.out.println(s);
	}
}
