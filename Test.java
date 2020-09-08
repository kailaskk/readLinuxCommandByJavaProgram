import java.io.*;

public class Test{
   public static void main(String[] args) 
   {
     Process process = Runtime.getRuntime().exec("pwd"); // for Linux
            //Process process = Runtime.getRuntime().exec("cmd /c dir"); //for Windows

            try
            { 
          
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
               while ((line=reader.readLine())!=null)
               {
                System.out.println(line);   
                }
             }       
                catch(Exception e)
             { 
                 System.out.println(e); 
             }
             finally
             {
               process.destroy();
             }  
    }
}
