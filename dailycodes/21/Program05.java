
class Demo {

        int x = 10;

        Demo() {

                System.out.println("Demo Constructor");
        }

        void fun() {

                System.out.println("In fun-Demo");
        }
}

class Memo {

        int x = 20;

        Memo() {

                System.out.println("Memo Constructor");
        }

        void fun() {

                System.out.println("In fun-Memo");
        }

        public static void main(String[] args) {

                System.out.println("Start Main");

                Demo obj1 = new Demo();
                fun(); // error: non-static method fun() cannot be referenced from a static context

                Memo obj2 = new Memo();
                fun(); // error: non-static method fun() cannot be referenced from a static context

                System.out.println("End Main");
        }
}
