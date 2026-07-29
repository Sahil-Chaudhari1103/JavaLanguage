import java.util.*;

class Pattern{
        void pattern1(int rows){
                int num = 1;
                for(int i=1 ; i<=rows ; i++){                           // 1
                        for(int j=1 ; j<=i ; j++){                      // 2 3
                                System.out.print(num + " ");            // 4 5 6
                                num++;                                  // 7 8 9 10
                        }
                        System.out.println();
                }
        }

        void pattern2(int rows){
                for(int i=1 ; i<=rows ; i++){                           // 4
                        for(int j=1 ; j<=i ; j++){                      // 3 3
                                System.out.print(rows-i+1 + " ");       // 2 2 2
                        }                                               // 1 1 1 1
                        System.out.println();
                }
        }

        void pattern3(int rows){
                for(int i=1 ; i<=rows ; i++){                           // 1 2 3 4
                        for(int j=1 ; j<=(rows-i+1) ; j++){             // 1 2 3
                                System.out.print(j + " ");              // 1 2
                        }                                               // 1
                        System.out.println();
                }
        }

        void pattern4(int rows){
                for(int i=1 ; i<=rows ; i++){                           //       1
                        for(int j=1 ; j<=(rows-i) ; j++){               //     1 2
                                System.out.print("  ");                 //   1 2 3
                        }                                               // 1 2 3 4
                        for(int k=1 ; k<=i ; k++){
                                System.out.print(k + " ");
                        }
                        System.out.println();
                }
        }

        void pattern5(int rows){
                for(int i=1 ; i<=rows ; i++){                           //       4
                        for(int j=1 ; j<=(rows-i) ; j++){               //     3 3
                                System.out.print("  ");                 //   2 2 2
                        }                                               // 1 1 1 1
                        for(int k=1 ; k<=i ; k++){
                                System.out.print(rows-i+1 + " ");
                        }
                        System.out.println();
                }
        }

