/** 
* @Author -- TkGitcode
*/
/*HackerRank Time Conversion Problem*/
public class TimeConversion {

	public static void main(String[] args) {
		String s="07:05:45PM",n="",n1="12",n2="00";//12:00:00 AM=> 00:00:00 //12:45:54PM  => 12:45:54
		String[] arr={"01","02","03","04","05","06","07","08","09","10","11","12"};//AM
		String[] ar= {"13","14","15","16","17","18","19","20","21","22","23","24"};//PM
		if(s.charAt(8)=='A') //If Time is AM
		{
			if(n1.equals(s.substring(0,2))) // And if Time is 12
			{
				s=s.replaceAll(s.substring(0,2),n2); // it Replace with 00 like 12:00:00 AM=> 00:00:00
				s=s.replace("AM",""); // And it replace AM with Null
			}
			else
				s=s.replace("AM",""); //if time is not 12 then it replace only a AM
		}
		else
		{
			if(n1.equals(s.substring(0,2)) && s.charAt(8)=='P') // if time 12 with PM 
			{
				s=s.replace("PM",""); //Replace 12 with null
				s=s.replace(s.substring(0,2),n1); //replace with 12
			}
			else
			{
		      if(s.charAt(8)=='P') //if time is PM
		         {
			s=s.replace("PM",""); //PM is replace by null
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!="12") 
				{
				String b=s.substring(0, 2);
				if(b.equals(arr[i]))
				{
					 n=ar[i]; //it change a n value to railway time
				}
				}
			}
		}
		s=s.replaceAll(s.substring(0,2), n); //it finally replace the PM time with railway time
		   }
		}
		System.out.println(s); //final output for the given time

	}

}
