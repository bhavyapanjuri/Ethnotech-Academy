//Jagged Array  
import java.util.Scanner;
public class JaggedArray 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[5][];
        n[0] = new int[1];
        n[1] = new int[3];
		n[2] = new int[5];
		n[3] = new int[7];
		n[4] = new int[9];
        System.out.println("Enter elements for the jagged array:");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) 
                {
                n[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array:");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}   
