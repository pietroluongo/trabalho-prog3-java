package main;

import util.*;

public class Main
{

	public static void main(String[] args)
	{
		try
		{
			ArgParse a = new ArgParse(args);
			a.LoadData();
		}
		/*
		catch(InvalidTeacherCodeException e)
		{
			System.out.println(e);
		}*/
		catch(Exception e)
		{
			System.out.println("UNHANDLED EXCEPTION CAUGHT!");
			e.printStackTrace();
		}
	}

}