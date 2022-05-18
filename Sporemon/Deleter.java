import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Deleter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deleter extends Jugador
{
    /**
     * Act - do whatever the Deleter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       Random rand =new Random();
        this.setLocation(this.getX()+rand.nextInt(35), this.getY()+rand.nextInt(35));
        this.setLocation(this.getX()-rand.nextInt(35), this.getY()-rand.nextInt(35));
        contacto();
    }
     public Deleter()
        {super();
       
        
               setImage("BOSS.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 70,70);
            checavida();}
}
