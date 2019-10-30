package JavaAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counting_Words {

	public static void main(String[] args) throws IOException {
		File file = new File("W:\\temp.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		
		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 0;
		int paragraphCount = 1;
		int whitespaceCount = 0;
		
		while((line = reader.readLine()) != null) 
		{
			if(line.equals("")) 
			{
				paragraphCount++;
			}
			if(!(line.equals(""))) 
			{
				
			}
			
			
		}
			

	}

}
