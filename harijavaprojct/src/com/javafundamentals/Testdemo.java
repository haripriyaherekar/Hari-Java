package com.javafundamentals;

public class Testdemo {
	int id;
	String name;
	
	
	Testdemo(int id,String name){
		System.out.println("parametric con called");

		this.id=id;
		this.name=name;
		}
	public static void main(String[] args) {
		Testdemo t = new Testdemo(1,"hari");
		t.show();
	}
     void show() {
    	 System.out.println(id);
    	 System.out.println("String");
     }
     }
