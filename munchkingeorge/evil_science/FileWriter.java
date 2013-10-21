package munchkingeorge.evil_science;

import java.io.*;

public class FileWriter {
	public static void Write(String args, String FileName, String Text) {
		//Check Folder (mobs\) exists and creates if not existing
		File folderExisting = new File("mobs");
	
		if (folderExisting.exists()){  
		
		}else{  
			new File("mobs").mkdir();
		}
		//Write Mob
		String filename = FileName;
		String text = Text;
		try {
			PrintWriter outputStream = new PrintWriter("mobs/" + filename + ".txt");
			outputStream.println(text);
			outputStream.close();
			System.out.println("Done");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void Read(String args, String FileName) {
		String filename = FileName;
		
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("mobs/" + filename + ".txt")); 

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}