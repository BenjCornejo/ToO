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
        super(800, 800, 1);
        backgroundMusic = new GreenfootSound("Intro1.mp3");
        backgroundMusic.playLoop();

        //backgroundMusic.pause();
        //backgroundMusic.
    }
    private int numEnemy;
    public Mundo(int nivel)
    {
        super(800, 800, 1);
 
        switch(nivel)
        {
        case 0:
        backgroundMusic = new GreenfootSound("Intro1.mp3");
        backgroundMusic.playLoop();
        backgroundMusic.pause();
        background = new GreenfootImage("background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        // backgroundMusic.
        addObject(new Boton(2),getWidth()/2, getHeight()/2);
        showText("!Jugar!", getWidth()/2, getHeight()/2);
        addObject(new Boton(0),getWidth()/2, getHeight()/2+150);
        showText("!Salir!", getWidth()/2, getHeight()/2+150);
         addObject(new Boton(1),getWidth()/2, getHeight()/2+75);
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
}
