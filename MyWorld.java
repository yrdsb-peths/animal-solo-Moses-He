import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() 
    {
        super(600, 400, 1, false);
        
        
        
        Bee bee = new Bee();
        addObject(bee, 300, 200);
        scoreLabel = new Label(0,50);
        addObject(scoreLabel , 30,20);
        
        creatApple();
    }
    
    /*
     * ENd the game when apple reaches bottom
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        GreenfootSound memeSound = new GreenfootSound("meme.mp3");
        memeSound.play();
    }
    /*
     * score++
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /*
     * create a new apple with random location
     */
    public void creatApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
