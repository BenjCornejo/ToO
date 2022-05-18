import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo2 extends Mundo
{

    /**
     * Constructor for objects of class Mundo2.
     * 
     */
    public Mundo2()
    {
    }
    public Mundo2(int b)
    {
    super (b);
     setnumEnemy(5);
        Enemigo p2 = new Enemigo();
        p2.setVida(100);
        p2.setAtaque(50);
        addObject(p2, 20,20);
        Enemigo p3 = new Enemigo();
        p3.setVida(100);
        p3.setAtaque(50);
        addObject(p3, 200,20);
        Enemigo p4 = new Enemigo();
        p4.setVida(100);
        p4.setAtaque(50);
        addObject(p4, 400,20);
        Enemigo p5 = new Enemigo();
        p5.setVida(100);
        p5.setAtaque(50);
        addObject(p5, 20,400);
        Enemigo p6 = new Enemigo();
        p6.setVida(100);
        p6.setAtaque(50);
        addObject(p6, 400,200);
        Principal p1 = new Principal();
        p1.setVida(200);
        p1.setAtaque(50);
        Greenfoot.delay(1);
        addObject(p1, 300  ,300 );
         Enemigo p7 = new Enemigo();
        p7.setVida(100);
        p7.setAtaque(50);
        addObject(p7, 500,200);
         Enemigo p8 = new Enemigo();
        p8.setVida(100);
        p8.setAtaque(50);
        addObject(p8, 800,600);
        Deleter del= new Deleter();
        addObject(del, 330,0);
        Deleter del2= new Deleter();
        addObject(del2, 400,400);
    }
    public void act()
    {
        int count1 = getObjects(Tumba.class).size();
         System.out.println(count1+"contador");
        if (count1==7)
        {Greenfoot.setWorld(new Mundo3(3)); 
        }    }
}
