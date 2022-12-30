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
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage gameoverimage;
    int pizzaEaten;
    int speed=5;
    int lives;
    int score;
    public Robot(){
        robotimage1= new GreenfootImage("man01.png");
        robotimage2= new GreenfootImage("man02.png");
        gameoverimage = new GreenfootImage("gameover.png");
        this.lives = 3;
        this.pizzaEaten = 0;
        this.score =0;
    }
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
        
    }
    public void robotMovement(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
            animate();
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
            animate();
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
            animate();
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
            animate();
        }
    }
     public void detectWallCollision(){
         if(isTouching(Wall.class)){
             Greenfoot.playSound("hurt.wav");
             removeLife();
             setLocation(48,50);
         }
     }
     public void detectBlockCollision(){
         if(isTouching(Block.class)){
             Greenfoot.playSound("hurt.wav");
             removeLife();
             setLocation(48,50);
         }
     }
     public void detectHome(){
         if(isTouching(Home.class)){
             if(pizzaEaten>=5){
                 Greenfoot.playSound("yipee.wav");
                 setLocation(48,50);
                 pizzaEaten=0;
                 increaseScore();
             }
             
         }
     }
     public void eatPizza(){
         if(isTouching(Pizza.class)){
             Pizza pizza = (Pizza)getOneIntersectingObject(Pizza.class);
             Greenfoot.playSound("eat.wav");
             pizzaEaten++;
             getWorld().removeObject(pizza);
         }
     }
      public void animate(){
          if(getImage().equals(robotimage1)){
              setImage(robotimage2);
          }else{
              setImage(robotimage1);
          }
      }
      public void removeLife(){
          this.lives--;
          if(this.lives<0){
              testEndGame();
          }
      }
      public void testEndGame(){
          setImage(gameoverimage);
      }
      public void increaseScore(){
          this.score++;
      }
      public void showStatus()
    {
        getWorld().showText("Lives : "+lives,71,530);
        getWorld().showText("Pizza : "+pizzaEaten,71,555);
        getWorld().showText("Score : "+score,71,580);
    }
     
}
