package com.example.netbeans.workers;

import com.example.netbeans.flight.Flight;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Employee 
{
    String name;
    String surname;
    String dni;

    public static ArrayList<Employee> assistantList = new ArrayList(Arrays.asList(new Employee("Ander", "Skyward", "4785487-H"),
                                                        new Employee("Kyu", "Fen", "358456-I"),
                                                            new Employee("Unamed", "Unsurnamed", "478546-K")));
    public static int employeeCount;

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
