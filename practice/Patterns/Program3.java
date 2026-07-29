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
                for(int i=1 ; i<=rows ; i++){                           // 1
                        for(int j=1 ; j<=i ; j++){                      // 1 2
                                System.out.printf("%4d" ,j  );          // 1 2 3
                        }                                               // 1 2 3 4
                        System.out.println();
                }
        }

	 void pattern12(int rows){
                for(int i=1 ; i<=rows ; i++){                           // 4
                        for(int j=1 ; j<=i ; j++){                      // 4 3
                                System.out.printf("%4d" , rows-j+1  );  // 4 3 2
                        }                                               // 4 3 2 1
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
                for(int i=1 ; i<=rows ; i++){                            // A
                        for(int j=1 ; j<=i ; j++){                       // B B
                                System.out.print( ch + " " );            // C C C
                        }                                                // D D D D
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
                for(int i=1 ; i<=rows ; i++){                           // 1
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
                        if(i%2==1){                                             // 1
                                for(int k=1 ; k<=i ; k++){                      // 3  2
                                        System.out.printf("%4d" , num );        // 4  5  6
                                        num++;                                  // 10 9  8  7
                                }                                               // 11 12 13 14 15
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
                        int num = i;                                    // 1
                        for(int j=1 ; j<=i ; j++){                      // 2 4
                                System.out.printf( "%4d" , num );       // 3 6 9
                                num = num + i;                          // 4 8 12 16
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
                                }                                               // 13 12 11 10 9
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
                        for(int k=1 ; k<=i ; k++){                      // * * * * *
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
			if(i<=rows){                                            // 1
				for(int j=1 ; j<=i ; j++){                      // 2  3
					System.out.printf( "%4d" , num );       // 4  5  6
					num++;                                  // 7  8  9  10
				}                                               // 9  8  7
			}else{                                                  // 6  5
				for(int j=1 ; j<=count ; j++){                  // 4
					num--;
					System.out.printf( "%4d" , num-1 );
				}
				count--;
			}
			System.out.println();
		}
	}

	void pattern33(int rows){
		int count = rows-1;
		for(int i=1 ; i<=(rows*2-1) ; i++){
			if(i<=rows){                                                
				int num = i;					// 1
				for(int j=1 ; j<=i ; j++){                      // 2  1
					System.out.printf( "%4d" , num );       // 3  2  1
					num--;                                  // 4  3  2  1
				}                                               // 3  2  1
			}else{                                                  // 2  1
				int num = count;				// 1
				for(int j=1 ; j<=count ; j++){                  
					System.out.printf( "%4d" , num );
					num--;
				}
				count--;
			}
			System.out.println();
		}
	}

	void pattern34(int rows){
		int num;
		for(int i=1 ; i<=rows ; i++){
			if(i%2==1){						// 1 0 1 0 1
				for(int j=1 ; j<=rows ; j++){			// 0 1 0 1 0
					if(j%2==1){				// 1 0 1 0 1
						num = 1;			// 0 1 0 1 0
						System.out.printf("%4d" ,num );	// 1 0 1 0 1
					}else{
						num = 0;
						System.out.printf("%4d" ,num );
					}					
				} 
			}else{							
				for(int k=1 ; k<=rows ; k++){			
					if(k%2==1){
						num = 0;
                                                System.out.printf("%4d" ,num );
                                        }else{
						num = 1;
                                                System.out.printf("%4d" ,num );
						
                                        }
				}
			}

			System.out.println();
		}
	}

	void pattern35(int rows){
		int num;
                for(int i=1 ; i<=rows ; i++){
                        if(i%2==1){                          
	     			num = 1;					// 1 2 1 2 1
                                for(int j=1 ; j<=rows ; j++){			// 2 1 2 1 2
                                        if(j%2==1){                             // 1 2 1 2 1
                                                System.out.printf("%4d" ,num ); // 2 1 2 1 2
                                                num++;				// 1 2 1 2 1
                                        }else{
                                                System.out.printf("%4d" ,num );
						num--;
                                        }
                                }
                        }else{
				num = 2;
                                for(int k=1 ; k<=rows ; k++){
                                        if(k%2==1){
                                                System.out.printf("%4d" ,num );
						num--;
                                        }else{
                                                System.out.printf("%4d" ,num );
						num++;
                                        }
                                }
                        }

                        System.out.println();
                }
        }

	void pattern36(int rows){
                for(int i=1 ; i<=rows ; i++){
                        if(i%2==1){                                             // 1 
                                for(int j=1 ; j<=i ; j++){                      // 0 1 
                                        if(j%2==1){                             // 1 0 1 
                                                int num = 1;                    // 0 1 0 1 
                                                System.out.printf("%4d" ,num ); // 1 0 1 0 1
                                        }else{
                                                int num = 0;
                                                System.out.printf("%4d" ,num );
                                        }
                                }
                        }else{
                                for(int k=1 ; k<=i ; k++){
                                        if(k%2==1){
                                                int num = 0;
                                                System.out.printf("%4d" ,num );
                                        }else{
                                                int num = 1;
                                                System.out.printf("%4d" ,num );
                                        }
                                }
                        }

                        System.out.println();
                }
        }

	void pattern37(int rows){
		char ch = 65;	
                for(int i=1 ; i<=rows ; i++){				 // A
                        for(int j=1 ; j<=i ; j++){			 // B C
                                System.out.printf( "   " + ch );     	 // D E F
                                ch++;		                         // G H I J
                        }						 // K L M N O
                        System.out.println();
                }
        }

	void pattern38(int rows){
		char ch = 'A';
                for(int i=1 ; i<=rows ; i++){
                        if(i%2==1){                                             // A
                                for(int j=1 ; j<=i ; j++){                      // C B
                                               System.out.print( "   " + ch );  // D E F
					       ch++; 				// J I H G
                                }						// K L M N O
				ch = (char) (ch + i);			
                        }else{						
                                for(int k=1 ; k<=i ; k++){
                                                System.out.print( "   " + ch );
						ch--;
                                }
				ch = (char) (ch + i + 1);
                        }

                        System.out.println();
                }
        }

	void pattern39(int rows){
                int num = 1;
                for(int i=1 ; i<=rows ; i++){
                        if(i%2==1){						  // 1
                                for(int j=1 ; j<=i ; j++){                        // 2  3
                                               System.out.printf( "%4d" , num );  // 6  5  4
                                               num--;                             // 7  8  9  10
                                }                                                 // 15 14 13 12 11
			}else{
				num = num + i;
                                for(int k=1 ; k<=i ; k++){
                                                System.out.printf( "%4d" , num );
                                                num++;
                                }
				num = num + i;
                        }

                        System.out.println();
                }
        }

	void pattern40(int rows){
		int num = 1;
		for(int i=1; i<=rows ; i++){				//              1
			for(int j=1 ; j<=rows-i ; j++){			//           2  3
				System.out.printf("    ");		//        4  5	6
			}						//     7  8  9 10
			for(int k=1 ; k<=i ; k++){			// 11 12 13 14 15
				System.out.printf("%4d" , num );
				num++;
			}
			System.out.println();
		}
	}

	void pattern41(int rows){
		int count = rows;
                for(int i=1; i<=rows ; i++){
		        int num = ((count*count)-(count-2))/2;         	// 11 12 13 14 15
                        for(int j=1 ; j<=(rows-count) ; j++){           //     7  8  9 10
                                System.out.printf("    ");              //        4  5  6
                        }                                               //           3  2
                        for(int k=1 ; k<=(rows-i+1) ; k++){             //              1
                                System.out.printf("%4d" , num );
                                num++;
                        }
			count--;
                        System.out.println();
                }
        }

	void pattern42(int rows){
                for(int i=1 ; i<=rows ; i++){
			int num = i;           	       			 // 1
                        for(int j=1 ; j<=i ; j++){                       // 2  6
                                System.out.printf( "%4d" , num );        // 3  7 10
                                num = num + rows-j;                      // 4  8 11 13
                        }                                                // 5  9 12 14 15
                        System.out.println();
                }
        }

	void pattern43(int rows){
		int num = 1;
		int temp = 1;
                for(int i=1 ; i<=rows ; i++){				 // 1
                        for(int j=1 ; j<=i ; j++){                       // 2  4
                                System.out.printf( "%4d" , num );        // 3  5  7
                                num = num + 2;                           // 6  8 10 12
                        }						 // 9 11 13 15 17
					                	         //14 16 18 20 22 24
			if(i%2 == 0){				         //19 21 23 25 27 29 31
				temp = temp + 2;			
			}	
			num = num - temp;	
			System.out.println();
                }
        }

	void pattern44(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){                            // 5
                        for(int j=1 ; j<=i ; j++){                       // 4  5
                                System.out.printf( "%4d" , num );        // 3  4  5
                                num++;                                   // 2  3  4  5
                        }                                                // 1  2  3  4  5
                        num = num - (i+1);                                         
                        System.out.println();
                }
        }

	void pattern45(int rows){
                int num = 1;
                for(int i=1 ; i<=rows ; i++){                            // 1  2  3  4  5
                        for(int j=1 ; j<=(rows-i+1) ; j++){              // 2  3  4  5
                                System.out.printf( "%4d" , num );        // 3  4  5
                                num++;                                   // 4  5
                        }                                                // 5
                        num = num - (rows-i);
                        System.out.println();
                }
        }

	void pattern46(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){                            // 5  4  3  2  1
                        for(int j=1 ; j<=(rows-i+1) ; j++){              // 4  3  2  1
                                System.out.printf( "%4d" , num );        // 3  2  1
                                num--;                                   // 2  1
                        }                                                // 1
                        num = rows-i;
                        System.out.println();
                }
        }

	void pattern47(int rows){
                for(int i=1 ; i<=rows ; i++){   
			int num = i;					 // 1
                        for(int j=1 ; j<=i ; j++){                       // 2  1
                                System.out.printf( "%4d" , num );        // 3  2  1
                                num--;                                   // 4  3  2  1
                        }                                                // 5  4  3  2  1
                        System.out.println();
                }
        }

	void pattern48(int rows){
                for(int i=1 ; i<=rows ; i++){
                        int num = 1;                                     // 1
                        for(int j=1 ; j<=i ; j++){                       // 1  3
                                System.out.printf( "%4d" , num );        // 1  3  5 
                                num = num + 2;                           // 1  3  5  7
                        }                                                // 1  3  5  7  9
                        System.out.println();
                }
        }

	void pattern49(int rows){
                for(int i=1 ; i<=rows ; i++){
                        int num = rows*2-1;                              // 9
                        for(int j=1 ; j<=i ; j++){                       // 9  7
                                System.out.printf( "%4d" , num );        // 9  7  5
                                num = num - 2;                           // 9  7  5  3
                        }                                                // 9  7  5  3  1
                        System.out.println();
                }
        }

	void pattern50(int rows){
		int num = 1;
                for(int i=1 ; i<=rows ; i++){                            // 1
                        for(int j=1 ; j<=i ; j++){                       // 2   4
                                System.out.printf( "%5d" , num );        // 8  16  32
                                num = num*2;                             //64 128 256 512
                        }                                              
                        System.out.println();
                }
        }

	void pattern51(int rows){
                int num = 1;
                for(int i=1 ; i<=rows ; i++){                            // 1
                        for(int j=1 ; j<=i ; j++){                       // 1  2
                                System.out.printf( "%5d" , num );        // 2  4  8
                                num = num*2;                             // 8 16 32 64
                        }
			num = num/2;
                        System.out.println();
                }
        }

	void pattern52(int rows){
                int num = 1;
		int count = 3;
                for(int i=1 ; i<=rows ; i++){                                     //  1
                        for(int j=1 ; j<=i ; j++){                                //  2   3
				if(i>2){					  //  4   9  16
					System.out.printf( "%8d" , num );         // 25  36  49  64
			      		count = count + 2;		          // 81 100 121 144 169
					num = num + count;			  
				}else{
					System.out.printf( "%8d" , num );
					num = num + 1;
				}	                    		 
                        }
                        System.out.println();
                }
        }

	void pattern53(int rows){
                for(int i=1 ; i<=rows ; i++){
			char ch = (char)(64+i);			         // A 
                        for(int j=1 ; j<=i ; j++){                       // B  A
                                System.out.print( "   " + ch );          // C  B  A
                                ch--;                                    // D  C  B  A
                        }
                        
                        System.out.println();
                }
        }

	void pattern54(int rows){
		int num = rows;
                for(int i=1 ; i<=rows ; i++){
                        char ch = (char)(64+num);                        // E
                        for(int j=1 ; j<=i ; j++){                       // D  E
                                System.out.print( "   " + ch );          // C  D  E
                                ch++;                                    // B  C  D  E
                        }						 // A  B  C  D  E
			num--;
                        System.out.println();
                }
        }

	void pattern55(int rows){
                for(int i=1 ; i<=rows ; i++){
                        char ch = (char)(64+i);                          // A
                        for(int j=1 ; j<=i ; j++){                       // B  C
                                System.out.print( "   " + ch );          // C  D  E
                                ch++;                                    // D  E  F  G
                        }                                                // E  F  G  H  I
                        System.out.println();
                }
        }

	void pattern56(int rows){
		int num = rows;
                for(int i=1 ; i<=rows ; i++){
                        char ch = (char)(64+i);                          // A  B  C  D  E
                        for(int j=1 ; j<=(rows-num) ; j++){              //    B  C  D  E
                                System.out.print( "    " );              //       C  D  E
                        }						 //          D  E
			for(int j=1 ; j<=num ; j++){                     //             E
                                System.out.print( "   " + ch );          
                                ch++;                                    
                        }
			num--;			
                        System.out.println();
                }
        }

	void pattern57(int rows){
                int num = rows;
                for(int i=1 ; i<=rows ; i++){
                        char ch = (char)(64+num);                        // E  D  C  B  A
                        for(int j=1 ; j<=(rows-num) ; j++){              //    D  C  B  A
                                System.out.print( "    " );              //       C  B  A
                        }                                                //          B  A
                        for(int j=1 ; j<=num ; j++){                     //             A
                                System.out.print( "   " + ch );
                                ch--;
                        }
                        num--;
                        System.out.println();
                }
        }

	void pattern58(int rows){
                int temp = 1;
                for(int i=1 ; i<=rows ; i++){
			int num = i;	  	                         //         1
                        for(int j=1 ; j<=(rows-i) ; j++){                //       2 1 2
                                System.out.print( "    " );              //     3 2 1 2 3
                        }                                                //   4 3 2 1 2 3 4
                        for(int j=1 ; j<=temp ; j++){                    // 5 4 3 2 1 2 3 4 5
                                System.out.printf( "%4d" , num );
                                if(j>=i){
					num++;	
				}else{
					num--;
				}
                        }
                        temp = temp + 2;
                        System.out.println();
                }
        }

	void pattern59(int rows){
                int temp = 1;
                for(int i=1 ; i<=rows ; i++){
                        int num = rows-i+1;                              //         5
                        for(int j=1 ; j<=(rows-i) ; j++){                //       4 5 4 
                                System.out.print( "    " );              //     3 4 5 4 3 
                        }                                                //   2 3 4 5 4 3 2
                        for(int j=1 ; j<=temp ; j++){                    // 1 2 3 4 5 4 3 2 1
                                System.out.printf( "%4d" , num );
                                if(j>=i){
                                        num--;
                                }else{
                                        num++;
                                }
                        }
                        temp = temp + 2;
                        System.out.println();
                }
        }

	void pattern60(int rows){
                int temp = 1;
                for(int i=1 ; i<=rows ; i++){
                        int num = i;                                     //         1
                        for(int j=1 ; j<=(rows-i) ; j++){                //       2 3 2
                                System.out.print( "    " );              //     3 4 5 4 3
                        }                                                //   4 5 6 7 6 5 4
                        for(int j=1 ; j<=temp ; j++){                    // 5 6 7 8 9 8 7 6 5
                                System.out.printf( "%4d" , num );
                                if(j>=i){
                                        num--;
                                }else{
                                        num++;
                                }
                        }
                        temp = temp + 2;
                        System.out.println();
                }
        }

	void pattern61(int rows){
                for(int i=1 ; i<=rows ; i++){ 
			int num = i;              			 //     1
                        for(int j=1 ; j<=(rows-i) ; j++){                //    2 3
                                System.out.print( "  " );                //   3 4 5
                        }                                                //  4 5 6 7
                        for(int j=1 ; j<=i ; j++){                       // 5 6 7 8 9
                                System.out.printf( "%4d" , num );
                                num++;
                        }
                        System.out.println();
                }
        }

	void pattern62(int rows){
                for(int i=1 ; i<=rows ; i++){
                        int num = i;                                     // 1 2 3 4 5
                        for(int j=1 ; j<=(rows-(rows-i+1)) ; j++){       //  2 4 6 8
                                System.out.print( "  " );                //   3 6 9
                        }                                                //    4 8
                        for(int j=1 ; j<=(rows-i+1) ; j++){              //     5
                                System.out.printf( "%4d" , num );
                                num = num + i;
                        }
                        System.out.println();
                }
        }

	void pattern63(int rows){
                for(int i=1 ; i<=rows ; i++){				// *
                        for(int j=1 ; j<=i ; j++){			// * *
			 	if(j==1 || i==rows || i==j){		// *   *
					System.out.print("   *" );	// *     *
				}else{					// * * * * *
					System.out.print("    ");
				}	  
                        }
                        System.out.println();
                }
        }

	void pattern64(int rows){
                for(int i=1 ; i<=rows ; i++){                                // * * * * *
                        for(int j=1 ; j<=rows ; j++){                        // *       *
                                if( i==1 || i==rows || j==1 || j==rows){     // *       *
                                        System.out.print(" *" );             // *       *
                                }else{                                       // * * * * *
                                        System.out.print("  ");
                                }
                        }
                        System.out.println();
                }
        }

	void pattern65(int rows){
                for(int i=1 ; i<=rows ; i++){
			for(int j=1 ; j<=rows-i ; j++){
				System.out.print(" ");
			}			                        //     * 
                        for(int k=1 ; k<=i ; k++){                      //    * *
                                if( i==rows || k==1 || i==k){           //   *   *      
                                        System.out.print(" *" );        //  *     *
                                }else{                                  // * * * * *
                                        System.out.print("  ");
                                }
                        }
                        System.out.println();
                }
        }

	void pattern66(int rows){
                for(int i=1 ; i<=rows ; i++){
                        for(int j=1 ; j<=rows-(rows-i+1) ; j++){
                                System.out.print(" ");
                        }                                               // * * * * *
                        for(int k=1 ; k<=(rows-i+1) ; k++){             //  *     *
                                if( i==1 || k==1 || k==(rows-i+1)){     //   *   *
                                        System.out.print(" *" );        //    * *    
                                }else{                                  //     *
                                        System.out.print("  ");
                                }
                        }
                        System.out.println();
                }
        }

	void pattern67(int rows){
		int count = 1;
                for(int i=1 ; i<=rows ; i++){
                        for(int j=1 ; j<=rows-i ; j++){
                                System.out.print(" ");			//       *
                        }                                               //      ***
                        for(int k=1 ; k<=count ; k++){			//     ** **
	      			if(i<=2){				//    *** ***
					System.out.print("*");		//   **** ****
				}else if(i==rows || k!=i && i>2){       //  ***** *****     
                                        System.out.print("*" );         // *************  
                                }else{                                      
                                        System.out.print(" ");		
				}
			}
			count = count + 2;
			System.out.println();
		}
	}

	void pattern68(int rows){
		int temp = (int)((rows/2)+1 );
		int count = 0;
		int m = temp;
		for(int i=1 ; i<=rows ; i++){				        // 1           1             1              1
			int num = 1;						// 1  2     2  1             1  2        2  1
			if(i==temp ){			                	// 1  2  3  2  1      &      1  2  3  3  2  1    
				for(int j=1 ; j<=rows ; j++){ 			// 1  2     2  1             1  2  3  3  2  1
					System.out.printf("%4d" , num);		// 1           1             1  2        2  1
					if(rows%2==0 && j==(rows/2)){           //                           1              1
						num = num;
					}else if(j<temp){					
						num++;
					}else{
						num--;					
					}
				}
				System.out.println();
			}else{
				if(i<=temp){
					for(int j=1 ; j<=i ; j++){
						System.out.printf("%4d" , num);
						if(rows%2==0 && j==(rows/2)){
							num = num;
						}else if( j<temp){
                                                	num++;
                                        	}else{
							num--;
						}
						count = j;
					}

					for(int k=count+1 ; k<=(rows-i) ; k++){
						System.out.print("    ");
						if(rows%2==0 &&  k==(rows/2)){
							num = num;
						}else if(k<temp){
                                                	num++;
                                        	}else{
							num--;
						}
						count = k;
					}

					for(int n=count+1 ; n<=rows ; n++){
						System.out.printf("%4d" , num);
						if(rows%2==0 && n==(rows/2)){
							num = num;
						}else if(n<temp){
                                                	num++;
                                          	}else{
							num--;
						}
					}

					System.out.println();
				}else{
					for(int j=1 ; j<=(rows-m) ; j++){
                                                System.out.printf("%4d" , num);
                                                if( rows%2==0 && j==(rows/2)){
                                                        num = num;
                                                }else if(j<temp){
                                                  	num++;
                                         	}else{
                                                        num--;
                                                }
                                                count = j;
                                        }

                                        for(int k=count+1 ; k<=m ; k++){
                                                System.out.print("    ");
                                                if(rows%2==0 && k==(rows/2)){
                                                        num = num;
                                                }else if(k<temp){
                                                	num++;
                                        	}else{
                                                        num--;
                                                }
                                                count = k;
                                        }

                                        for(int n=count+1 ; n<=rows ; n++){
                                                System.out.printf("%4d" , num);
                                                if(rows%2==0 && n==(rows/2)){
                                                        num = num;
                                                }else if(n<temp){
                                                	num++;
                                        	}else{
                                                        num--;
                                                }
                                        }
					m++;
                                        System.out.println();
				}
			}
		}
        }

	void pattern69(int rows){
		for(int i=1 ; i<=(rows*2-1) ; i++){
			int num = 1;
			if(i<=rows){
				for(int j=1 ; j<=(rows-i+1) ; j++){		// 1  2  3  4  5
					System.out.printf("%4d" , num);		// 1  2  3  4
		      			num++;					// 1  2  3 
				}						// 1  2
				System.out.println();				// 1
			}else{							// 1  2 
				for(int k=1 ; k<=(i-rows+1) ; k++){             // 1  2  3 
					System.out.printf("%4d" , num);		// 1  2  3  4
			      		num++;		 			// 1  2  3  4  5
				}
				System.out.println();
			}
		}
	}

	void pattern70(int rows){
                for(int i=1 ; i<=(rows*2-1) ; i++){
                        int num = rows;
                        if(i<=rows){
                                for(int j=1 ; j<=(rows-i+1) ; j++){             // 5  4  3  2  1
                                        System.out.printf("%4d" , num);         // 5  4  3  2
                                        num--;                                  // 5  4  3  
                                }                                               // 5  4
                                System.out.println();                           // 5
                        }else{                                                  // 5  4
                                for(int k=1 ; k<=(i-rows+1) ; k++){             // 5  4  3 
                                        System.out.printf("%4d" , num);         // 5  4  3  2
                                        num--;                                  // 5  4  3  2  1
                                }
                                System.out.println();
                        }
                }
        }

	void pattern71(int rows){
		int num = 1;
		int temp = 1;
		int count = rows*2-1;		
                for(int i=1 ; i<=(rows*2-1) ; i++){				// 1 
                        if(i<=rows){						// 2  3
                                for(int j=1 ; j<=i ; j++){            		// 4  5  6
                                        System.out.printf("%4d" , num);         // 7  8  9  10
                                        num++;                                  // 4  5  6
                                }                                               // 2  3
                                System.out.println();                           // 1
                        }else{  
				num = num - count;
							
                                for(int k=1 ; k<=(rows-temp) ; k++){             
                                        System.out.printf("%4d" , num);         
                                        num++;                                 
                                }
				temp++;
				count = count - 2;
                                System.out.println();
                        }
                }
        }

	void pattern72(int rows){
                char ch = 'A';
                int temp = 1;
                int count = rows*2-1;
                for(int i=1 ; i<=(rows*2-1) ; i++){                             // A
                        if(i<=rows){                                            // B  C
                                for(int j=1 ; j<=i ; j++){                      // D  E  F
                                        System.out.print( "   " + ch ) ;        // G  H  I  J
                                        ch++;                                   // D  E  F
                                }                                               // B  C
                                System.out.println();                           // A
                        }else{
                                ch = (char)(ch - count);

                                for(int k=1 ; k<=(rows-temp) ; k++){
                                        System.out.printf( "   " + ch );
                                        ch++;
                                }
                                temp++;
                                count = count - 2;
                                System.out.println();
                        }
                }
        }

	void pattern73(int rows){
                int num = 1;
                int temp = 1;
                for(int i=1 ; i<=(rows*2-1) ; i++){                             // 1
                        if(i<=rows){                                            // 2  2
                                for(int j=1 ; j<=i ; j++){                      // 3  3  3
                                        System.out.printf("%4d" , num);         // 4  4  4  4
                                }						// 3  3  3
				num++;			   	                // 2  2
                                System.out.println();                           // 1
                        }else{
				if(i == rows+1){
					num = num - 2; 
				}
                                for(int k=1 ; k<=(rows-temp) ; k++){
                                        System.out.printf("%4d" , num);
                                }
                                temp++;
				num--;
                                System.out.println();
                        }
                }
        }
	
	void pattern74(int rows){
                int num = 1;
                int temp = 1;
                for(int i=1 ; i<=(rows*2-1) ; i++){                             // 1
                        if(i<=rows){                                            // 2  1
                                for(int j=1 ; j<=i ; j++){                      // 3  2  1
                                        System.out.printf("%4d" , num);		// 4  3  2  1
			       		num--;		                        // 3  2  1
                                }                                               // 2  1
                                num = i+1;                                      // 1
                                System.out.println();                           
                        }else{
                                if(i == rows+1){
                                        num = rows-1;
                                }
                                for(int k=1 ; k<=(rows-temp) ; k++){
                                        System.out.printf("%4d" , num);
					num--;
                                }
                                temp++;
                                num = rows-temp ;
                                System.out.println();
                        }
                }
        }

	void pattern75(int rows){
                int mid = (int) (rows/2+1);
		int num = 1;
                int temp = mid;
		int count = 0;
                for(int i=1 ; i<=rows ; i++){                                       // 1  2  3  4  5           1  2  3  4  5  6
                        if(i<=mid){						    //    2  3  4		  2  3  4  5
				if(rows%2 == 0 && i == mid){			    //       3	 	 or	     3  4
					num = mid-1;				    //    2  3  4		     3  4
					for(int j=1 ; j<=(rows/2-1) ; j++){	    // 1  2  3  4  5		  2  3  4  5  
						System.out.print("    ");	    //                         1  2  3  4  5  6
					}
					for(int k=1 ; k<=2 ; k++){
                                                System.out.printf("%4d" , num);
                                                num++;
                                        }
				}else{
					num = i;
					for(int j=1 ; j<=i-1 ; j++){
						System.out.printf("    ");
					}
					for(int k=1 ; k<=(rows-count) ; k++){                  
                                        	System.out.printf("%4d" , num);          
                                        	num++;                                  
                                	}
				}		
                                count = count + 2;                                      
                                System.out.println();
                        }else{
				if(i == mid+1){
					if(rows%2 == 0){
						temp = 4;
					}else{
						temp = 3;
					}
				}
				num = (rows-i+1);
				for(int j=1 ; j<=(rows-i) ; j++){
					System.out.print("    ");
				}
				for(int k=1 ; k<=temp ; k++){
					System.out.printf("%4d" , num);
					num++;
				}
				temp = temp+2;
				System.out.println();
			}
                        
                }
        }

	void pattern76(int rows){
		int count = 1;
		for(int i = 1; i<=rows ; i++){                       	//             1
			int num = 1;                                	//          1  2  1 
			for(int j=1 ; j<=(rows-i) ; j++){		//       1  2  3  2  1
				System.out.print("    ");		//    1  2  3  4  3  2  1
			}						// 1  2  3  4  5  4  3  2  1
			for(int k=1 ; k<=count ; k++){
				System.out.printf("%4d" , num);
				if(k<i){
					num++;
				}else{
					num--;
				}
			}
			count = count + 2;
			System.out.println();
		}
	}

	void pattern77(int rows){
                int count = rows*2-1;
                for(int i = 1; i<=rows ; i++){				// 1  2  3  4  5  4  3  2  1
                        int num = 1;					//    1  2  3  4  3  2  1
                        for(int j=1 ; j<=(i-1) ; j++){			//       1  2  3  2  1 
                                System.out.print("    ");		//          1  2  1 
                        }						//             1
                        for(int k=1 ; k<=count ; k++){
                                System.out.printf("%4d" , num);
                                if( k<(rows-i+1) ){
                                        num++;
                                }else{
                                        num--;
                                }
                        }
                        count = count - 2;
                        System.out.println();
                }
        }

	void pattern78(int rows){
                int mid = (int)(rows/2+1);
                int temp = mid-1;
                for(int i = 1; i<=rows ; i++){                                   // *           *                *              *
                        int num = i;                                             //    *     *                      *        *
                        if(i<=mid){                                              //       *             or             *  *
                                for(int j=1 ; j<=rows ; j++){                    //    *     *                         *  *
                                        if(i==j || j == (rows-i+1)){             // *           *                   *        *
                                                System.out.print("   *");        //                              *              *
                                        }else{
                                                System.out.printf("    ");
                                        }
                                }
                        }else{
                                if(rows%2 == 0 && i == mid+1){
                                        temp--;
                                }
                                for(int j=1 ; j<=rows ; j++){
                                        if(i==j || j == temp){
                                                System.out.printf("   *");
                                        }else{
                                                System.out.printf("    ");
                                        }
                                }
                                temp--;

                        }

                        System.out.println();
                }
        }

	void pattern79(int rows){
		int mid = (int)(rows/2+1);
		int temp = mid-1;
		for(int i = 1; i<=rows ; i++){                                   // 1           1		 1              1
			int num = i;						 //    2     2			    2        2
			if(i<=mid){						 //       3             or   	       3  3
				for(int j=1 ; j<=rows ; j++){			 //    4     4			       4   4
		      			if(i==j || j == (rows-i+1)){		 // 5           5                   5        5
						System.out.printf("%4d" , num);  //                              6              6
					}else{		
						System.out.printf("    ");
			 		}	
				}
			}else{	
				if(rows%2 == 0 && i == mid+1){
					temp--;
				}
				for(int j=1 ; j<=rows ; j++){
		    			if(i==j || j == temp){
                                                System.out.printf("%4d" , num);
                                        }else{
                                                System.out.printf("    ");
                                        }
				}
				temp--;

			}

			System.out.println();
		}
	}
	
	void pattern80(int rows){
                int num = 1;
                int temp = rows-1;
                for(int i=1; i<=rows*2-1 ; i++) {				// * * * * * * * * *
                        for(int j=1; j<=(rows*2-1) ; j++){			// * * * *   * * * *
                                if(i==1 || i==(rows*2-1)){			// * * *       * * *
                                        System.out.print(" *");			// * *           * *
                                }else{						// *               *
                                        if(j <= temp){				// * *           * *
                                                System.out.print(" *");		// * * *       * * *
                                        }else if(j <= temp+num){		// * * * *   * * * *
                                                System.out.print("  ");		// * * * * * * * * *
                                        }else{
                                                System.out.print(" *");
                                        }
                                }
                        }
                        if(i>1){
                                if( i<rows){
                                        num = num + 2;
                                        temp--;
                                }else{
                                        num = num - 2;
                                        temp++;
                                }
                        }
                        System.out.println();
                }
	}

	void pattern81(int rows){
		for(int i=1 ; i<=rows ; i++){
			char ch = 'A';
			for(int j=1 ; j<=rows ; j++){				// A  B  C  D  E 
				if(i==1 || j==1 || i==rows || j==rows){		// A           E
					System.out.print(" " + ch);		// A           E 
				}else{						// A           E
					System.out.print("  ");			// A  B  C  D  E
				}
				ch++;
			}
			System.out.println();
		}	
	}
	
        void pattern82(int rows){
                for(int i=1 ; i<=rows ; i++){
                        int num = 1;
                        for(int j=1 ; j<=rows ; j++){                           // 1
                                if(j==1 || i==rows || j==i){                    // 1  2      
                                        System.out.printf("%4d" , num);         // 1     3
                                }else{                                          // 1        4
                                        System.out.print("    ");               // 1  2  3  4  5
                                }
                                num++;
                        }
                        System.out.println();
                }
        }

	void pattern83(int rows){
		int mid = (int) (rows/2+1);
                int m = 0;
                int num = 0;
                int firstGap = 0;
                int lastGap = 0;
                boolean isTrue = true;
		int temp = rows/2-3;

                for(int i=1 ; i<=rows ; i++){
                        if(rows%2==1){                                                          // 1   2   3   4   5   6   7
                                if(i<=mid){                                                     // 24  25  26  27  28  29  8
                                        num = (( (rows-1) * 4 )) - m ;                          // 23  40  41  42  43  30  9
                                        firstGap = (9 * (mid-2) - (mid-3)) + 8;                 // 22  39  48  49  44  31  10
                                        lastGap = (5 * (mid-1) + (3 * (mid-2))) - ((i-2)*8) ;   // 21  38  47  46  45  32  11
                                }else{                                                          // 20  37  36  35  34  33  12
                                        num =  (( (rows-1) * 4 )) - (i-2) ;			// 19  18  17  16  15  14  13
                                        firstGap = (9 * (mid-2) - (mid-3)) + 8;
                                        lastGap = (5 * (mid-1) + (3 * (mid-2))) - (8 * (m-2));           //  or
                                }
                        }else if(rows%2==0){
                                if(i<=mid){
                                        num = (( (rows-1) * 4 )) - m ; ;                         // 1   2   3   4   5   6   7   8
                                        lastGap = (9 * (mid-2) - (mid-3)) - ((i-2)*8);           // 28  29  30  31  32  33  34  9
                                        firstGap = (5 * ((mid-1)-1) + (3 * ((mid-1)-2))) + 8 ;   // 27  48  49  50  51  52  35  10
                                }else{                                                           // 26  47  60  61  62  53  36  11
                                        num = (( (rows-1) * 4 )) - (i-2) ;                       // 25  46  59  64  63  54  37  12
                                        lastGap = (9 * (mid-2) - (mid-3)) - (8*temp);            // 24  45  58  57  56  55  38  13
                                        firstGap = (5 * ((mid-1)-1) + (3 * ((mid-1)-2))) + 8;    // 23  44  43  42  41  40  39  14
                                }                                                                // 22  21  20  19  18  17  16  15
                        }


                        for(int j=1 ; j<=rows ; j++){
                                if(i==1){
                                        System.out.printf("%4d" , j);

                                }else if(i<=mid){
                                        if(j==1){
                                                System.out.printf("%4d" , num);
                                        }else if(j<=m+1){
                                                num = num + firstGap;
                                                System.out.printf("%4d" , num);
                                        }else if(j>(m+1) && j<=(rows-i+1)){
                                                num++;
                                                System.out.printf("%4d" , num);
                                        }else {
                                                num = num - lastGap;
                                                System.out.printf("%4d" , num);
                                                lastGap = lastGap + 8;
                                        }
                                        firstGap = firstGap - 8;

                                }else{
					if(rows%2 == 0 && i == mid+1 && isTrue==true ){
                                                m--;
                                                isTrue = false;
                        		}

                                        if(j==1){
                                                System.out.printf("%4d" , num);
                                        }else if(j<=m){
                                                num = num + firstGap;
                                                System.out.printf("%4d" , num);
                                        }else if(j>m && j<=i){
                                                num--;
                                                System.out.printf("%4d" , num);
                                        }else {
                                                num = num - lastGap;
                                                System.out.printf("%4d" , num);
                                                lastGap = lastGap + 8;
                                        }
                                        firstGap = firstGap - 8;
                                }

                        }

                        if( i>1 &&i<=mid){
                                m++;
                        }else if(i>1 && i>mid){
                                m--;
				temp--;
                        }
                        System.out.println();
                }

	}

	void pattern84(int rows){
		int mid = (int) (rows/2+1);
		int m = 0;
		int num = 0;
		int firstGap = 0;
		int lastGap = 0;
		boolean isTrue = true;
		int temp = rows/2-3;

		for(int i=1 ; i<=rows ; i++){							
			if(rows%2==1){								// 49 48 47 46 45 44 43
				if(i<=mid){							// 26 25 24 23 22 21 42
					num = (((rows-2)*(rows-2))+1) + m ;			// 27 10  9  8  7 20 41
					firstGap = (9 * (mid-2) - (mid-3)) + 8;			// 28 11  2  1  6 19 40
					lastGap = ((5 * (mid-1)) + (3*(mid-2))) - (8*m) ;	// 29 12  3  4  5 18 39
				}else{								// 30 13 14 15 16 17 38
					num = (((rows-2)*(rows-2))+1) + (i-2) ;			// 31 32 33 34 35 36 37
					firstGap = (9 * (mid-2) - (mid-3)) + 8;
					lastGap = ((5 * (mid-1)) + (3*(mid-2))) - (8*(m-2)) ;          //  or
				}
			}else if(rows%2==0){							
				if(i<=mid){		
					num = (((rows-2)*(rows-2))+1) + m ;			// 64 63 62 61 60 59 58 57
					lastGap = (9 * (mid-2) - (mid-3)) - (8*m);		// 37 36 35 34 33 32 31 56
					firstGap = ((5 * (mid-2)) + (3*(mid-3))) + 8 ;		// 38 17 16 15 14 13 30 55
				}else{								// 39 18  5  4  3 12 29 54
					num = (((rows-2)*(rows-2))+1) + (i-2) ;			// 40 19  6  1  2 11 28 53
					lastGap = (9 * (mid-2) - (mid-3)) - (8*temp);           // 41 20  7  8  9 10 27 52
					firstGap = ((5 * (mid-2)) + (3*(mid-3))) + 8 ;		// 42 21 22 23 24 25 26 51
				}								// 43 44 45 46 47 48 49 50
			}

											
			for(int j=1 ; j<=rows ; j++){						
				if(i==1){                                                       
					System.out.printf("%4d" , ((rows*rows-j)+1));           
												
				}else if(i<=mid){                                             
					if(j==1){
						System.out.printf("%4d" , num);
					}else if(j<=m+1){
						num = num - firstGap;
						System.out.printf("%4d" , num);
					}else if(j>(m+1) && j<=(rows-i+1)){
						num--;
						System.out.printf("%4d" , num);
					}else {
						num = num + lastGap;
						System.out.printf("%4d" , num);
						lastGap = lastGap + 8;
					}
					firstGap = firstGap - 8;

				}else{
					if(rows%2 == 0 && i == mid+1 && isTrue==true ){
						m--;
						isTrue = false;
					}

					if(j==1){
						System.out.printf("%4d" , num);
					}else if(j<=m){
						num = num - firstGap;
						System.out.printf("%4d" , num);
					}else if(j>m && j<=i){
						num++;
						System.out.printf("%4d" , num);
					}else {
						num = num + lastGap;
						System.out.printf("%4d" , num);
						lastGap = lastGap + 8;
					}
					firstGap = firstGap - 8;
				}

			}
			if( i>1 &&i<=mid){
				m++;
			}else if(i>1 && i>mid){
				m--;
				temp--;
			}
			
			System.out.println();					
		}

	}

	void pattern85(int rows){
		int mid = (int)(rows/2+1);

		for(int i=1 ; i<=rows ; i++){
			for(int j=1 ; j<= rows ; j++){
				if(rows%2==1){							// 1  2  3  4  5 
					if(i==1){						// 2           4
						System.out.printf("%4d" , j); 			// 3     3     3
					}else if(j==1){						// 4           2
						System.out.printf("%4d" , i);			// 5  4  3  2  1
					}else if(j==rows){				
						System.out.printf("%4d" , rows-i+1);
					}else if(j==mid && i==mid){
						System.out.printf("%4d" , mid);
					}else if(i==rows){						//or
						System.out.printf("%4d" , rows-j+1);
					}else if(j<rows){
						System.out.printf("    ");
					}
				}else{								// 1  2  3  4  5  6
					if(i==1){						// 2              5
                                                System.out.printf("%4d" , j);			// 3     4  4     4
                                        }else if(j==1){						// 4     4  4     3
                                                System.out.printf("%4d" , i);			// 5              2
                                        }else if(j==rows){					// 6  5  4  3  2  1
                                                System.out.printf("%4d" , rows-i+1);		
                                        }else if(j==mid-1 && i==mid-1 || j==mid && i==mid-1 || j==mid-1 && i==mid || j==mid && i==mid){
                                                System.out.printf("%4d" , mid);
                                        }else if(i==rows){
                                                System.out.printf("%4d" , rows-j+1);
                                        }else if(j<rows){
                                                System.out.printf("    ");
                                        }
				}
			}
			System.out.println();
		}
	}

	void pattern86(int rows){
                int mid = (int)(rows/2+1);
		int num = (rows-1) * 4;
		
                for(int i=1 ; i<=rows ; i++){
                        for(int j=1 ; j<= rows ; j++){
                                if(rows%2==1){                                                  // 1  2  3  4  5
                                        if(i==1){                                               //16           6
                                                System.out.printf("%4d" , j);                   //15    25     7
                                        }else if(j==1){                                         //14           8
                                                System.out.printf("%4d" , num);			//13 12 11 10  9
			     			num--;					
                                        }else if(j==rows){
                                                System.out.printf("%4d" , rows+i-1);
                                        }else if(j==mid && i==mid){
                                                System.out.printf("%4d" , (rows*rows));
                                        }else if(i==rows){                                              //or
                                                System.out.printf("%4d" , num);
						num--;
                                        }else if(j<rows){
                                                System.out.printf("    ");
                                        }
                                }else{                                                          // 1  2  3  4  5  6
                                        if(i==1){                                               //20              7
                                                System.out.printf("%4d" , j);                   //19    36 36     8
                                        }else if(j==1){                                         //18    36 36     9
                                                System.out.printf("%4d" , num);        		//17             10
			     			num--;    					//16 15 14 13 12 11
                                        }else if(j==rows){                                      
                                                System.out.printf("%4d" , rows+i-1);
                                        }else if(j==mid-1 && i==mid-1 || j==mid && i==mid-1 || j==mid-1 && i==mid || j==mid && i==mid){
                                                System.out.printf("%4d" , (rows*rows));
                                        }else if(i==rows){
                                                System.out.printf("%4d" , num);
						num--;
                                        }else if(j<rows){
                                                System.out.printf("    ");
                                        }
                                }
                        }
                        System.out.println();
                }
        }

	void pattern87(int rows){
		int mid = (int)((rows*2-1)/2)+1;
		int range1 = rows-1;

		for(int i=1 ; i<=rows*2-1 ; i++){  					// 4 4 4 4 4 4 4
			int num = rows;							// 4 3 3 3 3 3 4
			boolean isTrue = true;						// 4 3 2 2 2 3 4
											// 4 3 2 1 2 3 4
			for(int j=1 ; j<=rows*2-1 ; j++){				// 4 3 2 2 2 3 4
				if(i==1){						// 4 3 3 3 3 3 4
					System.out.printf("%4d" , rows);		// 4 4 4 4 4 4 4
				}else if(i<=mid){
					if(j<=i-1){
						System.out.printf("%4d" , num);
						num--;
					}else if(j>i-1 && j<=(rows-i+3)){
						System.out.printf("%4d" , num);
					}else{
						System.out.printf("%4d" , num);
						num++;
					}
				}else if(i>mid){
					if(j<=range1){
						System.out.printf("%4d" , num);
						num--;
					}else if(j>range1 && j<=i-1){
						if(isTrue){
							num++;
							isTrue = false;		
						}
						System.out.printf("%4d" , num);	
					}else{
						System.out.printf("%4d" , num);
                                                num++;
					}
					
				}
			}
			if(i>mid){
				range1--;
			}
			System.out.println();
		}
	} 

	 void pattern88(int rows){
                int mid = (int)(rows/2)+1;
                int range1 = 0;
		int range2 = 0;

		if(rows%2==1){
			range1 = mid-1;
		}else{
			range1 = mid-2;
		}

                for(int i=1 ; i<=rows ; i++){                                           // 5 5 5 5 5
                        int num = rows;                                                 // 5 4 4 4 5
                        boolean isTrue = true;						// 5 4 3 4 5
			if(rows%2==1){							// 5 4 4 4 5
				range2 = rows-i;					// 5 5 5 5 5
			}else if(rows%2==0){
				range2 = rows-i;
			}				
                                                                                            //or 
                        for(int j=1 ; j<=rows ; j++){                                  
                                if(i==1){                                               
                                        System.out.printf("%4d" , rows);                // 6 6 6 6 6 6
                                }else if(i<=mid){ 					// 6 5 5 5 5 6
                                        if(j<=i-1){					// 6 5 4 4 5 6
                                                System.out.printf("%4d" , num);		// 6 5 4 4 5 6
                                                num--;					// 6 5 5 5 5 6
                                        }else if(j>i-1 && j<=range2){			// 6 6 6 6 6 6
                                                System.out.printf("%4d" , num);
                                        }else{
						if(rows%2==0 && i==mid && isTrue){
							num++;
							isTrue = false;
						}
                                                System.out.printf("%4d" , num);
						num++;
                                        }
                                }else if(i>mid){

                                        if(j<=range1){
                                                System.out.printf("%4d" , num);
                                                num--;
                                        }else if(j>range1 && j<=i-1){
                                                if(isTrue){
                                                        num++;
                                                        isTrue = false;
                                                }
                                                System.out.printf("%4d" , num);
                                        }else{
                                                System.out.printf("%4d" , num);
                                                num++;
                                        }

                                }
                        }
                        if(i>mid){
                                range1--;
                        }
                        System.out.println();
                }
        }

	void pattern89(int rows){
                int mid = (int)(rows/2+1);

                for(int i=1 ; i<=rows ; i++){
                        for(int j=1 ; j<= rows ; j++){
                                if(rows%2==1){                                                  // 1  2  3  4  5  6  7
                                        if(i==1){                                               // 2                 6
                                                System.out.printf("%4d" , j);                   // 3     4     4     5
                                        }else if(j==1){                                         // 4        4        4
                                                System.out.printf("%4d" , i);                   // 5     4     4     3
												// 6                 2
                                        }else if(j==rows){					// 7  6  5  4  3  2  1
                                                System.out.printf("%4d" , rows-i+1);
                                        }else if(j==mid && i==mid || j==mid-1 && i==mid-1 || j==mid+1 && i==mid+1 || j==mid-1 && i==mid+1 || j==mid+1 && i==mid-1){
                                                System.out.printf("%4d" , mid);
                                        }else if(i==rows){                                              //or
                                                System.out.printf("%4d" , rows-j+1);
                                        }else if(j<rows){
                                                System.out.printf("    ");
                                        }							// 1  2  3  4  5  6  7  8 
                                }else{                                                          // 2                    7
                                        if(i==1){                                               // 3     5        5     6
                                                System.out.printf("%4d" , j);                   // 4        5  5        5
                                        }else if(j==1){                                         // 5        5  5        4
                                                System.out.printf("%4d" , i);                   // 6     5        5     3
                                        }else if(j==rows){                                      // 7                    2
                                                System.out.printf("%4d" , rows-i+1);		// 8  7  6  5  4  3  2  1
                                        }else if(j==mid-1 && i==mid-1 || j==mid && i==mid-1 || j==mid-1 && i==mid || j==mid && i==mid || j==mid-2 && i==mid-2 || j==mid+1 && i==mid+1 || j==mid-2 && i==mid+1 || j==mid+1 && i==mid-2){
                                                System.out.printf("%4d" , mid);
                                        }else if(i==rows){
                                                System.out.printf("%4d" , rows-j+1);
                                        }else if(j<rows){
                                                System.out.printf("    ");
                                        }
                                }
                        }
                        System.out.println();
                }
        }

	void pattern90(int rows){
		int mid = rows/2+1;
		int mid2 = (mid-2)/2;
		int range1 = 0;
		int range2 = 0;

		for(int i=1 ; i<=rows ; i++){
			for(int j=1; j<=rows+(mid-2) ; j++){
				if(i==1  || i==rows){
					System.out.print(" *");
				}else if(j==1 || j==rows+(mid-2)){
					System.out.print(" *");
				}else if(i==3 && j>2 && j<(rows+(mid-2))-1|| i==rows-2 && j>2 && j<(rows+(mid-2))-1){
					System.out.print(" *");
				}else if(i>3 && i<rows-2 && (j==3 || j==(rows+(mid-2)-2))){
                                        System.out.print(" *");
                                }else if(i==mid && (j==3 || j==(rows+(mid-2))-2)){
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	void pattern91(int rows){
                int mid = rows/2+1;
                int mid2 = (mid-2)/2;
                int range1 = 0;
                int range2 = 0;

                for(int i=1 ; i<=rows ; i++){
                        for(int j=1; j<=rows+2 ; j++){
                                if(i==1  || i==rows){
                                        System.out.print(" *");
                                }else if(j==1 || j==rows+2){
                                        System.out.print(" *");
                                }else if(i==3 && j>=3 && j<(rows+2)-1|| i==rows-2 && j>2 && j<(rows+2)-1){
                                        System.out.print(" *");
                                }else if(i==5 && j>=5 && j<(rows+2)-3|| i==rows-4 && j>4 && j<(rows+2)-3){
                                        System.out.print(" *");
                                }else if(i>3 && i<rows-2 && (j==3 || j==(rows+2)-2)){
                                        System.out.print(" *");
                                }else if(i>5 && i<rows-4 && (j==5 || j==(rows+2)-4)){
                                        System.out.print(" *");
                                }else if(i==mid && (j==3 || j==(rows+2)-2)){
                                        System.out.print(" *");
                                }else{
                                        System.out.print("  ");
                                }
                        }
                        System.out.println();
                }
        }


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Available Patterns:\n"+
					"01 : Pattern01 " + "       " + "21 : Pattern21 " + "       " + "41 : Pattern41 " + "       " + "61 : Pattern61 " + "       " + "81 : Pattern81\n"+
					"02 : Pattern02 " + "       " + "22 : Pattern22 " + "       " + "42 : Pattern42 " + "       " + "62 : Pattern62 " + "       " + "82 : Pattern82\n"+
                                        "03 : Pattern03 " + "       " + "23 : Pattern23 " + "       " + "43 : Pattern43 " + "       " + "63 : Pattern63 " + "       " + "83 : Pattern83\n"+
                                        "04 : Pattern04 " + "       " + "24 : Pattern24 " + "       " + "44 : Pattern44 " + "       " + "64 : Pattern64 " + "       " + "84 : Pattern84\n"+
                                        "05 : Pattern05 " + "       " + "25 : Pattern25 " + "       " + "45 : Pattern45 " + "       " + "65 : Pattern65 " + "       " + "85 : Pattern85\n"+
                                        "06 : Pattern06 " + "       " + "26 : Pattern26 " + "       " + "46 : Pattern46 " + "       " + "66 : Pattern66 " + "       " + "86 : Pattern86\n"+
                                        "07 : Pattern07 " + "       " + "27 : Pattern27 " + "       " + "47 : Pattern47 " + "       " + "67 : Pattern67 " + "       " + "87 : Pattern87\n"+
                                        "08 : Pattern08 " + "       " + "28 : Pattern28 " + "       " + "48 : Pattern48 " + "       " + "68 : Pattern68 " + "       " + "88 : Pattern88\n"+
                                        "09 : Pattern09 " + "       " + "29 : Pattern29 " + "       " + "49 : Pattern49 " + "       " + "69 : Pattern69 " + "       " + "89 : Pattern89\n"+
                                        "10 : Pattern10 " + "       " + "30 : Pattern30 " + "       " + "50 : Pattern50 " + "       " + "70 : Pattern70 " + "       " + "90 : Pattern90\n"+
					"11 : Pattern11 " + "       " + "31 : Pattern31 " + "       " + "51 : Pattern51 " + "       " + "71 : Pattern71 " + "       " + "91 : Pattern91\n"+
                                        "12 : Pattern12 " + "       " + "32 : Pattern32 " + "       " + "52 : Pattern52 " + "       " + "72 : Pattern72\n"+
                                        "13 : Pattern13 " + "       " + "33 : Pattern33 " + "       " + "53 : Pattern53 " + "       " + "73 : Pattern73\n"+
                                        "14 : Pattern14 " + "       " + "34 : Pattern34 " + "       " + "54 : Pattern54 " + "       " + "74 : Pattern74\n"+
                                        "15 : Pattern15 " + "       " + "35 : Pattern35 " + "       " + "55 : Pattern55 " + "       " + "75 : Pattern75\n"+
                                        "16 : Pattern16 " + "       " + "36 : Pattern36 " + "       " + "56 : Pattern56 " + "       " + "76 : Pattern76\n"+
                                        "17 : Pattern17 " + "       " + "37 : Pattern37 " + "       " + "57 : Pattern57 " + "       " + "77 : Pattern77\n"+
                                        "18 : Pattern18 " + "       " + "38 : Pattern38 " + "       " + "58 : Pattern58 " + "       " + "78 : Pattern78\n"+
                                        "19 : Pattern19 " + "       " + "39 : Pattern39 " + "       " + "59 : Pattern59 " + "       " + "79 : Pattern79\n"+
                                        "20 : Pattern20 " + "       " + "40 : Pattern40 " + "       " + "60 : Pattern60 " + "       " + "80 : Pattern80\n"+
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
					case 34:
                                                obj.pattern34(rows);
                                                break;
					case 35:
                                                obj.pattern35(rows);
                                                break;
					case 36:
                                                obj.pattern36(rows);
                                                break;
					case 37:
                                                obj.pattern37(rows);
                                                break;
					case 38:
                                                obj.pattern38(rows);
                                                break;
					case 39:
                                                obj.pattern39(rows);
                                                break;
					case 40:
                                                obj.pattern40(rows);
                                                break;
					case 41:
                                                obj.pattern41(rows);
                                                break;
					case 42:
                                                obj.pattern42(rows);
                                                break;
					case 43:
                                                obj.pattern43(rows);
                                                break;
					case 44:
                                                obj.pattern44(rows);
                                                break;
					case 45:
                                                obj.pattern45(rows);
                                                break;
					case 46:
                                                obj.pattern46(rows);
                                                break;
					case 47:
                                                obj.pattern47(rows);
                                                break;
					case 48:
                                                obj.pattern48(rows);
                                                break;
					case 49:
                                                obj.pattern49(rows);
                                                break;
					case 50:
                                                obj.pattern50(rows);
                                                break;
					case 51:
                                                obj.pattern51(rows);
                                                break;
					case 52:
                                                obj.pattern52(rows);
                                                break;
					case 53:
                                                obj.pattern53(rows);
                                                break;
					case 54:
                                                obj.pattern54(rows);
                                                break;
					case 55:
                                                obj.pattern55(rows);
                                                break;
					case 56:
                                                obj.pattern56(rows);
                                                break;
					case 57:
                                                obj.pattern57(rows);
                                                break;
					case 58:
                                                obj.pattern58(rows);
                                                break;
					case 59:
                                                obj.pattern59(rows);
                                                break;
					case 60:
                                                obj.pattern60(rows);
                                                break;
					case 61:
                                                obj.pattern61(rows);
                                                break;
					case 62:
                                                obj.pattern62(rows);
                                                break;
					case 63:
                                                obj.pattern63(rows);
                                                break;
					case 64:
                                                obj.pattern64(rows);
                                                break;
					case 65:
                                                obj.pattern65(rows);
                                                break;
					case 66:
                                                obj.pattern66(rows);
                                                break;
					case 67:
                                                obj.pattern67(rows);
                                                break;
					case 68:
                                                obj.pattern68(rows);
                                                break;
					case 69:
                                                obj.pattern69(rows);
                                                break;
					case 70:
                                                obj.pattern70(rows);
                                                break;
					case 71:
                                                obj.pattern71(rows);
                                                break;
					case 72:
                                                obj.pattern72(rows);
                                                break;
					case 73:
                                                obj.pattern73(rows);
                                                break;
					case 74:
                                                obj.pattern74(rows);
                                                break;
					case 75:
                                                obj.pattern75(rows);
                                                break;
					case 76:
                                                obj.pattern76(rows);
                                                break;
					case 77:
                                                obj.pattern77(rows);
                                                break;
					case 78:
                                                obj.pattern78(rows);
                                                break;
					case 79:
                                                obj.pattern79(rows);
                                                break;
					case 80:
                                                obj.pattern80(rows);
                                                break;
					case 81:
                                                obj.pattern81(rows);
                                                break;
					case 82:
                                                obj.pattern82(rows);
                                                break;
					case 83:
                                                obj.pattern83(rows);
                                                break;
					case 84:
                                                obj.pattern84(rows);
                                                break;
					case 85:
                                                obj.pattern85(rows);
                                                break;
					case 86:
                                                obj.pattern86(rows);
                                                break;
					case 87:
                                                obj.pattern87(rows);
                                                break;
					case 88:
                                                obj.pattern88(rows);
                                                break;
					case 89:
                                                obj.pattern89(rows);
                                                break;
					case 90:
                                                obj.pattern90(rows);
                                                break;
					case 91:
                                                obj.pattern91(rows);
                                                break;
                                        default :
                                                System.out.println("Invalid option . Please try again.");
                                }
                                System.out.println("---------------*************************---------------");
                        }
                }
	}
}
