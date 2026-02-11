

package bus_management_system_v.pkg1.pkg0;


public class Destination {
    String destination;
    int price;
    
    void set_destination(String a , int b)
    {
        destination=a;
        price =b;
    }
    void show_destination()
    {
        System.out.println("Destination = "+destination);
        System.out.println("Price = "+price);
        
    }
    
    
    
}
