package prex;
import java.io.*;
import java.util.Scanner;

public class tesst {

	static int firstPos(String str,
						int start,
						int end)
	{
		int firstChar = -1;
		
	
		for(int i = start; i <= end; i++)
		{
			if(str.charAt(i) >= 'a'&&
			str.charAt(i) <= 'z')
			{
				firstChar = i;
				break;
			}
		}
		
		return firstChar;
	}


	static int lastPos(String str,
					int start,
					int end)
	{
		int lastChar = -1;
		
	
		for(int i = start; i >= end; i--)
		{
			if(str.charAt(i) >= 'a'&&
			str.charAt(i) <= 'z')
			{
				lastChar = i;
				break;
			}
		}
		
		return lastChar;
	}


	public static String StringChallenge(String str) {
		
		String newStr=str.toLowerCase();
		
		int firstChar = 0,
				lastChar = str.length() - 1;
			boolean ch = true;

			for (int i = 0; i < str.length(); i++)
			{
				firstChar = firstPos(str, firstChar,
										lastChar);
				lastChar = lastPos(str, lastChar,
										firstChar);

		
				if (lastChar < 0 || firstChar < 0)
					break;
				if (str.charAt(firstChar) ==
					str.charAt(lastChar))
				{
					firstChar++;
					lastChar--;
					continue;
				}
				
			
				ch = false;
				break;
			}

		
		return ch+"";
		
		
	}

	public static void main (String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println(StringChallenge(s.nextLine()));
		
		
	}
	}

	


