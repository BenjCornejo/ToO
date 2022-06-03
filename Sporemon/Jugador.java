import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.List;
/**
 * 
 */
public class Jugador extends Actor
{
    private Message msg;
    private int vida;
    private int ataque;
    public int pause = 1;
    private boolean op=true;
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    public void ini()
    {
    }
    public Jugador(){

      ini();
    }
        public Jugador(int vida){

                 this.vida=vida;

    }
    public String toString ()
    {
    String mensaje;
    if(this.vida>0)
    mensaje= ""+ this.vida +"";
    else
    mensaje= "";
        
    return mensaje;
    }
    public void setVida(int v)
    { this.vida=v;
    }
    public int getVida()
    {
        return vida;
    }
    public void setAtaque(int at)
    { this.ataque=at;
    }
    public int getAtaque()
    {
        return this.ataque;
    }
    public boolean canSee(Class cls)
    {
        Actor actor = getOneObjectAtOffset(0, 0, cls);
        return actor != null;
    }
    public void  checavida()
    {
    }
    
    public void contacto()
    {
    }
    
}
