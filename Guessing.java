 
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Guessing
{
    // instance variables - replace the example below with your own
    private int guess;
    private int secretNumber;
    private int guessNum;
    Scanner reader = new Scanner(System.in);

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        // initialise instance variables
      
        
    }
    public void play() 
    {
        guess = 0;
        secretNumber = (int)(Math.random() * 50 + 1);
        //System.out.println(secretNumber)
        guessNum = 0;
        while(guess != secretNumber){
        
        
        System.out.println("Guess an integer between 1 and 50: ");
        guess = reader.nextInt();
        if(guess > 50){
         System.out.println("Guess is invalid, guess an integer between 1 and 50");   
        }else if(guess < 1){
         System.out.println("Guess is invalid, guess an integer between 1 and 50");   
        }
        else if(guess < secretNumber){
         System.out.println("Guess is too low, try again!");   
        }else if(guess > secretNumber){
         System.out.println("Guess is too high, try again!");  
        }
        else{
            
        }
        guessNum++;
    }
    
     System.out.println("Guess is correct! It took you " + guessNum + " guesses");
    }
}
