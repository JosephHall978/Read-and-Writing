import java.io.*;
class Write{  
  public static void normalWrite(String file){
    String content = new String("Hello world again");
    try{
      FileWriter fw = new FileWriter(file,true);//true indicates to allow add to file not overwrite file
      fw.write(content);
      fw.close();
    }
    catch(Exception e){
      System.out.println("error");
    }
  }
  public static void bufferWrite(String file){
    try{
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));//true indicates to allow add to file not overwrite file
        String content = new String("Hello world!\nsomething\nsomething yeah\nsomething something\njust adding lots of lines for the demo\nJH\n");
        bw.write(content);
        bw.close();
    }
    catch(Exception e){
      System.out.println("error");
    }
  }
}
