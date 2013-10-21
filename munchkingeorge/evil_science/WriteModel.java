package munchkingeorge.evil_science;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteModel {
	public static void Write(String FileName, String Line1, String Line2, String Line3, String Line4, String Line5, String Line6) {
		//Check Folder (mobs\) exists and creates if not existing
		File folderExisting = new File("mobs");
	
		if (folderExisting.exists()){  
		
		}else{  
			new File("mobs").mkdir();
		}
		//Write Mob
		String filename = FileName;
		try {
			PrintWriter outputStream = new PrintWriter("mobs/" + filename + ".txt");
			outputStream.println(Line1);
			outputStream.println(Line2);
			outputStream.println(Line3);
			outputStream.println(Line4);
			outputStream.println(Line5);
			outputStream.println(Line6);
			outputStream.close();
			System.out.println("Done");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
