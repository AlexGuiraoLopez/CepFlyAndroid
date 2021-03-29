package com.example.netbeans.workers;

import com.example.netbeans.flight.Flight;
import com.example.netbeans.visualfront.ConsoleColors;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Employee 
{
    String name;
    String surname;
    String dni;
    public static Employee [] assistantList= new Employee[]{new Employee("Ander", "Skyward", "4785487-H"),
                                                                                                        new Employee("Kyu", "Fen", "358456-I"),
                                                                                                            new Employee("Unamed", "Unsurnamed", "478546-K")};
    
    public Employee(String name, String surname, String dni)
    {
        this.name=name;
        this.surname=surname;
        this.dni=dni;
    }
    
    public static void asignEmployee()
    {
        boolean asigned=false;
        int listIndex=0;
        
        if (Flight.employeeList[2][Flight.MAX_EMPLOYEE-1]==null)
        {
            do{
                if (Flight.employeeList[2][listIndex]==null)
                {
                    Flight.employeeList[2][listIndex]=Employee.assistantList[listIndex];
                    asigned = true;
                }
                listIndex++;
            }while(!asigned);
        } 
        else
        {
            System.out.println(ConsoleColors.RED+"El numero de asistentes ya es el máximo");
        }
    }
    
    public void showInfo()
    {
        System.out.println("- Información del asistente -");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.surname);
        System.out.println("Dni: " + this.dni);
    }
}
