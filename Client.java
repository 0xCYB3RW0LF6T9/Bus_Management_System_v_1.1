/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus_management_system_v.pkg1.pkg0;

/**
 *
 * @author CYB3R_W0LF
 */
public class Client extends Destination {
    
    String name,email,phone;
    
    void set_val_client(String a,String b,String c)
    {
        name=a;
        email=b;
        phone=c;
        
    }
    
    void show_client()
    {
        System.out.println("Name = "+name);
        System.out.println("Email = "+email);
        System.out.println("Phone = "+phone);
    }
            
    
    
    
}
