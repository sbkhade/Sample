package com.scp.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demos 
{
	
	int age;
	String name;
	
	public Demos(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString()
	{
		return "name = "+this.name+"      age = "+this.age;
	}

	public static  Comparator<Demos> iname=new Comparator<Demos>()
			{
				public int compare(Demos b1, Demos b2) 
				{
					return b1.name.compareTo(b2.name);
				}
			};
			
	public static  Comparator<Demos> i1=new Comparator<Demos>()
			{		
				public int compare(Demos b1,Demos b2)
				{
					return b1.age-b2.age;
				}
			};
			
			public static void main(String[] args)
			{
				ArrayList<Demos> al=new ArrayList();
				
				al.add(new Demos(18,"Athrav"));
				al.add(new Demos(7,"Rushi"));
				al.add(new Demos(67,"Prakash"));
				al.add(new Demos(25,"Digvijay"));
				al.add(new Demos(12,"Dhiru"));
				
				System.out.println("\nunsorted list");
				for(int i=0;i<al.size();i++)
				{
					System.out.println(al.get(i));
				}
				
				System.out.println("\nsorted by name");
				
				Collections.sort(al,Demos.iname);
				
				for(int i=0;i<al.size();i++)
				{
					System.out.println(al.get(i));
				}
				
				System.out.println("\nsort by age");
				Collections.sort(al,Demos.i1);
				for(int i=0;i<al.size();i++)
				{
					System.out.println(al.get(i));
				}
			}
}
