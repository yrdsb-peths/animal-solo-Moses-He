import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * Bee, the hero of our game
 * @author Moses He
 * @version (2025/05/07)
 */
public class Bee extends Actor
{
    GreenfootSound fartSound = new GreenfootSound("meme.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    
    String facing = "right" ;
    public  Bee()
    {
        for(int i = 0; i< idleRight.length ; i++)
        {
            idleRight[i] = new GreenfootImage("images/beeFrame/bee" + i + ".png");
        }
        
        
         for(int i = 0; i< idleLeft.length ; i++)
        {
            idleLeft[i] = new GreenfootImage("images/beeFrame/bee" + i + ".png");
            idleLeft[i].mirrorHorizontally();
        }
        setImage(idleRight[0]);
    }
    int imageIndex = 0;
    public void animateBee()
    {
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1 )%  idleRight.length ;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1 )%  idleLeft.length ;
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            facing = "right" ;
        }
    
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            facing = "left" ;
        }
        eat();
        animateBee();
    }
    public void eat()
    {
         if(isTouching(Apple.class))
         {
              removeTouching(Apple.class);
              MyWorld world = (MyWorld) getWorld();
              world.creatApple();
              world.scoreincrease();
              fartSound.play();
         }
    }
}
