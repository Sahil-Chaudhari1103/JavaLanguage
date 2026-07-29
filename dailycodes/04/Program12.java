
class Demo{
        public static void main(String[] args){
                int x = 10;
                int y = 9;

                System.out.println("Statement1");

                if(x = y){                                 // error: incompatible types: int cannot be converted to boolean
                        System.out.println("Statement2");
                }

                System.out.println("Statement3");
        }
}
