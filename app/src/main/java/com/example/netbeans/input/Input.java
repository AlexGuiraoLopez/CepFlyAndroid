package com.example.netbeans.input;

// Imports
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Contiene distintos métodos para leer datos desde teclado en función del tipo de dato a leer. 
 * Esta versión no lanza excepciones explícitas.
 * Creación: 24/08/2020
 * @author José Luis García Mañas => Traducción: Alex Guirao López
 */
public class Input
{
    /**
     * Lee una cadena desde teclado y la retorna.
     * @return Cadena leída desde teclado.
     */
    public static String readString()
    {
        return new Scanner(System.in).nextLine();
    }

    /**
     * Lee un caracter desde teclado y lo retorna. Si se produce un error porque no se ha introducido un
     * caracter, muestra un mensaje de error y devuelve el carácter ASCII 0. 
     * @return El caracter leído des de teclado.
     */
    public static char readChar()
    {
        // Inicializamos el caracter vacío. Si se produce un error se devolverá este valor.
        char c = 0;

        //Si no se produce ningún error se devuelve el caracter leído.
        String s = readString();

        //Controlamos si lo que se ha leído es un carácter.
        if(s.length() == 1)
        {
            c = s.charAt(0);
        }
        else
        {
            System.err.println("El dato introducido no es un carácter.");
        }

        return c;
    }

    /**
     * Lee un número entero (short) des de teclado y lo retorna.
     * @return El número entero (Short) leído des de teclado.
     */
    public static short readShort()
    {
        return new Scanner(System.in).nextShort();
    }

    /**
     * Lee un número entero des de teclado y lo retorna.
     * @return El número entero leído des de teclado.
     */
    public static int readInt()
    {
        return new Scanner(System.in).nextInt();
    }

    /**
     * Lee un número entero (Long) des de teclado y lo retorna.
     * @return El número entero (Long) leído des de teclado.
     */
    public static long readLong()
    {
        return new Scanner(System.in).nextLong();
    }

    /**
     * Lee un número entero (BigInt) des de teclado y lo retorna.
     * @return El número entero (BigInt) leído des de teclado.
     */
    public static BigInteger readBigInt()
    {
        return new Scanner(System.in).nextBigInteger();
    }

    /**
     * Lee un número real (float) des de teclado y lo retorna. 
     * @return El número real (float) leído des de teclado.
     */
    public static float readFloat()
    {
        return new Scanner(System.in).nextFloat();
    }

    /**
     * Lee un número real (double) des de teclado y lo retorna. 
     * @return El número real (double) leído des de teclado.
     */
    public static double readDouble()
    {
        return new Scanner(System.in).nextDouble();
    }

    /**
     * Lee un número real (BigDecimal) des de teclado y lo retorna. 
     * @return El número real (BigDecimal) leído des de teclado.
     */
    public static BigDecimal readBigDecimal()
    {
        return new Scanner(System.in).nextBigDecimal();
    }

    /**
     * Lee un valor booleano des de teclado y lo retorna. 
     * @return El valor booleano leído des de teclado.
     */
    public static boolean readBoolean()
    {
        return new Scanner(System.in).nextBoolean();
    }
}
// =============================================================================