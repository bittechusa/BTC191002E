package util;

import org.junit.Test;

public  class StringManupolation {
	
	
	String s="how are you";
	String s1=new String("how are you");
	StringBuffer sb=new StringBuffer("how are you");
	@Test
	public void test1() {
		
	
		String s2=s.concat(" doing");
		System.out.println(s2);
		sb.append(" doing");
		System.out.println(sb);
		
		char c=s.charAt(2);
		int v="How".compareTo("how");
		"How".compareToIgnoreCase("how");
		
		System.out.println(v);
		String s3=s.concat(s2);
		boolean b=s.contains("you");
		boolean b1=s.endsWith("you");
		s.equals(s2);
		
		if(s1==s2)
		{
			
		}
		
		s.equalsIgnoreCase("");
		int h="bA".hashCode();
		int h1="bAa".hashCode();
		if(h==h1)
		{
			
		}
		//  from first yo find third a
		//united state of america
		int a1=s.indexOf('a');
		int a2=s.indexOf('a', a1+1);
		int a3=s.indexOf('a', a2+1);
		System.out.println(s.charAt(a3));
		
		//from last to find a
		int a4=s.lastIndexOf('a');
		int a5=s.lastIndexOf('a', a4-1);
		int a6=s.lastIndexOf('a', a5-1);
		System.out.println(s.charAt(a6));
		
		boolean b3=s.isEmpty();
		s.length();
		String s5=s.replace("you", "u");
		s.replaceAll("%,^", "");
		String s6[]=s.split(" ");//array holds more than one value with same type by index in memory
		//memory always start from o on the other hand length start from 1 that means
	//length always one bigger than inde
	
}
public void cbuffer() {
	sb.append("kh");
	sb.delete(2, 5);
	sb.deleteCharAt(3);
	sb.setCharAt(4, 'e');
	sb.reverse();
	StringBuilder sd=new StringBuilder();
	//all method same as StringBuffer only difference StringBuilder is faster than Buffer
	//because builder is not syncronized and buffer is syncronized
	
	//wrapper class--> Integer,Double, Boolean
	//if primitive convert to wrapper class this called autoboxing
	//if wrapper class convert to primitive is called unboxing
	Integer i=new Integer(50);
	Integer i1=i.parseInt("6");
	int a=Integer.parseInt("6");
	double d=Double.parseDouble("7.6");
	int s=(int)d;//casting
	
	
	//how to reverse a int value;
	int num=2341;
	int reversenum=0;//321
	
	
	
	while(num!=0)
	{
		int digit=num%10;
		reversenum=reversenum*10+digit;//321
		num=num/10;
	}
	System.out.println(reversenum);
}


}

		
		
		
		
		
		
		
		
		
		
		