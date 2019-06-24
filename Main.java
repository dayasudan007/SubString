import java.io.*;
import java.util.*;
public class Main
{
	final static int no_of_chars = 256;
	static int maxDistinctChar(String str,int n)
	{
	    int count[] = new int[no_of_chars];
	    for(int i=0;i<n;i++)
	    {
	        count[str.charAt(i)]++;
	    }
	    int max=0;
	    for(int i=0;i<no_of_chars;i++)
	    {
	        if(count[i]!=0)
	        {
	            max++;
	        }
	    }
	    return max;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		//System.out.println(a);
		int len = maxDistinctChar(a,a.length());
		System.out.println(len);
	}
}
