package com.scp.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class StudentInfo {
	int rollno;
	String name;
	
	public StudentInfo(int rno,String nm)
	{
		this.rollno=rno;
		this.name=nm;
	}

	public String toString()
	{
		return this.rollno + "   " + this.name;
	}
}

class SortByRno implements Comparator<StudentInfo>
{
	public int compare(StudentInfo a, StudentInfo b)
	{
		return a.rollno-b.rollno;
	}
}


class SortByName implements Comparator<StudentInfo>
{
	public int compare(StudentInfo a,StudentInfo b)
	{
		return a.name.compareTo(b.name);
	}
}

public class Student
{
	public static void main(String[] args)
	{
		ArrayList<StudentInfo> al=new ArrayList<StudentInfo>();
		al.add(new StudentInfo(101,"Snehalata"));
		al.add(new StudentInfo(67,"Dhanshree"));
		al.add(new StudentInfo(01,"Digvijay"));
		al.add(new StudentInfo(200,"Atharav"));
		
		System.out.println("unsorted list");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al,new SortByRno());
		
		System.out.println("list sorted by roll no");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al,new SortByName());
		
		System.out.println("list sorted by name");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
	}
}
