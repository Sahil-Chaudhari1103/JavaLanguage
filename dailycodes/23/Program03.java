
class Parent {

        int x = 10;
}

class Child extends Parent {

}

class Client {

        public static void main(String[] args) {

                Parent obj = new Parent();

                System.out.println(obj.x);

        }
}
