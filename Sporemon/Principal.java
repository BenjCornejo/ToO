import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal extends Jugador
{
       private Message msg;
    /**
     * Act - do whatever the Principal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Principal()
    {
        super();
                setImage("Player1.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 40,40);
           
    }
            public Principal(int vida){
        super();
                setImage("Player1.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 40,40);
    }
    
    public void act()
    {
         if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-10, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()+10, this.getY());
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY()+10);
        }
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this
            .getY()-10);
        }
        Greenfoot.setSpeed(40);
       // getWorld().removeObjects(getIntersectingObjects(Enemigo.class));
     contacto();
    }
     public void dañoE(int x)
     {if(canSee(Enemigo.class))
        {
            int v=this.getVida()-x;
            this.setVida(v);
            System.out.println(this.getVida());
            checavida();
        }
        }
        private int contv=3;
            public void contacto()
    {
         if(this.isTouching(Enemigo.class)){
        Enemigo x8 = (Enemigo)getOneIntersectingObject(Enemigo.class);
      int  x =x8.getX();
      int y=x8.getY();
      int ataue=x8.getAtaque();
      dañoE(ataue);
      if(this.isTouching(Deleter.class)){
        this.setLocation(300,300);
        contv--;
        if (contv==0)
        {Greenfoot.stop();
        }
     }
    }
      
    }
    
        public void  checavida()
    {
        System.out.println(this.getVida());
        if(this.getVida()<=0)
        {
            /*GreenfootImage gfi = this.getImage();
            gfi.scale( 40,40);
            getWorld().showText("He Muerto", getX(),getY()+45);
            setImage("tumba.png");*/
            //Greenfoot.stop();
            
        }
    }
}
