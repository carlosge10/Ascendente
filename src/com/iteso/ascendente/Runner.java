package com.iteso.ascendente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Runner {
	
	public static void main(String []args) {
		try {
			File file;
			BufferedReader br;
			file = new File("src/input.txt");
			br = new BufferedReader(new FileReader(file));
			System.out.println("reading file...");
			SLRTable table = new SLRTable(file, br);
			System.out.println("Here's your table...");
			table.printTable();
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
