import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author Graeme Stroud
 */
public class SecureDoors  {
 
    
    public static void main (String args[]) throws NumberFormatException, IOException{
    
        //Takes in inputs N, along with N strings
        //Scanner sc = new Scanner(System.in);
        
        //int N = sc.nextInt();
        
        
        //String[] commands = new String[N];

        //Scanner in = new Scanner(System.in);
        
       
        //for (int i=1; i<=N; i++)
        //    commands[i-1] = in.nextLine();
		
	    //in.close();sc.close();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(reader.readLine());
		
	// List of actions to output later
	ArrayList<String> actions = new ArrayList<String>();
        
        
        LinkedList people = new LinkedList();
        
        //Consider every string entered
        for (int i = 0; i < N; i++)
        {   
            String[] sentence = reader.readLine().split(" ");
            
            if (sentence[0].equals("entry")){
                if (people.contains(sentence[1]))
                    actions.add(sentence[1] + " entered (ANOMALY)");
                else{
                    people.add(sentence[1]);
                    actions.add(sentence[1] + " entered");
                }
            }
            else{//exit
                if (people.contains(sentence[1])){
                    people.remove(sentence[1]);
                    actions.add(sentence[1] + " exited");                   
                }
                else
                    actions.add(sentence[1] + " exited (ANOMALY)");
                
            }
        }
        
        for(int i = 0; i < actions.size(); i++){
            System.out.println(actions.get(i).trim());
	} // end for loop
        
    
    }
    
}
