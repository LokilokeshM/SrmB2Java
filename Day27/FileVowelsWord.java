package Day27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileVowelsWord
{

   public static void main(String[] args) throws IOException 
   {
      File f1=new File("vowels.txt"); 
      String[] words=null;    
      FileReader fr = new FileReader(f1);   
      BufferedReader br = new BufferedReader(fr); 
      String s;
      int flag=0;  
      while((s=br.readLine())!=null)
      {
         words=s.split(" ");   //Split the word using space
         for(int i=0;i<words.length;i++)
         {
            for(int j=0;j<words[i].length();j++)
            {
               char ch=words[i].charAt(j);   //Read the word char by char
               if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')   //Checking for vowels
               {
                      flag=1; //If vowels persent set flag as one
                 }
            }
            if(flag==1)
            {
               System.out.println(words[i]);  //Print the vowels word
            }
            flag=0;
         }
         
      
      }

   }

}