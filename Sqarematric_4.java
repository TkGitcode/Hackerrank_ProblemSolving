import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Diagonal Difference Problem*/
public class Sqarematric_4 {

	public static void main(String[] args) {
		/* Input
		  1 2 3
          4 5 6
          9 8 9 */
		// left to right diagonal =1+5+9
		// right to left diagonal =3+5+9
		//15-17
		//Output abs(2)
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //No of Element
        int array[][] = new int[n][n];
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
                if (i == j) { //Here i check i == j to add from left to Right
                    d1 = d1 + array[i][j]; 
                }
                if (i + j == n - 1) { //Here i check i + j == n-1 to add from Right to left
                    d2 = d2 + array[i][j];
                }
            }
        }
        System.out.println(Math.abs(d1 - d2)); //to avoid negative I used abs(absolute) it is final output 

	}

}
