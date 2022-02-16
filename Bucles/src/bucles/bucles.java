
package bucles;


public class bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=0;
        int i;
        
        System.out.println("BUCLE FOR: \n");
        
        for(i=0;i<11;i++)
        {
            System.out.println("| " + n1*8 + " |");
            n1++;
        }
        
        System.out.println("\nBUCLE DO WHILE: \n");
   
        i=0;
        n1=0;
        
        do
        {
            System.out.println("| " + n1*8 + " |");
            n1++;
            i++;
        }
        while (i<11);
        
        System.out.println("\nBUCLE WHILE:\n");
        
        n1=0;
        i=0;
        
        while (i<11)
        {
           System.out.println("| " + n1*8 + " |");
            n1++;
            i++;
        }
    }
    
}
