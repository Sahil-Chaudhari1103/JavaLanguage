
class Demo {

        int x;
        int y;

        Demo(){
                System.out.println("No-arg Constructor");
                System.out.println(x);   // this.x
                System.out.println(y);   // this.y

        }

        Demo(int x, int y){

                this.x = x;
                this.y = y;

                System.out.println("Para Constructor");

                this.x = 70;

                System.out.println(this.x);
                System.out.println(x);
                System.out.println(y);
        }

        public static void main(String[] args){

                Demo obj1 = new Demo(50,100);

        }
}
