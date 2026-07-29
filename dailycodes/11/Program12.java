class TwoDArray{
        public static void main(String[] args){
                //int arr2[][] = new int[][]{{10,20,30},{40,50,60},{70,80,90}};
                
		int arr2[][] = {{10,20,30},{40,50,60},{70,80,90}};

                for(int i=0 ; i<arr2.length ; i++){
                        for(int j=0 ; j<arr2[i].length ; j++){
                                System.out.print(arr2[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}
