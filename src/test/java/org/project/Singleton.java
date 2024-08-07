package org.project;

public class Singleton {
	
	public static Singleton s1 = null;
	
	public static Singleton getInstance() {
		
		if(s1==null) {
			 s1 = new Singleton();
		}
		return s1;
		
	}
	
	private Singleton() {
		
	}
	
	public static void main(String[] args) {
		Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
	}

}
