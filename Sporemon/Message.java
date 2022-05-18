import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { //Greenfoot.setSpeed(40);
        // Add your action code here.

               
               }
 
    public Message(String text)
{
    GreenfootImage gi= new greenfoot.GreenfootImage(text,20, Color.BLACK, Color.WHITE);

    setImage(gi);
}
public void setpos(int x,int y)
{
      this.setLocation(x, y); 
}
public void settext(String text)
{
     GreenfootImage gi= new greenfoot.GreenfootImage(text,20, Color.BLACK, Color.WHITE);
     setImage(gi);
}

}
