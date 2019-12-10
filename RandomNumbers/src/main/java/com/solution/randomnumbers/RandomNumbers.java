package com.solution.randomnumbers;

import java.util.Random;

/**
 *
 * @author omaribrahim
 */
public class RandomNumbers {
    
    public String tossACoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0){
          return "HEADS";
        }
        else{
            return "TAILS";
        }
    }
    
    public static void main(String[]args){
       RandomNumbers game = new RandomNumbers();
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin());
       System.out.println(game.tossACoin()); 
       
    }
}
