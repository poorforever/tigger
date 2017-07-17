package ast;

import java.io.*;


public class Help extends Expression{
	
	public int help(){
		try{
			InputStream is = new FileInputStream("help.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			try{
				String line = br.readLine();
				while(line!=null){
					System.out.println(line);
					line = br.readLine();
				}
			} catch (IOException e){System.out.println(e.getMessage());}
		} catch (FileNotFoundException e) {System.out.println(e.getMessage());}
		
		return 0;
	}
	
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
}
