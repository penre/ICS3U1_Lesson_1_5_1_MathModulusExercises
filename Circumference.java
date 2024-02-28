class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblCircumference;
    int intRadius;
    int intNum;
    intNum = 2;

    intRadius = readInt("what is Radius? ");

    System.out.println("Radius is:" + intRadius);
    dblCircumference = (intNum * intRadius * Math.PI);
    System.out.println("circumference is: " + dblCircumference);


  }
}