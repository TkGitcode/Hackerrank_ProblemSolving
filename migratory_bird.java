import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Migratory Birds Problem*/
public class migratory_bird {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //No of Array Value
        int count=0,k=0,k1=0,max=0,point=0;
        int a[]=new int[n]; //Main Array
        int c[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a); //Sorted The main array to find duplicate
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(a[i]==a[j])
               {
                  i++; //Here (i) have incremented because duplicate element will not repeat
                  count++;
               }
           }
           b[k++]=count+1; /* here count+1 is used to add total element+1 because above loop will not consider first occurance value of 
                           Each separated Value */ 
           c[k1++]=a[i];
           
           count=0; //To Reset the count 
       }
       
      for(int i=0;i<k;i++)
      {
        
          if(max<b[i])
          {
              
              max=b[i]; //Here i got maximum occurrence element  
              point =i; //Here i take a point of above max
          }
      }
      System.out.println(c[point]); //array of c with max value point
      sc.close();
    }
}
