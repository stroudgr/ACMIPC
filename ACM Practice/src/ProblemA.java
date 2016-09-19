import java.util.Scanner;

public class ProblemA {
	/**
	 * Precondition: 1<=N<=1000
	 * @param N
	 * @return
	 */
	public static void SimonSays(){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] commands = new String[N];
		
		Scanner in = new Scanner(System.in);
		
		for (int i=1; i<=N; i++)
			commands[i-1] = in.nextLine();
			
		in.close();
		sc.close();
		
		int currentIndex = 0;
		
		while(currentIndex < N){
			String s = commands[currentIndex];
			String front = s.substring(0, 11);
			String back = s.substring(11, s.length());
			
			if (front.equals("Simon says "))
				System.out.println(back);
			
			currentIndex++;
				
		}
		
	}
	
	public static void pangram(){
		
		//Takes in inputs N, along with N strings
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] commands = new String[N];
		
		Scanner in = new Scanner(System.in);
		
		for (int i=1; i<=N; i++)
			commands[i-1] = in.nextLine();
		
		in.close();sc.close();
		
		
		//Consider every string entered
		for (int i = 0; i < N; i++)
		{
			//binary array, where 1 is in at <index> if the char with ascii value index+65 in the string
			int contains[] = new int[26];
			
			//Checks each char to see if it is a letter, notes it in the array
			for (int j=0; j<commands[i].length(); j++){
				String s = commands[i];
				
				//letter at index j
				int letter = (int)s.charAt(j); 
				
				//if the letter is a capital letter
				if(65<=letter && letter<=90)
					contains[letter-65] = 1;
				
				//if the letter is a lowercase letter
				if(97<=letter && letter<=122)
					contains[letter-97] = 1;
								
			}
			String missingLetters = "";
			//prints message
			for (int k=0; k < 26; k++){
				if (contains[k] == 0)
					missingLetters += (char)(k+97);
			}
			if (missingLetters.equals(""))
				System.out.println("pangram");
			else
				System.out.println("missing " + missingLetters);
					
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProblemA.pangram();
		
	}

}
