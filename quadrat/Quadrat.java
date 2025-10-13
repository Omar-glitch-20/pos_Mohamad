import java.util.Scanner;

public class Quadrat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the square: ");
        int size = input.nextInt();
        
        for (int i = 0; i < size; i++) {          
            for (int j = 0; j < size; j++) {      
                System.out.print("# ");
            }
            System.out.println();                
        }
        
        
        input.close();
        
        
    }
} 