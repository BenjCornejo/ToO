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
        super (9);
          addObject(new Boton(10), 400, 150);
        showText("Felicidades, has genado", 400, 300);
        
    }
    public Fin(int f)
    {
    
    }
}
