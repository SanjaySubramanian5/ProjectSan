package org.project;

public class SingletonExtendClass {
public static void main(String[] args) {
	
	Singleton s2 = Singleton.getInstance();
	System.out.println(System.identityHashCode(s2));
}
}
//1651191114 object memory