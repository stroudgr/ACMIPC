
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author StroudFamily2013IMac
 */
public class ProblemB {
 
    public static void main (String args[]) throws IOException{
    
        //Takes in inputs N, along with N strings
	Scanner sc = new Scanner(System.in);
		
	//int N = sc.nextInt();
		
	//String[] commands = new String[N];
		
	Scanner in = new Scanner(System.in);
        
        //int p=1;
        //while (sc.hasNextLine() && p<commands.length) {
        //    commands[p] = sc.nextLine();
        //    p++;
        //}
	//for (int i=1; i<=N; i++)
        //    commands[i-1] = in.nextLine();
		
	//in.close();sc.close();
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<String> missingLetters = new ArrayList();
        
        //Consider every string entered
        for (int i = 0; i < N; i++)
        {   
            String command[] = br.readLine().split(" ");
            
            //binary array, where 1 is in at <index> if the char with 
            //ascii value index+65 in the string
            int contains[] = new int[26];

            //Consider every word in the line
            for (int j=0; j<command.length; j++){
                
                String word = command[j];
                
                //every letter of the word
                for (int k=0; k<word.length(); k++){
                    //letter at index j
                    int letter = (int)word.charAt(k); 
                    
                    //if the letter is a capital letter
                    if(65<=letter && letter<=90)
                        contains[letter-65] = 1;

                    //if the letter is a lowercase letter
                    if(97<=letter && letter<=122)
                        contains[letter-97] = 1;

                }
                      
                
            }
            //Currently missing letters from word
            String letters = "";
            //prints message
            for (int k=0; k < 26; k++){
                if (contains[k] == 0)
                        letters += (char)(k+97);
            }
            
            missingLetters.add(letters);
        }
        
        Iterator it = missingLetters.iterator();
        
        Object curr = "";
        
        while (it.hasNext()){
            curr = it.next();
            if (curr.equals(""))
                System.out.println("pangram");
            else
                System.out.println("missing " + curr);
            
        }
    
    }
    
}
