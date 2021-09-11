

import java.util.Scanner;

public class StringDetail {
	
	public static void main(String [] args) {
		
		
		String s="Java is very beautiful language";
	System.out.println(s);
		
		String s1=new String("Java is very beautiful language ");
		//System.out.println(s1);
		
		String s2="Hello";
		String s3="World!";
		String s4=s2+s3;
		//System.out.println(s4);
		
		String s5=s2+" Guys, You are not working as expected!!";
		
		
//		System.out.println(s5);
		
//		int x=10;
//		int y =10;
//		 Integer a=10;
//		 Integer b=10;
//		 
//		 String s=new String("Hello");
//		 String s1=new String("Hello");
		 
		 //overriding 
//		 System.out.println(s==s1);
//		System.out.println(a==b);
//		System.out.println(x==y);
		
		//System.out.println(s.equals(s1));  // check if the content and address is same for objects
		// content same hai ya nahi hai 
		
		//System.out.println(s==s1);   // if memory address is same ?
		
		
		
		//what is equals method ??
		// what is == operator ?
		
		//String s="hello"+ "world"  >> helloworld
//		
//		String  s= new String("manish");
//		s=s.concat("prajapati");
//		System.out.println(s);   // manishprajapati  
//		
//		// immutability >> once declared, is permanenet, no modification at all.
//		
//		
//		
//		String s= new String("man");
		
				
		/*
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * int n= sc.nextInt(); sc.nextLine(); String [] s= new String[n];
		 * 
		 * for(int i=0;i<n;i++) { s[i]= sc.nextLine();
		 * 
		 * } for(int i=0;i<s.length;i++) { System.out.println(s[i]); }
		 */
		String s1=new String("ymca");
		// 1 in heap memory, 2 SCP 
		
		String s=new String("ymca");
		
		s.intern();
		
		StringBuffer s2= new StringBuffer("ymca");  //mutable classes 
		s2.append("ust");
		System.out.println(s2);
		
		
	}

}
