import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Ammunation
{
   private GreenfootImage image1;
    private GreenfootImage image2;
    private Actor collidedVehicle;
  
    
    public Laser()
    {
        GreenfootImage image=getImage();
        image.scale(500,10);
     
    }
   
    public void act() 
    {
       moveUp();
       check();
    }    
    public void moveUp()
    {
     
          setLocation(getX(), getY()-4);
       
    }
    public void check()
    {
      
       if( getY() == 0)
       {
        
          if(collidedVehicle != null)
          {
             
             getWorld().removeObject(collidedVehicle);
          }
         
          if(this.getY()==0)
            getWorld().removeObject(this);
       }
    }    
}