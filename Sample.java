package org.git;

public class Sample 
{
	public void method()
	{
		int i=10;
		System.out.println(i);
	}
	public void method(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.method();
		s.method(10);
	}

}
