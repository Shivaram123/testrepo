package initials.practice.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLearns {

	public void getFIleStuff() throws IOException
	{
		try {
			File file = new File("myfile.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("Life is awesome");
			pw.println("Life is awesome");
			pw.println("Life is awesome");
			pw.println("Life is awesome");
			pw.println("Life is awesome");
			pw.write("hellp ");
			pw.close();
			System.out.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		BufferedReader br = null;
		try {
			File file = new File("myfile2.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			PrintWriter pwd = new PrintWriter(file);
			pwd.println("new file");
			pwd.println("new file2");
			pwd.println("new file3");
			pwd.println("new file4");
			
			pwd.close();
			
			br = new BufferedReader(new FileReader("myfile2.txt"));
			while(br.readLine() != null)
			{
				System.out.println(br.readLine());
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			br.close();
		}
	}

}
