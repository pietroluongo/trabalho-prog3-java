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
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}