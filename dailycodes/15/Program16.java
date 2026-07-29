class Demo{
        static void fun(){
                System.out.println("In fun - method");
        }

        public static void main(String[] args){
		fun();
		Demo obj = new Demo();
                obj.fun();

        }
}
