import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (AdiSastrawan) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block();
        addObject(block,427, 145);
        Robot robot = new Robot();
        addObject(robot,48,50);
        Wall wall = new Wall();
        Wall wall1 = new Wall();
        Wall wall2 = new Wall();
        Wall wall3 = new Wall();
        Wall wall4 = new Wall();
        Wall wall5 = new Wall();
        Wall wall6 = new Wall();
        Home home = new Home();
        Pizza pizza = new Pizza();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();
        Pizza pizza4 = new Pizza();
        Scorepanel score = new Scorepanel();
        addObject(pizza, 720, 46);
        addObject(pizza1, 433, 38);
        addObject(pizza2, 183, 302);
        addObject(pizza3, 682, 312);
        addObject(pizza4, 417, 537);
        addObject(score, 71, 554);
        addObject(home, 751, 552);
        addObject(wall1, 52, 147);
        addObject(wall2,159, 147);
        addObject(wall3,266, 147);
        addObject(wall4,587, 147);
        addObject(wall5,692, 147);
        addObject(wall6,791, 147);
        
    }
}
