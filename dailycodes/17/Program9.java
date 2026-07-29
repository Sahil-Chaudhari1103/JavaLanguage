class Demo{
        void fun(char x,char y){
                System.out.println(x);
                System.out.println(y);
        }

        public static void main(String[] args){
                Demo obj = new Demo();
		char a = 65;
		char b = 66;
                obj.fun(a,b);
        }
}
