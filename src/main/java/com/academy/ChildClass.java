package com.academy;

import java.util.Iterator;

public class ChildClass extends ParentClass {

	@Override
	public void displayElements() {
		// TODO Auto-generated method stub
		
		insertElements();
		Iterator<Integer> itr = al.iterator();
		if (al != null) {
			while (itr.hasNext()) {
				Integer name = itr.next();
				System.out.println(name);
			}
		} else {
			System.out.println("list is empty" + null);
		}
	}
}
