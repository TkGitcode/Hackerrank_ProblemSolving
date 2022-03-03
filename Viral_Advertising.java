import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Viral Advertising Problem*/
public class Viral_Advertising {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int shared=5,liked=1,com=0; //When they launch a new product, they advertise it to exactly 5 people on social media. so shared=5
		for(int i=0;i<n;i++)
		{
			liked=shared/2; //find the liked value to find shared value
			shared=3*liked; //3 is to share with 3 friends
			com+=liked; //and finally we adding cumulative value with liked
		}
		System.out.println(com); //final value of cumulative
       sc.close();
	}

}
