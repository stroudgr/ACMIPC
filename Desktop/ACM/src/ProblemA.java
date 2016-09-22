import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedList;
import java.util.Scanner;

public class ProblemA {
	/**
	 * Precondition: 1<=N<=1000
	 * @param N
	 * @return
	 */
	
	public static void main(String[] args) throws IOException {
            // TODO Auto-generated method stub
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            
            ArrayList<String []> actions = new ArrayList();
            
            
            int currentIndex = 0;

            while(currentIndex < N){
                String line[] = br.readLine().split(" ");
                if (line.length > 2 && line[0].equals("Simon") && line[1].equals("says")){
                    //line[0]=""; line[1]="";
                    actions.add(line);
                }

                currentIndex++;

            }
            
            for(int i = 0; i < actions.size(); i++){
                String line[] = actions.get(i);
                for (int j=2; j<line.length; j++){
                    if (j<line.length-1)
                       System.out.print(line[j] + " ");
                    else
                        System.out.println(line[j]);
                }
                System.out.println();
                
	} // end for loop
		
	}

}
