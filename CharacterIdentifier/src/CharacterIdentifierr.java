import java.util.*;
public class CharacterIdentifierr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check for digit or vowel or consonent");
		char ch = sc.next().charAt(0);
		characterId(ch);
		sc.close();

	}
	public static void characterId(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("The given input "+ch+" is a digit");
		}
		else if (!Character.isLetter(ch))
		{
			System.out.println("The given input "+ch+" is a special character");
		}
		else
		{
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println("The given input "+" is lower case vowel");
				}
				else 
				{
					System.out.println("The given input "+" is upper case vowel");
				}
				break;
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("The given input "+" is lower case consonent");
				}
				else
				{
					System.out.println("The given input "+" is upper case consonent");
				}
					
			}
		}
	}

}
