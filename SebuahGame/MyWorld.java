import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int time=0;
    public int currTime =0;
    public int speed;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int setPosY=200;
        int setPosX=10;
        Hero hero = new Hero(setPosY,setPosX);
        addObject(hero,setPosX,setPosY);
    }
    public void act(){
        time++;
        speed=time/3600;
        generateEnemy(speed);
    }
    public void generateEnemy(int speed){
        if(currTime>180){
            Enemy enemy = new Enemy(speed +3);
            addObject(enemy,getWidth(),Greenfoot.getRandomNumber(getHeight()-100)+40);
            currTime =0;
        }else{
            currTime++;
        }
    }
}
