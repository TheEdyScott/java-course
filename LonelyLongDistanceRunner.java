import java.io.*;
class LonelyLongDistanceRunner{
  public static void main(String [] args) throws Exception{
    BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
    Stopwatch timer = new Stopwatch();
    System.out.println("Hit enter on your way out");
    keyboard.readLine();
    timer.start();
    System.out.println("Don't forget to hit Enter when you get back");
    keyboard.readLine();
    timer.showElapsedTime();
    System.out.println("Go take a shower");
  }
}
