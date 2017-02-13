/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbolsdemo;

/**
 *
 * @author Asus
 */
public class SymbolsDemo {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) 
        throws java.io.IOException {
        int counter = 0, val = 32;
        char end = '.'; char choice;
        System.out.print ("Enter symbols: ");
        do {
            counter ++;
            choice = (char) System.in.read();
            if (choice < 'A' | choice > 'Z') {
                choice -= val;
                System.out.print(choice);
            }  
            if (choice < 'a' | choice > 'z') {
                choice += val;
                System.out.print (choice);
            } 
        }
        while (choice != end);
        System.out.print ("");
        System.out.println("\n" + "За время "
           + " работы программы вы ввели " + counter/2 + " символов");
 }
}
    

