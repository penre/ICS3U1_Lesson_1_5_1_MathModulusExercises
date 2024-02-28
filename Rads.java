class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intDegree;
    double dblRadian;
    int intNum;

    intNum = 180;

    intDegree = readInt("what is Degree? ");

    System.out.println(" Degree is: " + intDegree);
    dblRadian = ( intDegree * (Math.PI / intNum));
    System.out.println("the Radian is: " + dblRadian);
  }
}