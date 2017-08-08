package com.scp.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Books implements Comparable<Books>
{
		private int bookId;
		String author;
		
		public Books(int bookId,String author)
		{
			this.bookId=bookId;
			this.author=author;
		}
		
		public String toString()
		{
			return this.bookId+""+this.author;
		}
		
		public int compareTo(Books b)
		{
			//return this.author.compareTo(b.author);
			return this.bookId-b.bookId;
		
		}
		
		public static void main(String[] args)
		{
			ArrayList<Books> al=new ArrayList<Books>();
			
			al.add(new Books(100,"yyy"));
			al.add(new Books(12,"zyz"));
			al.add(new Books(83,"pqr"));
			
			Collections.sort(al);
			
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			
			
		}
}
