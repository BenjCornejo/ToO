import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends Mundo
{
    public Mundo1()
    {
        
    }
    public Mundo1(int a)
    {
    super (a);
        setnumEnemy(5);
        Enemigo p2 = new Enemigo();
        p2.setVida(50);
        p2.setAtaque(50);
        addObject(p2, 20,20);
        Enemigo p3 = new Enemigo();
        p3.setVida(50);
        p3.setAtaque(50);
        addObject(p3, 200,20);
        Enemigo p4 = new Enemigo();
        p4.setVida(50);
        p4.setAtaque(50);
        addObject(p4, 400,20);
        Enemigo p5 = new Enemigo();
        p5.setVida(50);
        p5.setAtaque(50);
        addObject(p5, 20,400);
        Enemigo p6 = new Enemigo();
        p6.setVida(50);
        p6.setAtaque(50);
        addObject(p6, 400,200);
        Principal p1 = new Principal();
        p1.setVida(200);
        p1.setAtaque(50);
        Greenfoot.delay(1);
        addObject(p1, 300  ,300 );
        Deleter del= new Deleter();
        addObject(del, 330,0);
    }
    public void act()
    {
        int count1 = getObjects(Tumba.class).size();
         System.out.println(count1+"contador");
        if (count1==5)
        {Greenfoot.setWorld(new Mundo2(2)); 
        }
    }
}
