package com.scp.comparable;

public class Person implements Comparable<Person>
{

	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return this.name +"    "+this.age;
	}
	
	public int compareTo(Person p)
	{
		if(this.age==p.age)
			return 0;
		else
			return this.age > p.age ? 1: -1;
	}
	
	public static void main(String[] args)
	{
		Person p1=new Person("abc",45);
		Person p2=new Person("xyz",50);
		
		int val=p1.compareTo(p2);
			switch(val)
			{
			case -1:
					System.out.println(p2.getName() +".........is older");
					break;
			case  1:
					System.out.println(p1.getName() +".........is older");
					break;
					
			default:
					System.out.println("two persons of the same age");
			
			}
				
		
	}
	
}
