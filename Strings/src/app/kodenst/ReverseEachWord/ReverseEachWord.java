package app.kodenst.ReverseEachWord;

public class ReverseEachWord {
	public static String rev(String s1)
	{
		String listOfWord[] = s1.split(" ");
		String revString ="";
		for(int i=0;i<=listOfWord.length-1;i++)
		{
			String word = listOfWord[i];
			char charWord[]=word.toCharArray();
			char revCharWord[]= new char[charWord.length];
			int k=revCharWord.length-1;
			for(int j=0;j<=charWord.length-1;j++)
			{
				revCharWord[k]=charWord[j];
				k--;
			}
			String revword = new String(revCharWord);
			revString = revString+revword+" ";
		}
		return revString;
	}

}
