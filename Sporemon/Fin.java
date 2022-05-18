import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fin extends Mundo
{

    /**
     * Constructor for objects of class Fin.
     * 
     */
    public Fin()
    {
    }
    public Fin(int f)
    {
    super (f);
    
        showText("Felicidades, has genado", getWidth()/2, getHeight()/2);
        
        showText("Tu puntuacion es", getWidth()/2, getHeight()/3);
    }
}
