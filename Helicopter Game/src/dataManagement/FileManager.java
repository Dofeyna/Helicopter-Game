package dataManagement;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileManager {
	
	
	private BufferedReader br;
	private BufferedReader br2;
	private BufferedReader br3;
	private BufferedReader br4;
	private PrintWriter writer;
	private String strLine1;
	private BufferedReader br5;
	private String strLine;
	private BufferedReader br6;
	private String strLine2;
	public FileManager() {
	}
	public String getHighScore()
	{
		try{
			// Open the file that is the first 
			// command line parameter
			FileInputStream fstream = new FileInputStream("scores.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			br2 = new BufferedReader(new InputStreamReader(in));
			String strLine = "";
			for(int i = 0; i < 1; i++){
				strLine = br2.readLine();
			}
			return strLine;
			}catch (Exception e){//Catch exception if any
				return "Error: " + e.getMessage();
			}
	}
	public void setTotalScore(int s) throws FileNotFoundException
	{
		try{
			// Open the file that is the first 
			// command line parameter
			FileInputStream fstream = new FileInputStream("scores.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			br = new BufferedReader(new InputStreamReader(in));
			String strLine1 = "";
			String strLine2 = "";
			for(int i = 0; i < 1; i++){
				strLine1 = br.readLine();
			}
			for(int i = 1; i < 2; i++){
				strLine2 = br.readLine();
			}
			PrintWriter writer = new PrintWriter("scores.txt");
			writer.print("");
			int totalScore = Integer.parseInt(strLine2);
			totalScore+=s;
			writer.println(strLine1);
			writer.print(""+totalScore);
			writer.close();
		}catch (Exception e){//Catch exception if any
			
			}
	}
	public void setHighScore(String s) throws FileNotFoundException
	{
		try{
			// Open the file that is the first 
			// command line parameter
			FileInputStream fstream = new FileInputStream("scores.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			br3 = new BufferedReader(new InputStreamReader(in));
			strLine1 = "";
			String strLine2 = "";
			for(int i = 0; i < 1; i++){
				strLine1 = br3.readLine();
			}
			for(int i = 1; i < 2; i++){
				strLine2 = br3.readLine();
			}
			PrintWriter writer = new PrintWriter("scores.txt");
			writer.print("");
			writer.println(s );
			writer.print(strLine2);
			writer.close();
		}catch (Exception e){//Catch exception if any
			
			}
	}

	public String getTotalScore()
	{
		try{
			// Open the file that is the first 
			// command line parameter
			FileInputStream fstream = new FileInputStream("scores.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			br6 = new BufferedReader(new InputStreamReader(in));
			for(int i = 1; i < 2; i++){
				strLine2 = br6.readLine();
			}
			return strLine2 = br6.readLine();
			}catch (Exception e){//Catch exception if any
				return "Error: " + e.getMessage();
			}
	}
	public String getHelicopterSkin(int skin) {
		try{
		// Open the file that is the first 
		// command line parameter
		FileInputStream fstream = new FileInputStream("HelicopterSkins.txt");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		br5 = new BufferedReader(new InputStreamReader(in));
		//Read File Line By Line
			for(int i = 0; i < skin; i++){
				strLine = br5.readLine();
			}
		return strLine = br5.readLine();
		}catch (Exception e){//Catch exception if any
			return "Error: " + e.getMessage();
		}
	}
}
