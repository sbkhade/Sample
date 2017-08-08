package com.scp.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonInfo 
{
	public static void main(String[] args)
	{
		ArrayList<Biodata> al=new ArrayList();
		
		al.add(new Biodata(18,"Athrav"));
		al.add(new Biodata(7,"Rushi"));
		al.add(new Biodata(67,"Prakash"));
		al.add(new Biodata(25,"Digvijay"));
		al.add(new Biodata(12,"Dhiru"));
		
		System.out.println("\nunsorted list");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("\nsorted by name");
		
		Collections.sort(al,new Sname());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("\nsort by age");
		Collections.sort(al,new SortByAge());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}

class Biodata
{
	int age;
	String name;
	
	public Biodata(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString()
	{
		return "name = "+this.name+"      age = "+this.age;
	}
}

class Sname implements Comparator<Biodata>
{
	public int compare(Biodata b1,Biodata b2)
	{
		return b1.name.compareTo(b2.name);
	}
}

class SortByAge implements Comparator<Biodata>
{
	public int compare(Biodata b1,Biodata b2)
	{
		return b1.age-b2.age;
	}
}