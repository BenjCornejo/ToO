import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class decision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class decision extends Mundo
{

    /**
     * Constructor for objects of class decision.
     * 
     */
    public decision()
    {
        addObject(new Boton(5), 400, 150);
        showText("FACIL", 400, 150);
        addObject(new Boton(6),400, 350);
        showText("NORMAL", 400, 350);
        addObject(new Boton(7),400, 500);
        showText("DIFICIL", 400, 500);
        addObject(new Boton(1),150, 300); 
    }
    
}
