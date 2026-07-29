class Demo{
        int x = 10;
	static int y = 20;

        public static void main(String[] args){
                Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);

                Demo obj2 = new Demo();
		System.out.println(obj2.x);
		System.out.println(obj2.y);

		obj2.x = 50;

		obj2.y = 60;
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);

        }
}
