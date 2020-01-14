import java.io.*;
class LonelyLapRunnerWithMinimizer{
  public static void main(String args[]) throws Exception{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    Stopwatch sw=new Stopwatch();
    Minimizer minTime= new Minimizer();
    System.out.print("Hit enter to start");
    keyboard.readLine();
    sw.start();
    System.out.print("First lap in progress");
    keyboard.readLine();
    long lapTime=sw.getElapsedTime();
    sw.start();
    minTime.check(lapTime);
    System.out.print("Second lap in progress");
    keyboard.readLine();
    lapTime=sw.getElapsedTime();
    sw.start();
    minTime.check(lapTime);
    System.out.print("Third lap in progress");
    keyboard.readLine();
    lapTime=sw.getElapsedTime();
    minTime.check(lapTime);
    long bestTime = minTime.get();
    System.out.print("Your best time is ");
    System.out.print(bestTime/1000);

  }
}
