package dataManagement;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileManager {
	
	
	public FileManager() {
	}
	public String getHelicopterSkin(int skin) {
		try{
		// Open the file that is the first 
		// command line parameter
		FileInputStream fstream = new FileInputStream("HelicopterSkins.txt");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine ;
		//Read File Line By Line
			for(int i = 0; i < skin; i++){
				strLine = br.readLine();
			}
		return strLine = br.readLine();
		}catch (Exception e){//Catch exception if any
			return "Error: " + e.getMessage();
		}
	}
}
