import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
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
                 zerocount++;
             else if (a[i]>0)
                 positivecount++;
              else
                 negativecount++;
         }
         zero=zerocount/n;
         positive=positivecount/n;
         negative=negativecount/n;
         System.out.printf("%.06f",zero);
         System.out.println();
         System.out.printf("%.06f",positive);
         System.out.println();
         System.out.printf("%.06f",negative);
	}

}
