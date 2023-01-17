class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Read.bufferRead("text.txt");
    Write.normalWrite("text.txt");
    Read.normalRead("text.txt");
    Write.bufferWrite("text.txt");
    
  }
}