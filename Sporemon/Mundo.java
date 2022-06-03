import lang.stride.*;
import java.util.*;
import greenfoot.*;
import greenfoot.core.*;
import javax.swing.*;
import java.awt.*;
/**
 * 
 */
public class Mundo extends World
{
    private GreenfootSound backgroundMusic;
    private  GreenfootImage background;
    /**
     * Constructor for objects of class MyWorld.
     */

    public Mundo()
    {
        super(900, 650, 1);
        backgroundMusic = new GreenfootSound("Intro1.mp3");
        backgroundMusic.playLoop();

        backgroundMusic.pause();
        //backgroundMusic.
    }
    private int numEnemy;
    public Mundo(int nivel)
    {
        super(900, 650, 1);
 
        switch(nivel)
        {
        case 0:
        backgroundMusic = new GreenfootSound("Intro1.mp3");
        backgroundMusic.playLoop();
      //  backgroundMusic.pause();
        background = new GreenfootImage("background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);

        
        addObject(new Boton(2), 400, 150);
        showText("!Jugar!", 400, 150);
        addObject(new Boton(3),400, 350);
        showText("!Dificultad!", 400, 350);
        addObject(new Boton(4),400, 500);
        showText("Salir", 400, 500);
        addObject(new Boton(1),150, 300);     //MOUSE   
       break;
       case 1:
           background = new GreenfootImage("Fondo1.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        }
    }
    public void posiciona()
    {
    }
    public void setnumEnemy(int numero)
    {
        this.numEnemy = numero;
    }
    public int getnumEnemy()
    { return this.numEnemy;
    }
    public void act()
    {
        int count1 = getObjects(Enemigo.class).size();
        System.out.println(count1);
    }
    public void velocidad(int vl)
    {
        this.vel=vl;
    }
    public int dameVelocidad()
    {
        return this.vel;
    }
    private int vel;
}
