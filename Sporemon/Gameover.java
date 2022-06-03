import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Mundo
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {super (10);
          addObject(new Boton(11), 400, 150);
        showText("GAME OVER", 400, 300);
        Greenfoot.stop();
    }
}
