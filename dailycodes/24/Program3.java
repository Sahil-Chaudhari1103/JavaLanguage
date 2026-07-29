
class Parent{
        int x = 10;
        int y = 20;

        Parent(){
                System.out.println("Parent Constructor");
        }

        void fun(){
                System.out.println("In fun");
        }
}

class Child extends Parent{
        Child(){
                System.out.println("Child Constructor");
        }
}

class Client{
        public static void main(String[] args){
                Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
        }
}
