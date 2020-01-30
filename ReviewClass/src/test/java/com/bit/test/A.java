package com.bit.test;

public abstract class A {
 //nested class all access modifier is ok
	String color="red";
A(String d,int s){
		
	}
  A(int x,String s){
		
	}
  A(String c)
  {
	  color=c;
  }
  private void m1() {
	  System.out.println(color);
  }
  
  
  //modify an object ,state and behaviour
  //1.access modifier---to give access label
  //default, public protected and private
  //instantiate and inheritance
//  public---all
//  private--no
//  default--same package yes but different package no
  
  //protected--yes but different package no using instantiate but inheritance yes
  
 // except if private variable--using getter setter access
  private int a=9;
  public void setA(int a) {
	  this.a=a;
  }
  public int getA() {
	  return a;
  }
  
  //2. nonaccess modifier--provides aome attribute or change attribute
    int h=7;
  
   abstract  void eat() ;
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   void m6() {
//String result;
int age = 0;
//	   if(6<8){
//	 	  
//	   }
//	    else if(7<9)
//	    {
//	 	   
//	    }else {
//	    	
//	    }
//	   
//	   
//	   switch(result)
//	   {
//	   case "pass";
//	   {
//		   
//	   }case "fail":
//	   {
//		break;   
//	   }
//	   default:
//	   }
	   
	//loop
	   
	   while(age==7) {
		   System.out.println("hi");
	   }
	   
	   do {
		   
	   }while(age>5);
	  
	   for(int i=1;i<100;i++)
	   {
		   if(i%3==0)
		   {
			   break;
		   }
	   }
	   
	   for(String s:"hi how are u".split(" "))
	   {
		   System.out.println(s);
	   }
	   
	   //String s;
	   
	   String s="how are you";
	   char c[]=s.toCharArray();
	   StringBuilder sb=new StringBuilder();
	   for(int i=c.length-1;i>=0;i--)
	   {
		  sb.append(c[i]);
	   }
	   System.out.println(sb);
	   
	   for(int i=0;i<c.length;i++)
	   {
		   for(int j=i+1;j<c.length;j++)
		   {
			   if(c[i]==c[j])
			   {
				   System.out.println("duplicate");
			   }
		   }
	   }
   }
   
   
   
   
}


