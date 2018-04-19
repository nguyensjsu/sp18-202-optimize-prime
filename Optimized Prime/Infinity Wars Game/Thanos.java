import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thanos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thanos extends Actor
{
    /**
     * Act - do whatever the Thanos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        keymove();
    }    
    public void keymove()
    {
    
    if(Greenfoot.isKeyDown("left")){
            this.setLocation(getX()-8,getY());
      
        }
         else if(Greenfoot.isKeyDown("right")){
            this.setLocation(getX()+8,getY());
         
        }
         else if(Greenfoot.isKeyDown("up")){
        
            this.setLocation(getX(),getY()-8);
           
        }
        else if(Greenfoot.isKeyDown("down")){
           
            this.setLocation(getX(),getY()+8);
        
    }
}
}
