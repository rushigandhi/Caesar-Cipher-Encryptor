import java.util.Scanner;

public class Encryptor {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
			System.out.println("Enter the word you want to encrypt:");
		
			String word = in.nextLine();
			
			word = word.toLowerCase();
			
			System.out.println("How much do you want to rotate it by?");
			
			int amount = in.nextInt();
			
			System.out.println("The encrypted word is:");
			
			rotate_word(word, amount);
	
	}
	
	public static void rotate_word (String word, int amount){
		
		int location;
		
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for (int x = 0; x < word.length(); x++){
			
			for (int i = 0 ; i < alphabet.length; i++){
				
				if(alphabet[i]==word.charAt(x)){
					
					location = amount;
					
					if ((i + location)>25){
						
						location = (location + i) - 26;
						
						System.out.print(alphabet[location]);
						
					}
					else if ((i + location)<0){
						
						location = 26 + (location + i);
						System.out.print(alphabet[location]);
						
					}
					else{
						
						location = location + i;
						
						System.out.print(alphabet[location]);
					}

					i = alphabet.length;
				}
			}
		}
	}
}
