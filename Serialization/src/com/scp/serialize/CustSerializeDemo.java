package com.scp.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String unm="snehalatak";
	transient String pwd="sneha";
	
	private void writeObject(ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException
	{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
	}
}

public class CustSerializeDemo {
	
public static void main(String[] args) throws IOException, ClassNotFoundException
{
	Account ac=new Account();
	
	System.out.println(ac.unm+"------"+ac.pwd);
	
	
	FileOutputStream fos=new FileOutputStream("x.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(ac);
	
	FileInputStream  fis=new FileInputStream("x.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Account ac2=(Account)ois.readObject();
	
	System.out.println(ac2.unm+"----"+ac2.pwd);
}

}
