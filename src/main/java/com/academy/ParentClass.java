package com.academy;

import java.util.ArrayList;

public abstract class ParentClass {
	ArrayList<Integer> al = null;
	public void insertElements() {
		al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);	
		//System.out.println(al);
	}
	public abstract void displayElements();
		
	

}
