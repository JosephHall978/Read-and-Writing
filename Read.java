import java.util.ArrayList;
import java.io.*;
class Read{
  public static ArrayList<String> bufferRead(String file){//reads input stream in memory buffer
    ArrayList<String> text = new ArrayList<String>();
    try{
      BufferedReader br =  new BufferedReader(new FileReader(file));
      String line;
      while ((line = br.readLine()) != null){
        System.out.println(line);
        text.add(line);
      }
      br.close();
    }
    catch(Exception e){
        System.out.println("error");
    }
    return text;
  }
  public static void normalRead(String file){//directly reads from hard drive
    try{
      FileReader fr = new FileReader(file);
      int i = 0;
      while((i = fr.read()) != -1){
        System.out.print((char)i);
      }
      fr.close();
    }
    catch(Exception e){
      System.out.println("error");
    }
  }
}