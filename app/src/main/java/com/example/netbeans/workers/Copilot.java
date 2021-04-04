package com.example.netbeans.workers;

import com.example.netbeans.flight.Flight;
import com.example.netbeans.visualfront.ConsoleColors;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Copilot extends Employee
{
    boolean master;
    public static Copilot [] copilotList = new Copilot []{new Copilot ("Cheewakka", "Cheewee", "41254741-L",true)};
    
    public Copilot(String name, String surname, String dni, boolean master) 
    {
        super(name, surname, dni);
        this.master=master;
    }
    
    public static void asignCopilot()
    {
        if (Flight.employeeList[1][Flight.MAX_COPILOT-1]==null)
        {
            Flight.employeeList[1][0]= copilotList[0];
        }
        else
        {
            System.out.println(ConsoleColors.RED+"El numero de copilotos ya es el máximo");
        }
    }

    @Override
    public String toString() {
        return "Copilot{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public void showInfo()
    {
        System.out.println("- Informacion de copiloto -");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.surname);
        System.out.println("Dni: " + this.dni);
        if (master)
        {
            System.out.println("Master: Sí");
        }
        else
        {
            System.out.println("Master: No");
        }
    }
}
