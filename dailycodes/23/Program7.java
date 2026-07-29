
class Parent{
        private int x = 10;

        void fun(){
                System.out.println("In fun-Parent");
        }
}

class Child extends Parent{

}

class Client{
        public static void main(String[] args){
                Child obj1 = new Child();
                System.out.println(obj1.x);                  // error: x has private access in Parent
                obj1.fun();
        }
}
