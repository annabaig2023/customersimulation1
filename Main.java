import csc232.Customer;
import csc232.WaitingLine;

public class Main {
  public static void main(String[] args) {
    System.out.println("Creating Customers:");
    Customer customer0 = new Customer("Susan" , 10);
    Customer customer1 = new Customer("Ray" , 12);
    Customer customer2 = new Customer("Lily" , 18);
    Customer customer3 = new Customer("Anna" , 4);
    System.out.println(customer0);
    System.out.println(customer1);
    System.out.println(customer2);
    System.out.println(customer3);

    System.out.println("Serving Customers: ");

    WaitingLine waitingline = new WaitingLine();
    waitingline.push(customer0);
    waitingline.push(customer1);
    waitingline.push(customer2);
    waitingline.push(customer3);

    while (! waitingline.isEmpty()){
      Customer customer = waitingline.pop();
    System.out.println(customer);
    }
    
  }
}