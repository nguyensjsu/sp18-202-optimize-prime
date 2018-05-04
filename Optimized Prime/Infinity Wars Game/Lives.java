import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int valueLives;
  
    public void act()
    {
       valueLives = ((MyWorld) getWorld()).getLives();
       decLives();
     //  addLives();
    }
    public void decLives()
    {
       if(getX() == 300)
       {
          if(valueLives == 5)
          {
             getWorld().removeObject(this);
          }
       }
       
       
       else if(getX() == 250)
       {
          if(valueLives == 4)
          {
             getWorld().removeObject(this);
          }
        }
        
       else if(getX() == 200)
       {
          if(valueLives == 3)
          {
             getWorld().removeObject(this);
          }
        }
        
        else if(getX() == 150)
       {
          if(valueLives == 2)
          {
             getWorld().removeObject(this);
          }
       }
       else if(getX() == 100)
       {
          if(valueLives == 1)
          {
             getWorld().removeObject(this);
          }
        //  else if(valueLives==3 && getX()!=150)
         // getWorld().addObject(new Lives(),150,50);
       }
       else if(getX() == 50)
       {
          if(valueLives == 0)
          {
              MyWorld world=(MyWorld) getWorld();
              Greenfoot.stop();
              //need to implement object that will display lives
             
              ((MyWorld) getWorld()).setState(((MyWorld) getWorld()).getGameOverState());
              getWorld().removeObject(this);
          }
          else if(valueLives==2)
            getWorld().addObject(new Lives(),100,50);
       }     
    } 
}
