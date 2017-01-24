import java.util.Scanner;
public class ExoM {
    
    public static void e34(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une phrase");
        String entree = sc.nextLine();
        boolean prevcr;
        
        prevcr = true;
        
        for (int i = 0; i < entree.length(); i++){            
            if ((entree.charAt(i) >= 'a' && entree.charAt(i) <= 'z') || (entree.charAt(i) >= 'A' && entree.charAt(i) <= 'Z')){
              System.out.print(entree.charAt(i));
              prevcr = false;
        }
            else {
            	if (prevcr == false){
            		System.out.println();
            		prevcr = true;
            	}
            }
        }
        
    }
    
    public static void main(String[] args) {
        e34();
    }

}
