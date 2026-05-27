//Write a program for BitWise Operator
//Those who are getting 250-Units PowerBill,they dont need to pay charge.
//For those who are above limit units then need to pay and with 1 Unit=1 cost...
import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        int bill;
        bill = units + (units >> 1);
        System.out.println("Electricity Bill = " + bill);
    }
}