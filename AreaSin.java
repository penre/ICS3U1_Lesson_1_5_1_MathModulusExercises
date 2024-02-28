class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intSidea;
    int intSideb;
    int intAnglec;
    int intNum1;
    double dblArea;

    intNum1 = 2;

    intSidea = readInt("what is side a? ");
    intSideb = readInt("what is side b?");
    intAnglec = readInt("what is angle C? ");

    System.out.println("Side a is: " + intSidea);
    System.out.println("Side b is: " + intSideb);
    System.out.println("angle C is: " + intAnglec);

    dblArea = (intSidea * intSideb * Math.sin(intAnglec) / intNum1);

    System.out.println(" the thrid area is: " + dblArea);
  }
}