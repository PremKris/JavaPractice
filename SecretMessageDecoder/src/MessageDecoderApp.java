import java.util.*;
public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		MessageDecoder md = new MessageDecoder();
		System.out.println(md.decodeCharacter(ch));
		sc.close();

	}

}
