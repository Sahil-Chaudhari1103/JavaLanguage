
class Parent {

        int x = 10;
        int y = 20;

        Parent() {

                System.out.println("Parent Constructor");
        }

        void fun() {

                System.out.println("In fun");
        }
}

class Child {

        Child() {

                System.out.println("Child Constructor");
        }
}

class Client {

        public static void main(String[] args) {

                Parent obj = new Parent();

                System.out.println(obj.x);
                System.out.println(obj.y);
                obj.fun();
        }
}
