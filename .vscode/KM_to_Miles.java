class KM_to_Miles extends ConsoleProgram {

        /**
         * Description
         * @author:
         */

         public void run() {
         double dblKilo;
         double dblMilo;

         dblKilo = readDouble("what is distance in Kilometers? ");
         System.out.println("the distance in Kilometers is: " + dblKilo);

         dblMilo = (dblKilo * 0.621371);
         System.out.println("the distance converted from Kilometers to miles is: " + dblMilo);
         }
    }
    