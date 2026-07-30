
class Demo {

        static int x = 10;

        static {

                System.out.println("Static Block 1");
        }

        /*Demo(){
        
                System.out.println("Constructor");
        }*/

        static {

                System.out.println("Static Block 2");
        }

}

// Compile Time : No Error
// Run Time : Error - Main method not found in class Demo
