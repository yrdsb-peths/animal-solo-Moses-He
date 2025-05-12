import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    
    int level = 1 ;
    
    public MyWorld() 
    {
        super(600, 400, 1, false);
        
        
        
        Bee bee = new Bee();
        addObject(bee, 300, 200);
        scoreLabel = new Label(0,50);
        addObject(scoreLabel , 30,20);
        
        creatApple();
    }
    
    public void scoreincrease()
    {
        score++;
        scoreLabel.setValue(score);
    
        if(score % 1 == 0)
        {
            level += 1 ;
        }
    }
    /*
     * ENd the game when apple reaches bottom
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        GreenfootSound memeSound = new GreenfootSound("fart.mp3");
        memeSound.play();
    }
    /*
     * score++
     */
    /*
     * create a new apple with random location
     */
    
    public void creatApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
