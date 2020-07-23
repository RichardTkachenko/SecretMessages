import java.util.Scanner;
public class SecretMessages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a message to encode or decode");
		String message = scan.nextLine();
		String output = "";
		System.out.println("Enter a secret key (-25 to 25):");
		int keyVal = Integer.parseInt(scan.nextLine());
		char key = (char) keyVal;
		/*char key = 13;
		for (int x = message.length()-1; x >= 0; x--) {
			output += message.charAt(x);	
		}*/
		//char key = 13;
		for (int x = 0; x < message.length(); x++) {
			//output += (char) (message.charAt(x) + key);
			char input = message.charAt(x);
			if (input >= 'A' && input <= 'Z')
			{
				input += key;
				if (input > 'Z')
					input -=  26;
				if (input < 'A')
					input += 26;
			}
			
			else if (input >= 'a' && input <= 'z')
			{
				input += key;
				if (input > 'z')
					input -=26;
				if (input < 'a')
					input += 26;
			}
			
			else if (input >= '0' && input <= '9')
			{
				input += (keyVal % 10);
				if (input >'9')
					input -= 10;
				if (input < '0')
					input += 10;
			}
			
			output += input;
			
		}
		
		System.out.println(output);
		scan.close();
		
		
		

	}

}
