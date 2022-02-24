import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Plus Minus Problem*/
public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(); //No of Elements
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
         float zero=0,positive=0,negative=0;
         float zerocount=0,positivecount=0,negativecount=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]<0)
                 zerocount++; //count how many zero's in Array
             else if (a[i]>0)
                 positivecount++; //count how many Positive in Array
              else
                 negativecount++; //count how many negative in Array
         }
         /*Getting average of Every 3 possibles */
         zero=zerocount/n; 
         positive=positivecount/n;
         negative=negativecount/n;
      /* here i used printf(print format) to give the output of float is in 6 decimal value after pointer */
         System.out.printf("%.06f",zero); 
         System.out.println();
         System.out.printf("%.06f",positive);
         System.out.println();
         System.out.printf("%.06f",negative);
	}

}
