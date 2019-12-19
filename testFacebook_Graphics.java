// This is the testFacebook_Graphics class
// Sidney Seay
// 03/15/2014


import jpb.*;

import java.awt.Graphics;
import java.util.*;

import jpb.DrawableFrame;


public class testFacebook_Graphics{
	  
  public static void main (String[] args){

    // Prompt user to enter the number of facebookpresons
//    SimpleIO.prompt("Enter the number of facebookpresons to be created: ");
//    String userInput = SimpleIO.readLine();
//    int numP = Integer.parseInt(userInput);
	  
    boolean inputValue = false;	   
	Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the number of facebookpresons to be created: ");
    int numP = userInput.nextInt();
    do
    {
        if (numP < 1 || numP > 9)
        {
            System.out.println("Enter the number of facebookpresons to be created: ");
            numP = userInput.nextInt();            
        }
        else
        {
        	inputValue = true;
        }
    } while (inputValue == false); // loop until valid input

    // create instance of the class
    Facebook_Graphics fbg = new Facebook_Graphics();
    // call class Facebook_Graphics    
    fbg.Facebook_Graphic(numP);   
  } // end main
  // display frame
 
}