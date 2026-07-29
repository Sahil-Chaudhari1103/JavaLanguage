
class Parent{
        int x = 10;
}

class Child extends Parent{

}

class Client{
        public static void main(String[] args){
                Parent obj = new Parent();
                System.out.println(obj.x);

                Child obj1 = new Child(); 
                System.out.println(obj1.x);               
        }
}
