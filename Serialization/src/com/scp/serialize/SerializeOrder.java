package com.scp.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * in serialization order is imp...in which order we serialized in the same order only we have to De-Serialize
 * 
 */


class Student implements Serializable
{
	int studId=12;
	String sname="sneha";
}

class Employee implements Serializable
{
	int empId=408;
	String empName="ketki";
}

class Product implements Serializable
{
	int productId=101;
	String pName="digvijay";
}


public class SerializeOrder 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student s1=new Student();
		Employee e1=new Employee();
		Product p1=new Product();
		
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(e1);
		oos.writeObject(p1);
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		Employee e2=(Employee)ois.readObject();
		Product p2=(Product)ois.readObject();
		
		System.out.println(s2.studId+"----"+s2.sname);
		
		System.out.println("\n"+e2.empId+"-----"+e2.empName);
		
		System.out.println("\n"+p2.productId+"------"+p2.pName);
	}
}
