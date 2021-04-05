package com.example.netbeans.workers;

import com.example.netbeans.flight.Flight;
import java.util.ArrayList;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Employee 
{
    String name;
    String surname;
    String dni;

    //public static Employee [] assistantList= new Employee[]{new Employee("Ander", "Skyward", "4785487-H"), new Employee("Kyu", "Fen", "358456-I"),new Employee("Unamed", "Unsurnamed", "478546-K")};
    public static ArrayList<Employee> assistantList = new ArrayList();

    public static Employee ander = new Employee("Ander", "Skyward", "4785487-H");
    public static Employee kyu =  new Employee("Kyu", "Fen", "358456-I");
    public static Employee unnamed = new Employee("Unamed", "Unsurnamed", "478546-K");

    public Employee(String name, String surname, String dni)
    {
        this.name=name;
        this.surname=surname;
        this.dni=dni;
    }

    
    public void showInfo()
    {
        System.out.println("- Información del asistente -");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.surname);
        System.out.println("Dni: " + this.dni);
    }
}
