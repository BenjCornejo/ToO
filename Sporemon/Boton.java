import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int tipo;
    private int opcion;
    public Boton(int opcion)
    {
        
        this.tipo=opcion;
        this.opcion=9;
        cambio();
    }
    public void act()
    {
        if(tipo==0)
        {       
        }
        else
        if(tipo==1)
        {
            if(isTouching(Boton.class))
        {
             Actor x8 = getOneIntersectingObject(Boton.class);
             this.opcion = ((Boton)x8).GetTipo();
          System.out.println(this.opcion);
        }
        if(Greenfoot.mouseMoved(null))
        { 
           cambiaPosicion();
        }
        else
        if(Greenfoot.mousePressed(this))
        {
            //Greenfoot.setWorld(new Mundo_1());
           //  System.out.println("x");
           opciones();
        }
    }
    
    }
     private void cambio()//ASIGNA IMAGEN
    {
        if(tipo==0)
        {
            setImage("cuadro.jpg");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 100,250);
        }
        else
        if(tipo==1)//MOUSE
        {
           getImage().clear();
           setImage("cursor.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 50,50);
        }
        else
                if(tipo==2)
        {
            setImage("c.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
            
        setLocation(400,150);  
        }
        else
        if(tipo==3)
        {
          setImage("c.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
        }
        else
        if(tipo==4)
        {
          setImage("c.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
        }
        if(tipo==5)
        {
          setImage("c.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250); 
        }
        if(tipo==6)
        {
          setImage("c.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
        }
        if(tipo==7)
        {
          setImage("c.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
        }
        if(tipo==10)
        {
          setImage("fe.gif");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
        }
        if(tipo==11)
        {
          setImage("game.gif");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 300,250);
        }
    }
        private void cambiaPosicion(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int x = mouse.getX();
        int y = mouse.getY();
        setLocation(x,y);       
    }
    public void opciones()
    {
        
        if(isTouching(Boton.class))
        {
             Actor x8 = getOneIntersectingObject(Boton.class);
            this.opcion = ((Boton)x8).GetTipo();
         // System.out.println(this.opcion);
        }
        
        if(this.opcion==4)
        {
            Greenfoot.stop();
             //Inicio w = (Inicio)getWorld();
           // w.backgroundMusic.stop();
        }
        
        if(this.opcion==2)
        {
        Greenfoot.setWorld(new Mundo1(1,40)); 
        // Greenfoot.setWorld(new Inicio(3)); 
        }

        if(this.opcion==3)
        {
        Greenfoot.setWorld(new decision()); 
        // Greenfoot.setWorld(new Inicio(3)); /****///////
        }
        if(this.opcion==5)
        {
        Greenfoot.setWorld(new Mundo1(1,25)); 
        }
         if(this.opcion==6)
        {
        Greenfoot.setWorld(new Mundo1(1,45)); 
        }
         if(this.opcion==7)
        {
        Greenfoot.setWorld(new Mundo1(1,60)); 
        }
    }
     public int GetTipo()
        {
            return this.tipo;
        }
}
