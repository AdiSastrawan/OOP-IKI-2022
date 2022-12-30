import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=5;
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    public void robotMovement(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
        }
    }
     public void detectWallCollision(){
         if(isTouching(Wall.class)){
             Greenfoot.playSound("hurt.wav");
             setLocation(48,50);
         }
     }
     public void detectBlockCollision(){
         if(isTouching(Block.class)){
             Greenfoot.playSound("hurt.wav");
             setLocation(48,50);
         }
     }
     public void detectHome(){
         if(isTouching(Home.class)){
             Greenfoot.playSound("yipee.wav");
             setLocation(48,50);
         }
     }
     public void eatPizza(){
         if(isTouching(Pizza.class)){
             Pizza pizza = (Pizza)getOneIntersectingObject(Pizza.class);
             Greenfoot.playSound("eat.wav");
             getWorld().removeObject(pizza);
         }
     }
     
}
