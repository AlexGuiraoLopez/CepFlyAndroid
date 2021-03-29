package com.example.netbeans.input;
/**
 * Validador. 
 * Recibe valores (dados normalmente por el usuario) y devuelve si son válidos o no según las 
 * necesidades del programa que estemos utilizando.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Checker
{
    /**
     * Comprueba si un caracter es igual a alguno de otros dos. Y muestra un mensaje en caso de error.
     * Esta función es util para comprobar respuestas de usuario de SI o NO. Poniendo como valores de referencia
     * S y N por ejemplo.
     * @param _valueToCheck    Valor a comprobar
     * @param _targetValue1 Primer character a comparar
     * @param _targetValue2 Segundo character a comparar
     * @param _errorMessage Mensaje de error para el usuario.
     * @return TRUE si se encuentra entre el rango.
     */
    public static boolean checkChar(char _valueToCheck, char _targetValue1, char _targetValue2, String _errorMessage)
    {
        if (_valueToCheck!=_targetValue1 && _valueToCheck!=_targetValue2)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println( "\033[0;30m");  //Cambia el color del texto a negro.
        }
        
        return (_valueToCheck==_targetValue1 || _valueToCheck==_targetValue2);
    }
    
    /**
     * Comprueba si un valor se encuentra entre un rango predefinido. Y muestra un mensaje en caso de error.
     * @param _valueToCheck    Valor a comprobar
     * @param _maxValue Valor máximo que no puede sobrepasar.
     * @param _minValue Valor mínimo que no puede infrapasar.
     * @param _errorMessage Mensaje de error para el usuario.
     * @return TRUE si se encuentra entre el rango.
     */
    public static boolean checkRange(float _valueToCheck,  float _minValue, float _maxValue, String _errorMessage)
    {
        if (_valueToCheck < _minValue || _valueToCheck > _maxValue)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return (_valueToCheck >= _minValue && _valueToCheck <= _maxValue);
    }
    
      /**
     * Comprueba si un valor se encuentra entre un rango predefinido. Y muestra un mensaje en caso de error.
     * @param _valueToCheck    Valor a comprobar
     * @param _maxValue Valor máximo que no puede sobrepasar.
     * @param _minValue Valor mínimo que no puede infrapasar.
     * @param _errorMessage Mensaje de error para el usuario.
     * @return TRUE si el valor se encuentra entre el rango.
     */
    public static boolean checkRange(int _valueToCheck,  int _minValue, int _maxValue, String _errorMessage)
    {
        if (_valueToCheck < _minValue || _valueToCheck > _maxValue)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return (_valueToCheck >= _minValue && _valueToCheck <= _maxValue);
    }
    
    /**
     * Comprueba si un valor introducido es positivo y mayor o igual a 0. Y muestra un mensaje en caso de error.
     * @param _valueToCheck valor a revisar.
     * @param _errorMessage mensaje de error.
     * @return TRUE si el valor es positivo.
     */
    public static boolean checkPositive(int _valueToCheck, String _errorMessage)
    {
        if (_valueToCheck <0)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return _valueToCheck >=0;
    }
    
        /**
     * Comprueba si un valor introducido es positivo y mayor o igual a 0. Y muestra un mensaje en caso de error.
     * @param _valueToCheck valor a revisar.
     * @param _errorMessage mensaje de error.
     * @return TRUE si el valor es positivo.
     */
    public static boolean checkPositive(float _valueToCheck, String _errorMessage)
    {
        if (_valueToCheck <0)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return _valueToCheck >=0;
    }
    
    /**
     * Comprueba si un valor introducido es mayor a otro. Y muestra un mensaje en caso de error.
     * @param _valueToCheck valor a revisar.
     * @param _minValue valor del cual no puede ser inferior.
     * @param _errorMessage mensaje de error.
     * @return TRUE si el valor es mayor al otro.
     */
    public static boolean checkHigherThan(int _valueToCheck, int _minValue, String _errorMessage)
    {
        if (_valueToCheck < _minValue)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return _valueToCheck >= _minValue;
    }
    
    /**
     * Comprueba si un valor introducido es mayor a otro. Y muestra un mensaje en caso de error.
     * @param _valueToCheck valor a revisar.
     * @param _minValue valor del cual no puede ser inferior.
     * @param _errorMessage mensaje de error.
     * @return TRUE si el valor es mayor al otro.
     */
    public static boolean checkHigherThan(float _valueToCheck, float _minValue, String _errorMessage)
    {
        if (_valueToCheck <= _minValue)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return _valueToCheck > _minValue;
    }
    
     /**
     * Comprueba si un valor introducido es menor a otro. Y muestra un mensaje en caso de error..
     * @param _valueToCheck valor a revisar.
     * @param _minValue valor del cual no puede ser inferior.
     * @param _errorMessage mensaje de error.
     * @return TRUE si el valor es menor que el otro.
     */
    public static boolean checkLowerThan(int _valueToCheck, int _minValue, String _errorMessage)
    {
        if (_valueToCheck > _minValue)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return _valueToCheck < _minValue;
    }
    
    /**
     * Comprueba si un valor introducido es menor a otro. Y muestra un mensaje en caso de error.
     * @param _valueToCheck valor a revisar.
     * @param _minValue valor del cual no puede ser inferior.
     * @param _errorMessage mensaje de error.
     * @return TRUE si el valor es menor que el otro.
     */
    public static boolean checkLowerThan(float _valueToCheck, float _minValue, String _errorMessage)
    {
        if (_valueToCheck > _minValue)
        {
            System.out.println("\033[0;31m"+_errorMessage); //Cambia el color del texto a rojo.
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        
        return _valueToCheck < _minValue;
    }
    
    /**
     * Comprueba si un texto esta en blanco
     * @param _stringToCheck texto a comprobar
     * @param _errorMessage mensaje de error
     * @return TRUE si está en blanco.
     */
    public static boolean checkBlankField(String _stringToCheck, String _errorMessage)
    {
        if (_stringToCheck.equals(""))
        {
            System.out.print("\033[0;31m"+_errorMessage);
            System.out.println("\033[0;30m"); //Cambia el color del texto a negro.
        }
        return _stringToCheck.equals("");
    }
}
