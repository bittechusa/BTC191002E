package com;
//static class D{}
public abstract class Demo {
	
	
	
	static class B{}
	int a=8;//instance 
	final int c=8;//constant variable mean u cannot change
	
	static int b=8;//class variable
	Demo(int a) {
		//nonaccess
		//static int c=9;
	a++;//9 9
	b++;//9 10
	//c++;
	System.out.println(a);
	System.out.println(b);

	}
	public abstract void m6();
	public static void m2() {
		//a++;
		b++;
		//System.out.println(a);
		System.out.println(b);
	}
	
	public abstract void m3();
	public static void m2(int a) {
		//a++;
		b++;
		//System.out.println(a);
		System.out.println(b);
	}

}
