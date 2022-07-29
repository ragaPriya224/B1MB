package com.practice.springbootsearchrestapidemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	//	static int c; 
	public static void main(String[] args) {
		//		static int a = 10;
		Demo d = new Demo();
//		d.m1();
//		d.listIteratorDemo();
//		d.demoDate();
		d.stringPractice();

	}
	public void m1(){
		//		//		static int b = 20;
		//		String[] name = new String[] {"user1", "abc", "user43"};
		//		for(String ename:name){
		//			//body of the loop
		//			System.out.println(ename.concat("hellow"));
		//		}
		//		
		//		
		//		if(a>b) {
		//			
		//		}else {
		//			
		//		}

		ArrayList al = new ArrayList();
		al.add("a");
		al.add("p");
		al.add("s");
		al.add("g");
		al.add(5);
		System.out.println("array list" +al);
		Iterator i = al.iterator();
		System.out.println("initial data " +i);
		while(i.hasNext()) {		
			if(i.next().equals(5)) {
				i.remove();
			}
		}
		System.out.println(al);

	}
	public void listIteratorDemo() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		//			System.out.println(list);
		ListIterator listIterator = list.listIterator();
		listIterator.add("D");
		while(listIterator.hasNext()) {
			System.out.println("***");
			if(listIterator.next().equals("C")){
				listIterator.set("Z"); //replace
			}
	
		}

		System.out.println(list);
	}
	
	public void demoDate() {
		LocalDate localDate = LocalDate.now().minusDays(4);
		System.out.println(localDate);
		
		 LocalDateTime dateTime = LocalDateTime.now(); 
		 System.out.println(dateTime);
	}
	public void stringPractice() {
		String s = new String("user");
		s.concat("name");
		System.out.println(s);
	
		StringBuffer sb = new StringBuffer("user");
		sb.append("name");
		System.out.println(sb);
		
		StringBuilder sbuilder = new StringBuilder("user");
		sbuilder.append("name");
		System.out.println(sbuilder);
	}




}
