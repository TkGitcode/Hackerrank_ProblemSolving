import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Missing Numbers Problem*/
public class Missing_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    ArrayList<Integer> arr=new ArrayList<Integer>(); //Creating a Array list
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		int n1=sc.nextInt();
		ArrayList<Integer> brr=new ArrayList<>();
		for(int i=0;i<n1;i++)
		{
			brr.add(sc.nextInt());
		}
		for(int i=0;i<n;i++)		
		{
			for(int j=0;j<n1;j++)
			{
				if(arr.get(i).equals(brr.get(j))) //Checking a values are equal or not
				{
					brr.remove(j); // if array value(arr) is equal to value(brr) then remove the brr array value
					break; //And breaks the condition
				}
			}
			
		}
		Collections.sort(brr); //Sorting the array
		List<Integer> ls=brr.stream().distinct().collect(Collectors.toList()); //removing  a duplicate
		for(Integer l:ls)
		{
			System.out.print(l+" "); //printing a value inside the Array
		}
		sc.close();
	}

}
