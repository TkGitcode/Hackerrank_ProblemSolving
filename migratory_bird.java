import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class migratory_bird {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
      
        
        int n=sc.nextInt();
        int count=0,k=0,k1=0,max=0,count1=0,point=0;
        int a[]=new int[n];
        int c[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //Arrays.sort(a);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(a[i]==a[j])
               {
                  i++;
                  count++;
               }
           }
           b[k++]=count+1;
           c[k1++]=a[i];
           //System.out.println("i = "+i);
           //System.out.println("count "+count+1);
           count=0;
       }
       System.out.println(Arrays.toString(c));
       System.out.println(Arrays.toString(b));
      for(int i=0;i<k;i++)
      {
         // System.out.println(b[i]);
          if(max<b[i])
          {
              //System.out.println("MAX"+max);
              max=b[i];
              point =i;
              count1++;
          }
      }
     // System.out.println(point);
      //System.out.println("MAX "+max);
      System.out.println(c[point]);
    }
}
