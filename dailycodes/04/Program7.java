
class Demo{
        public static void main(String[] args){
                int x = 1;

                System.out.println("Statement1");

                if(x){                                    // error: incompatible types: int cannot be converted to boolean
                        System.out.println("Statement2");
                }

                System.out.println("Statement3");
        }
}
