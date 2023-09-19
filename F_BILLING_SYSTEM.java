import java.util.Scanner;
public class F_BILLING_SYSTEM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of items you want to eat :");
        int eat = input.nextInt();
        double final_total = 0;
        for(int i = 1; i <= eat ; i++){
            System.out.println("Enter item name :");
            String item = input.next();

            System.out.println("Enter quantity required for "+ item);
            int quantity = input.nextInt();

            System.out.println("Enter Price for one "+ item);
            double rate = input.nextInt();

            double total = rate * quantity;

            final_total = final_total+total;
            System.out.println("Item"+"\t"+"Quantity"+"\t"+"Rate"+"\t"+"Total");
            System.out.println(item + "\t"+quantity+"\t\t\t"+rate+"\t"+total);


        }
        System.out.println("Are you a member ? ");
        String member = input.next();
        if(member.equals("yes") || member.equals("Yes") ){
            double discount = final_total/10;
            double discounted_price = final_total - discount ;
            System.out.println("\t\t\t\t Discount  : "+ discount);
            System.out.println("\t\t\t\t Total price  : "+ discounted_price);
        }
        else{
            System.out.println("\t\t\t\t Total : "+final_total );
        }
    }
}
