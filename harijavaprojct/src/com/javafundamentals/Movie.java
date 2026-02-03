package com.javafundamentals;

public class Movie {
	String heroname;
	String heroinname;
	String moviename;
	double budget;
	
	 Movie(){
		 this("AA");
		 System.out.println("no arg constructors");
		
	
	 }
 
	 Movie( String heroname){
		 this("AA","RASH");
		 System.out.println("one arg constructors");
	 this.heroname=heroname;
	 }
	 
	 Movie(String heroname ,String heroinname){
		 this("AA","RASH","puspha");
		 System.out.println("two arg constructors");
		 this.heroname=heroname;
		 this.heroinname=heroinname;
	 
	 }
 Movie(String heroname ,String heroinname,String moviename){
		 this("AA","RASH","puspha",200000.00);
		 System.out.println("three arg constructors");
		 this.heroname=heroname;
		 this.heroinname=heroinname;
		 this.moviename=moviename;
	 }
	 
	 Movie(String heroname ,String heroinname,String moviename,double budget){
		 System.out.println("four arg constructors");
		 this.heroname=heroname;
		 this.heroinname=heroinname;
		 this.moviename=moviename;
		 this.budget=budget;
	 }

	public static void main(String[] args) {
		Movie m =new Movie();
		m.show();

	}
	void show() {
		System.out.println("heroname:"+heroname);
		System.out.println("heroinname:"+heroinname);
		System.out.println("moviename:"+moviename);
		System.out.println("budget:"+budget);
		}
}
