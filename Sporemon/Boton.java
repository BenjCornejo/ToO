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
        cambio();
    }
    public void act()
    {
        // Add your action code here.
        if(tipo==0)
        {
            
        }
        else
        if(tipo==1)
        {
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
     private void cambio()
    {
        if(tipo==0)
        {
            setImage("cuadro.jpg");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 100,350);
            this.setRotation(90);
        }
        else
        if(tipo==1)
        {
           getImage().clear();
        }
        else
                if(tipo==2)
        {
            setImage("cuadro.jpg");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 100,350);
            this.setRotation(90);
        }
        else
        if(tipo==3)
        {
          /*  setImage("inicio.png");*/
        }
        else
        if(tipo==4)
        {
         /*   setImage("cuadro.png");
            GreenfootImage gfi = this.getImage();
            gfi.scale( 120,650);
            this.setRotation(90);  */
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
          System.out.println(this.opcion);
        }
        
        if(opcion==2)
        {
            Greenfoot.stop();
             Inicio w = (Inicio)getWorld();
           // w.backgroundMusic.stop();
        }
        else
        if(opcion==0)
        {
        Greenfoot.setWorld(new Mundo1(1)); 
        // Greenfoot.setWorld(new Inicio(3)); /****///////
        }
       
    }
     public int GetTipo()
        {
            return this.tipo;
        }
}
