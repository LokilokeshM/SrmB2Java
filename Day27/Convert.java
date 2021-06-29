package Day27;

import java.io.*;
public class Convert {
	public void uppercase(BufferedReader br,PrintWriter out) throws IOException {
		 String s="";
		 while((s = br.readLine()) != null) 
	     {
	      out.write(s.toUpperCase()+"\n");
	     }
	      out.close();
	}
	public void lowercase(BufferedReader br,PrintWriter out) throws IOException {
		 String s="";
		 while((s = br.readLine()) != null) 
	     {
	      out.write(s.toLowerCase()+"\n");
	     }
	      out.close();
	}
	public static void main (String[] args) {
	 try
	 {
	     FileReader fr = new FileReader("in.txt");
	     BufferedReader br = new BufferedReader(fr);
	     PrintWriter out = (new PrintWriter(new FileWriter("out.txt")));
	     String s="";
	     new Convert().uppercase(br,out);
	     new Convert().lowercase(br,out);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	}
}
