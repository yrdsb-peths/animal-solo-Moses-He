import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * Bee, the hero of our game
 * @author Moses He
 * @version (2025/05/07)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
        move(-5);
        }
    
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        eat();
    }
    public void eat()
    {
         if(isTouching(Apple.class))
         {
              removeTouching(Apple.class);
              MyWorld world = (MyWorld) getWorld();
              world.creatApple();
              world.increaseScore();
         }
    }
}
