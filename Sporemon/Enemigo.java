import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Jugador
{
       private Message msg;
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public Enemigo()
    {
       
        super();
         this.setVida(500);
               setImage("enemy1.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 40,40);
            checavida();
             
    }
                public Enemigo(int vida){
        super();
               setImage("enemy1.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 40,40);
            checavida();
    }
    public void act()
    {
                     // getWorld().showText(null, getX(), getY()+45);
     //   msg.setpos(getX(),getY());
      //  msg.settext(toString());
       //      System.out.println("sdcsdcs");
        //ini();
        
        if(mov==true)
        {Random rand =new Random();
        this.setLocation(this.getX()+rand.nextInt(15), this.getY()+rand.nextInt(15));
        this.setLocation(this.getX()-rand.nextInt(15), this.getY()-rand.nextInt(15));
        contacto();
        checavida();}
    }
       public void dañoE(int x)
     {if(canSee(Principal.class))
        {
            int v=this.getVida()-x;
            this.setVida(v);
            checavida();
        }
        }
            public void contacto()
    {
         if(this.isTouching(Principal.class)){
        Principal x8 = (Principal)getOneIntersectingObject(Principal.class);
      int  x =x8.getX();
      int y=x8.getY();
      int ataue=x8.getAtaque();
      dañoE(ataue);
    }
      
    }
    private boolean opcion= true;
    private boolean mov=true;
        public void  checavida()
    {
        System.out.println(this.getVida());
        if(this.getVida()<=0)
        {
            setImage("tumba.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 40,40);
            mov=false;
            if (opcion==true)
            {
            Tumba t = new Tumba();
            opcion=false;
            getWorld().addObject(t, getX(),getY());}
        }
        
    }
    
}
