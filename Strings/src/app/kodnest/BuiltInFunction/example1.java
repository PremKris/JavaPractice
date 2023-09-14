package app.kodnest.BuiltInFunction;

public class example1 {

	public static void main(String[] args) {
		String name = "Raja Ram Mohan Roy";//String gets created into a string pool
		System.out.println(name.toUpperCase());//Returns string:Converts string into upper case
		System.out.println(name.toLowerCase());//Returns string:Converts string into lower case
		System.out.println(name.charAt(0));//Returns char:Converts string into character as the specified index:Parameter-integer
		System.out.println(name.indexOf('a'));//Returns integer:Shows the index no of the specified char:Parameter-char
		//System.out.println(name.contains('Ram'));
		//Returns boolean:Checks whether the string is present or not:Parameter-String
		//System.out.println(name.substring('ram'));

	}

}
