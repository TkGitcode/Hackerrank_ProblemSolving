/** 
* @Author -- TkGitcode
*/
public class TimeConversion {

	public static void main(String[] args) {
		String s="12:45:54PM",n="",n1="12",n2="00";//12:00:00AM=> 00:00:00 //12:45:54PM  => 12:45:54
		String[] arr={"01","02","03","04","05","06","07","08","09","10","11","12"};//AM
		String[] ar= {"13","14","15","16","17","18","19","20","21","22","23","24"};//PM
		//System.out.println(s.length());
		if(s.charAt(8)=='A')
		{
			if(n1.equals(s.substring(0,2)))
			{
				//System.out.println("f");
				s=s.replaceAll(s.substring(0,2),n2);
				s=s.replace("AM","");
			}
			else
				s=s.replace("AM","");
		}
		else
		{
			if(n1.equals(s.substring(0,2)) && s.charAt(8)=='P')
			{
				//System.out.println(s.substring(0,2));
				s=s.replace("PM","");
				s=s.replace(s.substring(0,2),n1);
			}
			else
			{
		if(s.charAt(8)=='P')
		{
			s=s.replace("PM","");
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!="12")
				{
				String b=s.substring(0, 2);
				if(b.equals(arr[i]))
				{
					//System.out.println(ar[i]);
					 n=ar[i];
				}
				}
				
			}
			
		}
		s=s.replaceAll(s.substring(0,2), n);
			}
		//System.out.println(s.substring(0, 2));
		//System.out.println(s);	
		}
		System.out.println(s);

	}

}
