package day03.basic;

/*


3번
    
0   *
1  ***
2 *****
3*******
4 *****
5  ***
6   *
 
0*******
1*******
2*******
3*******
4*******
5*******
6*******
    ★
    *   
   ***  
  ***** 
 *******
4  | |
6  



 

 */
public class MainClass03 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if(i < 4) {		// 위에 * 모양
					if (j + i < 7 / 2) {
						System.out.print(" ");
					} else if (j - i > 7 / 2 ) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {		// 아래 * 모양
					if(j < i-3) {
						System.out.print(" ");
					}else if(i+j >9) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println(); // 개행
		}
	}

}


