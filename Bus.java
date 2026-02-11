/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus_management_system_v.pkg1.pkg0;

/**
 *
 * @author CYB3R_W0LF
 */
public class Bus {

    String bus_no, driverName, conductorName,driverNumber,conductorNumber;

void set_val_busInfo(String a,String b,String c,String d,String e)
{
    bus_no=a;
    driverName=b;
    conductorName=c;
    driverNumber=d;
    conductorNumber=e;
}
void show_bus_info()
{
    System.out.println("Bus No = "+bus_no);
    
    System.out.println("Driver Name = "+driverName);
    System.out.println("Conductor Name = "+conductorName);
    System.out.println("Driver Number = "+driverNumber);
    System.out.println("Conductor Number = "+conductorNumber);
    
     
}
        
}
