import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Laser(int speed){
        this.speed = speed;
    }
    int speed;
    public void act()
    {
        laserMovement(speed);
    }
    public void laserMovement(int speed){
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        move(speed);
    }

}
