//What happens if Compiler is of newer version and JVM is of older version.

class Demo {

        public static void main(String[] args) {

                int x = 10;
                int y = 20;

                System.out.println("In main method");
                System.out.println(x + y);
        }
}

/* Exception in thread "main"
   java.lang.UnsupportedClassVersionError: Demo has been compiled by a more recent version of the Java Runtime (class file version 55   .0), this version of the Java Runtime only recognizes class file versions upto 52.0   */
