package com.scp.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Info implements Serializable
{
	/*int i=10;
	int j=20;
	*/
	
	/*
	transient int i=10;
	int j=20;
	
	*OUTPUT=0.....20
	*
	*transient....ignores original value and save default value to file
	*
	*/
	
/*	transient static int i=10;
	transient int j=20;
	
	*OUTPUT=10....0
	*
	*static.....static variables are not part of object state...so they wont participate in serialization
	*declaring static variable as transient...no use..no impact
	*/
	
	/*transient int i=10;
	transient final int j=20;
	
	*OUTPUT=0...20
	*
	*final....final variables will be participated in serialization directly by their values
	*
	*final variable as transient ...no use...no impact
	*
	*/ 

	transient static int i=10;
	transient final int j=20;
	/*
	 * OUTPUT=10...20
	 */

}
public class SerializeIntro {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Info i1=new Info();
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(i1);
		
		FileInputStream fis =new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Info i2=(Info)ois.readObject();
				
				System.out.println(i2.i+"__"+i2.j);
	}
}

