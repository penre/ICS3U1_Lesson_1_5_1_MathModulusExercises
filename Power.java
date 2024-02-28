class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intNum1;
    int intNum2;

    intNum1 = readInt("what is number a?");
    System.out.println("the number a is: " + intNum1);

    intNum2 = readInt("what is number b?");
    System.out.println("the number b is: " + intNum2);


    System.out.println(Math.pow(intNum1,intNum2));

  }
}