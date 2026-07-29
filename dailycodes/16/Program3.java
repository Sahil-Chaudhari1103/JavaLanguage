class Demo{
        int x = 10;
      
        public static void main(String[] args){
                Demo obj1 = new Demo();
                System.out.println(obj1.x);

		Demo obj2 = new Demo();
		System.out.println(obj2.x);

		obj2.x = 50;

		System.out.println(obj1.x);
		System.out.println(obj2.x);
        }
}
