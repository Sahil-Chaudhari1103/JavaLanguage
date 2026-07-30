
class Demo {

        int x = 10;

        Demo() {

                System.out.println("Demo Constructor");
        }

        void fun() {

                System.out.println("In fun-Demo");
                System.out.println(x);
        }

        public static void main(String[] args) {

                Demo obj = new Demo();
                // 1.memory allocation
                // 2.Demo(obj)

                obj.fun();
                // obj.fun(obj)

        }
}

class Memo {

        Memo(Demo obj) {

                System.out.println("Para Memo Constructor");
                System.out.println(obj.x);
                obj.fun();
        }
}

class Temo {

        public static void main(String[] args) {

                Demo obj1 = new Demo();

                Memo obj2 = new Memo(obj1);
        }
}
