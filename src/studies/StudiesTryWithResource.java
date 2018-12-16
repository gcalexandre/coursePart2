package studies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudiesTryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "I:\\Alexandre\\desktop - ale\\Estudos\\2018\\Java Udemny\\Workspace-eclipse2\\CoursePart2\\arquivosTeste\\teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
				while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
	
	

}
