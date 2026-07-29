class VotingCheck {
        public static void main(String[] args){
                int age  = 17;
         
                if(age >= 18){
                        System.out.println("Eligible to vote");
                }else if(age >0){
			System.out.println("Not eligible to vote");
		}else{
			System.out.println("Invalid Age ");
		}
          
        }
}
