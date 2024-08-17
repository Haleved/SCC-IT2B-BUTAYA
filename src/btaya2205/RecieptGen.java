package btaya2205;

import java.util.Scanner;

public class RecieptGen {
    
    public void RecieptGen(){
    
    Scanner input = new Scanner(System.in);
    
    String cname, pname;
    int hmany, price, cash;
    
    
    System.out.print("Costumer Name: ");
    cname = input.nextLine();
    System.out.print("Product Name: ");
    pname = input.nextLine();
    System.out.print("Quantity: ");
    hmany = input.nextInt();
    System.out.print("Price: ");
    price = input.nextInt();
    System.out.print("Cash: ");
    cash = input.nextInt();
    System.out.println("-----------------------");
    System.out.print("RECIEPT\n");
    System.out.println("-----------------------");
    System.out.print("Name: "+cname+"\nItem: "+pname+"\nQuantity: "+hmany);
    System.out.println("\n-----------------------");
    System.out.println("Total Due: "+(hmany*price)+"\nCash: "+cash);
    System.out.println("-----------------------");
    System.out.print("Change: "+(cash-(hmany*price)));
    
    }
}
