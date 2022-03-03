import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Repeated String Problem*/
public class Repeated_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,count1=0;
	    String k=sc.next(); //input String
	    long n=sc.nextLong();//No of Substring
	    for(int i=0;i<k.length();i++)
	    {
	    	if(k.charAt(i)=='a') 
	    		count++; //Counting the a's value in given string 
	    }
        long div=n/k.length(); //Divide Value of String length and No of substring value, We can get length of Substring 
         long rem=n%k.length(); //If there is Remainder in Substring calculation 
        int pos=0;
        while(rem>0) //when there is a remainder We will run the loop until remainder become ZERO 
        {
        	pos=(int)rem-1;
        	if(k.charAt(pos)=='a') //Checking the Remainder position has 'a' if it has increase count(count1)
        		count1++;
        	rem=rem-1; //reducing a Remainder value
        }
        System.out.println(count*div+count1); //count * div gives No of a's in substring and count1 gives No of a's in remainder
        sc.close();
	}

}
