class Cos3rd extends ConsoleProgram {

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
    double dblThird;

    intNum1 = 2;

    intSidea = readInt("what is side a? ");
    intSideb = readInt("what is side b?");
    intAnglec = readInt("what is angle C? ");

    System.out.println("Side a is: " + intSidea);
    System.out.println("Side b is: " + intSideb);
    System.out.println("angle C is: " + intAnglec);

    dblThird = (Math.sqrt(Math.pow(intSidea,2) + Math.pow(intSideb,2) - intNum1 * intSidea * intSideb * Math.cos(intAnglec)));

    System.out.println(" the thrid angle is: " + dblThird);
  }
}