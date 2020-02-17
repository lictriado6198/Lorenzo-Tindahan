/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lorenzo.tindahan;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class LorenzoTindahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
            
            System.out.println("Hello! welcome to Lorenz canteen");
            System.out.println("1. diniguan= 150PHP");
            System.out.println("2. humba = 150PHP");
            System.out.println("3. Sinigang with pork =250PHP");
            System.out.println("4. Sinigang with chicken = 200PHP");
            System.out.println("5) Sinugba nga pork = 500PHP");
            System.out.println("Enter Product number of the item you want to buy.");

                    
        float a=input.nextInt();
        
        
            if(a==1){
                System.out.print("Enter Quantity you want to Buy\n");
                double b=input.nextDouble ();
                float c=150;
                
                System.out.println("Total Price:");
                System.out.print(b*c); 
                System.out.println(" PHP");
                System.out.println(" ");
                System.out.println("Proceeding to checkout...");
                System.out.println("Please input CASH in PHP");
                if (0>(b*c))
                 System.out.println("Cash Sufficient");

                double d=input.nextDouble ();
                 
                 if (d>(b*c)){
                 System.out.println("You are eligible to buy this product");
                 System.out.println(" ");
                 System.out.print("CASH:");
                 System.out.println(d);
                 System.out.print("CHANGE:");
                 System.out.println(d-(b*c));
                 System.out.println(" ");
                 System.out.println("Thank You For maam and sir ");  
                 }
                 else if (d<(b*c))
                     System.out.println("Insufficient Cash");
             }
           else if(a==2){
                System.out.println("Enter Quantity you want to Buy\n");
                
                double b=input.nextDouble ();
                float c=150;
                
                System.out.println("Total Price:");
                System.out.print(b*c); 
                System.out.println("PHP");
                System.out.println(" ");
                System.out.println("Proceeding to checkout...");
                System.out.println("Please input CASH in PHP");
                if (0>(b*c))
                 System.out.println("Cash Sufficient");

                double d=input.nextDouble ();
                 
                 if (d>(b*c)){
                 System.out.println("You are eligible to buy this product");
                 System.out.println(" ");
                 System.out.print("CASH:");
                 System.out.println(d);
                 System.out.print("CHANGE:");
                 System.out.println(d-(b*c));
                 System.out.println(" ");
                 System.out.println("Thank You Maam and sir!");  
                 }
                 else if (d<(b*c))
                     System.out.println("Insufficient Cash");
             }
            else if(a==3){
                System.out.println("Enter Quantity you want to Buy\n");
                
                double b=input.nextDouble ();
                float c=250;
                
                System.out.println("Total Price:");
                System.out.print(b*c); 
                System.out.println("PHP");
                System.out.println(" ");
                System.out.println("Proceeding to checkout...");
                System.out.println("Please input CASH in PHP");
                if (0>(b*c))
                 System.out.println("Cash Sufficient");

                double d=input.nextDouble ();
                 
                 if (d>(b*c)){
                 System.out.println("You are eligible to buy this product");
                 System.out.println(" ");
                 System.out.print("CASH:");
                 System.out.println(d);
                 System.out.print("CHANGE:");
                 System.out.println(d-(b*c));
                 System.out.println(" ");
                 System.out.println("Thank You Maam and Sir");  
                 }
                 else if (d<(b*c))
                     System.out.println("Insufficient Cash");
             }
            else if(a==4){
                System.out.println("Enter Quantity you want to Buy\n");
                
                double b=input.nextDouble ();
                float c=200;
                
                System.out.println("Total Price:");
                System.out.print(b*c); 
                System.out.println("PHP");
                System.out.println(" ");
                System.out.println("Proceeding to checkout...");
                System.out.println("Please input CASH in PHP");
                if (0>(b*c))
                 System.out.println("Cash Sufficient");

                double d=input.nextDouble ();
                 
                 if (d>(b*c)){
                 System.out.println("You are eligible to buy this product");
                 System.out.println(" ");
                 System.out.print("CASH:");
                 System.out.println(d);
                 System.out.print("CHANGE:");
                 System.out.println(d-(b*c));
                 System.out.println(" ");
                 System.out.println("Thank You Maam and Sir");  
                 }
                 else if (d<(b*c))
                     System.out.println("Insufficient Cash");
             }
          else if(a==5){
                System.out.println("Enter Quantity you want to Buy\n");
                
                double b=input.nextDouble ();
                float c=500;
                
                System.out.println("Total Price:");
                System.out.print(b*c); 
                System.out.println(" PHP");
                System.out.println(" ");
                System.out.println("Proceeding to checkout...");
                System.out.println("Please input CASH in PHP");
                if (0>(b*c))
                 System.out.println("Cash Sufficient");

                double d=input.nextDouble ();
                 
                 if (d>(b*c)){
                 System.out.println("You are eligible to buy this product");
                 System.out.println(" ");
                 System.out.print("CASH:");
                 System.out.println(d);
                 System.out.print("CHANGE:");
                 System.out.println(d-(b*c));
                 System.out.println(" ");
                 System.out.println("Thank You Maam and Sir");  
                 }
                 else if (d<(b*c))
                     System.out.println("Insufficient Cash");
             }  
          else if (a>5 || a<0){
              System.out.println("ERROR not in the catalog");
          }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("............................................");
    System.out.println("Program has finished");
            
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
   }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    

