import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean fastFlag = false;
    private Component component;
    private GameState st;
    private GameState og;
    private GameState pg;
    private GameState go;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(Information.class,StartScreen.class);
        addObject(new Thanos(),280,370);
        addObject(new StartScreen(),400,300);
         st = og;
    }
     public void act()
    {
      
        
          chanceBackground();
       
    
    }
    
    public void chanceBackground()
    {
      
    }
     public GameState getState()
    {
        return st;
    }
     public void setState(GameState state)
    {
        this.st=state;
    }
     public GameState getOngoingState()
    {
        return this.og;
    }
    
    public GameState getPauseState()
    {
        return this.pg;
    }
    
    public GameState getGameOverState()
    {
        return this.go;
    }
    
}
