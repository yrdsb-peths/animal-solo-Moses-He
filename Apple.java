import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * Food which bee eats
 * @author (Moses He) 
 * @version (2025/05/07)
 */
public class Apple extends Actor
{
    int speed = 3 ;
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
      public void setSpeed(int spd)
    {
        speed = spd ;
    }
    
    public void act() 
    {
        setLocation(getX(),getY() + speed) ;
        MyWorld world = (MyWorld) getWorld();
        if(getY()>= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
}
