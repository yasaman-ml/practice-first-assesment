/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.practiceprogramming;

import java.util.Scanner;

public class RockPaper  {
    
    public static void main(String[] args) {
        String answer="";
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println(" how many rounds you wants to play?");
        int numPlay=Integer.parseInt(sc.nextLine());
     
        if (numPlay<=1 || numPlay>=10){
            System.out.println("the number is not valid");
        
        }else{
            for(int i=1;i<numPlay;i++) {
            
                System.out.println("What is your choice?");
            
                String userMove = sc.nextLine();
                int rand = (int)(Math.random()*3);
                String compMove = "";
                if(rand == 0) {
                    compMove = "rock";
                } else if(rand == 1) {
                    compMove = "paper";
                } else {
                    compMove = "scissors";
                }
                System.out.println("computer move: " + compMove);
            
                if(userMove==compMove) {
                    System.out.println("It's a tie!");
                } else if((userMove=="rock" && compMove=="scissors") || (userMove=="scissors" && compMove=="paper")){
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }
            }
            System.out.println("would you like to play more?");
            answer=sc.nextLine();
        }
            
        }while(answer == "yes");
        System.out.println("thanks for playnig");
            
            
         
    }  
}    
                
          
     
     
  


		
		
//System.out.println("Thanks for playing Rock, Paper, Scissors!");

 

