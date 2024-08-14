
package caburnay;

import java.util.Scanner;


public class Sales {
     
    public void getSales(){
        Scanner input = new Scanner (System.in);
            
            String cos_name,prod_name ;
            int quant, price,cash  ;
           
            System.out.print("Enter Customer Name: ");
            cos_name = input.nextLine();
            
            System.out.print("Enter Product Name: ");
            prod_name= input.nextLine();
            
            System.out.print("Enter Quantity: ");
            quant = input.nextInt();
            
            System.out.print("Enter Price: ");
            price = input.nextInt();
            
            System.out.print("Enter Cash: ");
            cash = input.nextInt();
             System.out.print("\n");
             
            System.out.print("--------------------------------------\n");
            System.out.print("RECEIPT:\n");
           System.out.println("--------------------------------------\n");
           
            System.out.print("Name: "+cos_name);
            System.out.print("\n");
            
            System.out.print("Item name:"+prod_name);
             System.out.print("\n");
            System.out.print("Quantity:"+quant);
             System.out.print("\n");
            System.out.println("--------------------------------------");
            
            System.out.print("Total Due:"+(price*quant));
             System.out.print("\n");
            System.out.print("Cash:"+cash);
             System.out.print("\n");
            System.out.print("--------------------------------------\n");
            
              
             System.out.println("Change:"+(cash-(quant*price)));
             
    }
}
