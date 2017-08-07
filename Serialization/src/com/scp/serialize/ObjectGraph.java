package com.scp.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	B b=new B();
}

class B implements Serializable
{
	int i=10;
}

public class ObjectGraph 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		A a=new A();
		FileOutputStream fos=new FileOutputStream("a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis=new FileInputStream("a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		A a1=(A)ois.readObject();
		
		System.out.println(a1.b.i);
	}
}
