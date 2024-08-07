package org.project;

public class SingletonCheck {
public static void main(String[] args) {
	Singleton s4 = Singleton.getInstance();
	System.out.println(System.identityHashCode(s4));
}
}
