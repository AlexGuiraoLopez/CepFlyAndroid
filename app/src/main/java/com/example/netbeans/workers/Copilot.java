package com.example.netbeans.workers;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Copilot extends Employee
{
    boolean master;
    public static int copilotCount;
    //public static Copilot [] copilotList = new Copilot []{new Copilot ("Cheewakka", "Cheewee", "41254741-L",true)};
    public static ArrayList copilotList = new ArrayList();

    public Copilot(String name, String surname, String dni, boolean master)
    {
        super(name, surname, dni);
        this.master=master;
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
