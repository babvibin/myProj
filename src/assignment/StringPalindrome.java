package assignment;

public class StringPalindrome {
	
	public void palindromecheck(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);			
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+ " String is Palindrome.");
		}
		else
		{
			System.out.println(str+ " String is not Palindrome");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome obj=new StringPalindrome();
		obj.palindromecheck("Malayalam");
		obj.palindromecheck("Java");

	}

}
