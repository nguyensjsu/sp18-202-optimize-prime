import greenfoot.*;  
import java.util.*;

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blocker extends Component
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private Actor collided;
    private boolean collision;
    private Actor collidedVehicle;
    private boolean moveFasterFlag = false;
    
    public Blocker()
    {
       
       image1 = new GreenfootImage("ironman.png");
       image2 = new GreenfootImage("panther.png");
       image3 = new GreenfootImage("rabbit.png");
       image4 = new GreenfootImage("vision.png");
       
       image1.scale(90,90);  
       image2.scale(90,90);  
       image3.scale(90,90);
       image4.scale(90,90);
       randomImage();
     //  setRotation(90);
    }
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //this.removeTouching(SpeedBooster.class);
        this.removeTouching(Blocker.class);
        if(moveFasterFlag)
            moveFaster();
        else
            moveDown();
        check();
    }
    public void moveDown()
    {
    //    if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
      // {
         
             setLocation(getX(), getY()+4);
 
       //}
    }
    
     public void moveFaster()
    {
       if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
       {
          setLocation(getX(), getY()+8);
       }
    }
    
    public void randomImage()
    {
       if (Greenfoot.getRandomNumber(5) > 3 && Greenfoot.getRandomNumber(5) <= 4)
       {
          setImage(image1);
       }
       
       else if(Greenfoot.getRandomNumber(5) > 2 && Greenfoot.getRandomNumber(5) <= 3) 
       {
           setImage(image2);
       }
       else if(Greenfoot.getRandomNumber(5) > 1 && Greenfoot.getRandomNumber(5) <= 2) 
       {
           setImage(image3);           
       }
       else
       {
          setImage(image4);
       }
   }
    public void check()
    {
        
    // collided = getOneIntersectingObject(Vehicle.class);
        if (collided != null || getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
          
        }
        
    }
    
    public void setFasterFlag(){
        moveFasterFlag = true;
    }
    
    public void addChild(Component c) {}
    public void removeChild(Component c) {}
    public Component getChild(int i) {
        return null;
    }
    public List<Component> getAllChild(){
        return null;
    }
    public void unsetFasterFlag() {
        moveFasterFlag = false;
    }
    public void addCoinScore() {}
}
