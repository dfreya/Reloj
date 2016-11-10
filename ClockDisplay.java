
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }

    /**
    
     */
    public void fijarHora(int nuevaHora, int nuevoMinuto)
    {
        // put your code here
        horas.setValue(nuevaHora);
        minutos.setValue(nuevoMinuto);
    }
    /**
    
     */
    public void avanzarMinuto()
    {
        // put your code here
        minutos.increment();
        if (minutos.getValue() == 0){
            horas.increment();
        }
    }
    /**
    
     */
    public String darHora()
    {
        // put your code here
       return horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
}
