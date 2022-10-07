import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int speed=7;
        heroMovement(speed);
    }
    public void heroMovement(int speed){
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
        }
        if(Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
        }
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
        }
        if(Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
        }
    }
}
