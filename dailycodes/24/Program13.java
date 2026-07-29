
class Demo extends Object{
        int x = 10;

        Demo(){ // Demo(Demo this)                                                      // hidden this reference
                // super();
                // this.x = 10;
                System.out.println("Demo :" + this);
                System.out.println("In Constructor - Demo");
        }

	void fun(){
                System.out.println("Fun-Demo :" + this);
                System.out.println(x);
        }
}

class DemoChild extends Demo{
        int x = 20;

        DemoChild(){ //DemoChild(DemoChild this)                                          // hidden this reference
                System.out.println("DemoChild :" + this);
                System.out.println("In Constructor - DemoChild");
        }

        void fun(){
                System.out.println("Fun-Child :" + this);
                System.out.println(x);
        }
}

class Client{
        public static void main(String[] args){
                DemoChild obj = new DemoChild();
                obj.fun();
        }
}
