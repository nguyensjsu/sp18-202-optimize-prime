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
     private int counter = 0;
    public void act() 
    {
        // Add your action code here.
        keymove();
        createBomb();

        Actor coin = getOneObjectAtOffset(0, 0, Coin.class);
        if(coin != null)
        {
            ((MyWorld)getWorld()).removeObject(coin);
        }
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

 public void createBomb()
    {
      
       AmmoFactory ammoFactory= new AmmoFactory();       
          if(counter == 0)
          {
             if (Greenfoot.isKeyDown("x"))
             {
                Ammunation bullet = ammoFactory.getAmmunition("Bullet");
                getWorld().addObject(bullet,getX(),getY()-80);
                counter = 50;
             }
              if (Greenfoot.isKeyDown("space"))
             {
                Ammunation bullet = ammoFactory.getAmmunition("Laser");
                getWorld().addObject(bullet,getWorld().getWidth()/2,getY()-80);
                counter = 50;
             }
             
             
          }
          else
          {
             counter--;  
          }
       
   }
}
