package com.example.netbeans.workers;

import com.example.netbeans.flight.Flight;
import com.example.netbeans.visualfront.ConsoleColors;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Pilot extends Employee
{
    String reference, telephone, birthDate;
    public static Pilot pilotList[]=new Pilot[]{new Pilot("Harrison","Ford","45854112-V","HLK-011","+34569954521","05/10/1974")};
    
    public Pilot(String name, String surname, String dni, String reference, String telephone, String birthDate) 
    {
        super(name, surname, dni);
        this.reference=reference;
        this.telephone=telephone;
        this.birthDate=birthDate;
    }
    
    public static void asignPilot()
    {
        if (Flight.employeeList[0][Flight.MAX_PILOT-1]==null)
        {
            Flight.employeeList[0][0]= Pilot.pilotList[0];
        }
        else
        {
            System.out.println(ConsoleColors.RED+"El numero de pilotos ya es el máximo");
        }
    }
    
    @Override
    public void showInfo()
    {
        System.out.println("- Información del piloto -");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.surname);
        System.out.println("Dni: " + this.dni);
        System.out.println("Referencia: " + this.reference);
        System.out.println("Telefono" + this.telephone);
        System.out.println("Cumpleaños: " + this.birthDate);
    }

    public String getReference() {
        return reference;
    }
}
