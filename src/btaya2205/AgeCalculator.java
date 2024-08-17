package btaya2205;

import java.util.Scanner;

class AgeCalculator {
    
    public void getAge(){
    
    Scanner input = new Scanner(System.in);
        
        String fname ;
        int byear;
                
        
        System.out.print("Enter your name: ");
        fname = input.nextLine();
        System.out.print("Enter Birth Year: ");
        byear = input.nextInt();
        
        System.out.print("Hello "+fname+"\nYour age is "+(2024-byear));
    
    
    }  
}
