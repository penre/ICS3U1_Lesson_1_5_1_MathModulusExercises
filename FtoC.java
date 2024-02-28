class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblF;
    double dblC;

    dblF = readDouble("what is the degree in fahrenheit? ");
    System.out.print("the degree in fahrenheit is: " + dblF);

    dblC = (5 / 9 * (dblF - 32));

    System.out.println(" the degree in Celsius is: " + dblC);

  }
}