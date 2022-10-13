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

    /*public Hero(){
        setPosY=getY();
        setPosX=getX();
    }*/
    public Hero(int setPosY, int setPosX){
        this.setPosY=setPosY;
        this.setPosX=setPosX;     
    }

    int attackSpeed=300;
    int setPosY;
    int setPosX;
    int health = 3;
    int invTime=0;
    boolean invisibility = false;
    public void act()
    {
        if(health<=0){
            death();
        }
        int speed=7;
        heroMovement(speed);
        shootLaser(6);
        if(invTime<=0){
            invisibility=false;
            if(isTouching(Enemy.class)){
                crashEnemy();
                gettingHit();
            }
        }else if(invisibility==true){
            invTime--;
        }
        

        
    }
    public void crashEnemy(){
        setLocation(setPosX,setPosY);
        invTime=180;
        invisibility=true;
        
    }
    public void gettingHit(){
        health--;
    }
    public void death(){
        getWorld().removeObject(this);
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
    public void shootLaser(int speed){
        Laser laser = new Laser(speed);
         if(attackSpeed <0){
           getWorld().addObject(laser,getX()+10,getY());
           attackSpeed=300;
        }else {
            attackSpeed--;
        }
        
    }
}