        void pattern6(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){                           // 1 2 3 4
                        for(int j=1 ; j<=(rows-num) ; j++){             //   1 2 3
                                System.out.print("  ");                 //     1 2
                        }                                               //       1
                        for(int k=1 ; k<=num ; k++){
                                System.out.print(k + " ");
                        }
                        num--;
                        System.out.println();
                }
        }

        void pattern7(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){                           // 4 3 2 1
                        for(int j=1 ; j<=(rows-num) ; j++){             //   3 2 1
                                System.out.print("  ");                 //     2 1
                        }                                               //       1
                        for(int k=1 ; k<=num ; k++){
                                System.out.print(num-k+1 + " ");
                        }
                        num--;
                        System.out.println();
                }
        }

        void pattern8(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){
                        int n1 = rows;                                  // 4 8 12 16
                        for(int j=1 ; j<=(rows-num) ; j++){             //   4  7 10
                                System.out.print("    ");               //      4  6
                        }                                               //         4
                        for(int k=1 ; k<=num ; k++){
                                System.out.printf("%4d" , n1 );
                                n1 = n1 + num;
                        }
                        num--;
                        System.out.println();
                }
        }

         void pattern9(int rows){
                int num = (rows*(rows+1))/2;
                for(int i=1 ; i<=rows ; i++){                           //           10
                        for(int j=1 ; j<=(rows-i) ; j++){               //       10   9
                                System.out.print("    ");               //    9   8   7
                        }                                               // 7  6   5   4
                        for(int k=1 ; k<=i ; k++){
                                System.out.printf("%4d" , num );
                                num--;
                        }
                        num++;
                        System.out.println();
                }
        }

        void pattern10(int rows){
                for(int i=1 ; i<=rows ; i++){
                        int num = i*i*i;                                //           1
                        for(int j=1 ; j<=(rows-i) ; j++){               //        8  8
                                System.out.print("    ");               //    27 27 27
                        }                                               // 64 64 64 64
                        for(int k=1 ; k<=i ; k++){
                                System.out.printf("%4d" ,num  );
                        }
                        System.out.println();
                }
        }

	void pattern11(int rows){
                for(int i=1 ; i<=rows ; i++){ 				// 1
                        for(int j=1 ; j<=i ; j++){			// 1 2
                                System.out.printf("%4d" ,j  );	        // 1 2 3
                        }						// 1 2 3 4
                        System.out.println();
                }
        }

	void pattern12(int rows){
                for(int i=1 ; i<=rows ; i++){                           // 4
                        for(int j=1 ; j<=i ; j++){                      // 4 3
                                System.out.printf("%4d" , rows-j+1  );  // 4 3 2
                        }						// 4 3 2 1
                        System.out.println();
                }
        }

	void pattern13(int rows){
                for(int i=1 ; i<=rows ; i++){
                        int num = i ;                                   // 1
                        for(int j=1 ; j<=i ; j++){                      // 2 1
                                System.out.printf("%4d" , num );        // 3 2 1
                                num--;                                  // 4 3 2 1
                        }
                        System.out.println();
                }
        }

	void pattern14(int rows){
                for(int i=1 ; i<=rows ; i++){
                        char ch = 'A' ;                                  // A
                        for(int j=1 ; j<=i ; j++){                       // A B
                                System.out.print( ch + " " );            // A B C
                                ch++;                                    // A B C D
                        }
                        System.out.println();
                }
        }

	void pattern15(int rows){
                char ch = 'A' ;                                  
                for(int i=1 ; i<=rows ; i++){				 // A
                        for(int j=1 ; j<=i ; j++){                       // B B
                                System.out.print( ch + " " );            // C C C
                        }						 // D D D D
			ch++;
                        System.out.println();
                }
        }

	void pattern16(int rows){
                char ch = (char)(64 + rows) ;
                for(int i=1 ; i<=rows ; i++){                            // D
                        for(int j=1 ; j<=i ; j++){                       // C C
                                System.out.print( ch + " " );            // B B B
                        }                                                // A A A A
                        ch--;
                        System.out.println();
                }
        }

	void pattern17(int rows){
                for(int i=1 ; i<=rows ; i++){				// 1
                        for(int j=1 ; j<=i ; j++){                      // 2 2
                                System.out.printf( "%4d" , i );         // 3 3 3 
                        }                                               // 4 4 4 4
                        System.out.println();
                }
        }

	void pattern18(int rows){
                for(int i=1 ; i<=rows ; i++){                           // 1 1 1 1
                        for(int j=1 ; j<=rows-i+1 ; j++){               // 2 2 2
                                System.out.printf( "%4d" , i );         // 3 3 
                        }                                               // 4 
                        System.out.println();
                }
        }

	void pattern19(int rows){
                for(int i=1 ; i<=rows ; i++){                           // 4 4 4 4
                        for(int j=1 ; j<=rows-i+1 ; j++){               // 3 3 3
                                System.out.printf( "%4d" , rows-i+1 );  // 2 2
                        }                                               // 1
                        System.out.println();
                }
        }

	void pattern20(int rows){
                for(int i=1 ; i<=rows ; i++){                           //    1
                        for(int j=1 ; j<=(rows-i) ; j++){               //   2 2
                                System.out.print("  ");                 //  3 3 3
                        }                                               // 4 4 4 4
                        for(int k=1 ; k<=i ; k++){
                                System.out.printf("%4d" , i );
                        }
                        System.out.println();
                }
        }

	void pattern21(int rows){
                for(int i=1 ; i<=rows ; i++){                           //    1  
                        for(int j=1 ; j<=(rows-i) ; j++){               //   1 2
                                System.out.print("  ");                 //  1 2 3
                        }                                               // 1 2 3 4
                        for(int k=1 ; k<=i ; k++){
                                System.out.printf("%4d" , k );
                        }
                        System.out.println();
                }
        }

	void pattern22(int rows){
                for(int i=1 ; i<=rows ; i++){                           //    4
                        for(int j=1 ; j<=(rows-i) ; j++){               //   4 3
                                System.out.print("  ");                 //  4 3 2
                        }                                               // 4 3 2 1
                        for(int k=1 ; k<=i ; k++){
                                System.out.printf("%4d" , rows-k+1 );
                        }
                        System.out.println();
                }
        }

	void pattern23(int rows){
		int num = rows;
                for(int i=1 ; i<=rows ; i++){                           // 1 2 3 4
                        for(int j=1 ; j<=(rows-num) ; j++){             //  2 3 4
                                System.out.print("  ");                 //   3 4
                        }                                               //    4
                        for(int k=1 ; k<=num ; k++){
                                System.out.printf("%4d" , k+i-1 );
                        }
			num--;
                        System.out.println();
                }
        }

	void pattern24(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){                           // 1 2 3 4
                        for(int j=1 ; j<=(rows-num) ; j++){             //   2 3 4
                                System.out.print("    ");               //     3 4
                        }                                               //       4
                        for(int k=1 ; k<=num ; k++){
                                System.out.printf("%4d" , k+i-1 );
                        }
                        num--;
                        System.out.println();
                }
	}

	void pattern25(int rows){
		int num = 1;
		for(int i=1 ; i<=rows ; i++){
			if(i%2==1){			                        // 1 
				for(int k=1 ; k<=i ; k++){			// 3  2
					System.out.printf("%4d" , num );	// 4  5  6
					num++;					// 10 9  8  7
				}						// 11 12 13 14 15
				num = num + i;
			}else{
				for(int k=1 ; k<=i ; k++ ){
					System.out.printf("%4d" , num);
					num--;
				}
				num = num + i + 1;
			}			
			System.out.println();
                }
        }

	void pattern26(int rows){
                for(int i=1 ; i<=rows ; i++){
			int num = i;			                // 1
                        for(int j=1 ; j<=i ; j++){                      // 2 4
                                System.out.printf( "%4d" , num );	// 3 6 9
				num = num + i;	                        // 4 8 12 16
			}                                               
			System.out.println();
		}
	}

	void pattern27(int rows){
		int num = 1;
		for(int i=1 ; i<=rows ; i++){
			if(i%2==1){                                             // 1
				for(int j=1 ; j<=i ; j++){                      // 2  3
					System.out.printf( "%4d" , num );       // 5  4  3
					num--;                                  // 6  7  8  9
				}						// 13 12 11 10 9
			}else{
				num = num + i;
				for(int j=1 ; j<=i ; j++){                   
					System.out.printf( "%4d" , num );       
					num++;                      
				}
				num = num+i-1;
			}
			System.out.println();
		}
	}

	void pattern28(int rows){
                for(int i=1 ; i<=rows ; i++){                           //     *
                        for(int j=1 ; j<=(rows-i) ; j++){               //    * *
                                System.out.print("  ");                 //   * * *
                        }                                               //  * * * *
                        for(int k=1 ; k<=i ; k++){          		// * * * * *
                                System.out.print( "   *");
                        }
                        System.out.println();
                }
        }

	void pattern29(int rows){
		int num = rows;
                for(int i=1 ; i<=rows ; i++){                           // * * * * *
                        for(int j=1 ; j<=(rows-num) ; j++){             //  * * * *
                                System.out.print("  ");                 //   * * *
                        }                                               //    * *
                        for(int k=1 ; k<=(rows-i+1) ; k++){             //     *
                                System.out.print( "   *");
                        }
			num--;
                        System.out.println();
                }
        }

	void pattern30(int rows){
		int num = 1;
                for(int i=1 ; i<=rows ; i++){                           //     *
                        for(int j=1 ; j<=(rows-i) ; j++){               //    ***
                                System.out.print("  ");                 //   *****
                        }                                               //  *******
                        for(int k=1 ; k<=num ; k++){                    // *********
                                System.out.print( " *");
                        }
			num = num + 2;
                        System.out.println();
                }
        }

	void pattern31(int rows){
                int num = rows*2-1;
		int count = rows;
                for(int i=1 ; i<=rows ; i++){                           // *********
                        for(int j=1 ; j<=(rows-count) ; j++){           //  *******
                                System.out.print("  ");                 //   *****
                        }                                               //    ***
                        for(int k=1 ; k<=num ; k++){                    //     *
                                System.out.print( " *");
                        }
                        num = num - 2;
			count--;
                        System.out.println();
                }
        }

	 void pattern32(int rows){
                int num = 1;
		int count = rows-1;
                for(int i=1 ; i<=(rows*2-1) ; i++){
                        if(i<=4){                                               // 1
                                for(int j=1 ; j<=i ; j++){                      // 2  3
                                        System.out.printf( "%4d" , num );       // 4  5  6
                                        num++;                                  // 7  8  9  10
                                }				                // 9  8  7
                        }else{							// 6  5 
                                for(int j=1 ; j<=count ; j++){			// 4
					num--;			                
                                        System.out.printf( "%4d" , num-1 );
                                }
				count--;
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                while(true){
                        System.out.println("Available Patterns:\n"+
                                        "1 : Pattern01 \n"+
                                        "2 : Pattern02 \n"+
                                        "3 : Pattern03 \n"+
                                        "4 : Pattern04 \n"+
                                        "5 : Pattern05 \n"+
                                        "6 : Pattern06 \n"+
                                        "7 : Pattern07 \n"+
                                        "8 : Pattern08 \n"+
                                        "9 : Pattern09 \n"+
                                        "10 : Pattern10 \n"+
                                        "15 : Pattern15 \n"+
                                        "16 : Pattern16 \n"+
                                        "17 : Pattern17 \n"+
                                        "18 : Pattern18 \n"+
                                        "19 : Pattern19 \n"+
                                        "20 : Pattern20 \n"+
                                        "21 : Pattern21 \n"+
                                        "22 : Pattern22 \n"+
                                        "23 : Pattern23 \n"+
                                        "24 : Pattern24 \n"+
                                        "25 : Pattern25 \n"+
                                        "26 : Pattern26 \n"+
                                        "27 : Pattern27 \n"+
                                        "28 : Pattern28 \n"+
                                        "29 : Pattern29 \n"+
                                        "30 : Pattern30 \n"+
                                        "31 : Pattern31 \n"+
                                        "32 : Pattern32 \n"+
                                        "33 : Pattern33 \n"+
                                        "0 : Exit.\n");
                        System.out.println("Select pattern from above options");
                        int option = sc.nextInt();

                        if(option == 0){
                                break;
                        }else{
                                System.out.println("--------------------- Pattern : " + option + " ---------------------");
                                System.out.println("Enter number of rows :");
                                int rows = sc.nextInt();
                                Pattern obj = new Pattern();
                                System.out.println("-------------------------------------------------------");
                                switch(option){
                                        case 1:
                                                obj.pattern1(rows);
                                                break;
                                        case 2:
                                                obj.pattern2(rows);
                                                break;
                                        case 3:
                                                obj.pattern3(rows);
                                                break;
                                        case 4:
                                                obj.pattern4(rows);
                                                break;
                                        case 5:
                                                obj.pattern5(rows);
                                                break;
                                        case 6:
                                                obj.pattern6(rows);
                                                break;
                                        case 7:
                                                obj.pattern7(rows);
                                                break;
                                        case 8:
                                                obj.pattern8(rows);
                                                break;
                                        case 9:
                                                obj.pattern9(rows);
                                                break;
                                        case 10:
                                                obj.pattern10(rows);
                                                break;
					case 11:
                                                obj.pattern11(rows);
                                                break;
					case 12:
                                                obj.pattern12(rows);
                                                break;
					case 13:
                                                obj.pattern13(rows);
                                                break;
					case 14:
                                                obj.pattern14(rows);
                                                break;
					case 15:
                                                obj.pattern15(rows);
                                                break;
					case 16:
                                                obj.pattern16(rows);
                                                break;
					case 17:
                                                obj.pattern17(rows);
                                                break;
					case 18:
                                                obj.pattern18(rows);
                                                break;
					case 19:
                                                obj.pattern19(rows);
                                                break;
					case 20:
                                                obj.pattern20(rows);
                                                break;
					case 21:
                                                obj.pattern21(rows);
                                                break;
					case 22:
                                                obj.pattern22(rows);
                                                break;
					case 23:
                                                obj.pattern23(rows);
                                                break;
					case 24:
                                                obj.pattern24(rows);
                                                break;
					case 25:
                                                obj.pattern25(rows);
                                                break;
					case 26:
                                                obj.pattern26(rows);
                                                break;
					case 27:
                                                obj.pattern27(rows);
                                                break;
					case 28:
                                                obj.pattern28(rows);
                                                break;
					case 29:
                                                obj.pattern29(rows);
                                                break;
					case 30:
                                                obj.pattern30(rows);
                                                break;
					case 31:
                                                obj.pattern31(rows);
                                                break;
					case 32:
                                                obj.pattern32(rows);
                                                break;
					case 33:
                                                obj.pattern33(rows);
                                                break;
                                        default :
                                                System.out.println("Invalid option . Please try again.");
                                }
                                System.out.println("---------------*************************---------------");
                        }
                }
import java.util.*;
import java.util.*;
import java.util.*;
