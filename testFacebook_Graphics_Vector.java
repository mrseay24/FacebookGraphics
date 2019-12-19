// This is the testFacebook_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011


//import jpb.*;
import java.util.*;

public class testFacebook_Graphics_Vector{

	  @SuppressWarnings("resource")
	public static void main (String[] args){

		    // Prompt user to enter the number of facebookpresons
//		    SimpleIO.prompt("Enter the number of facebookpresons to be created: ");
//		    String userInput = SimpleIO.readLine();
//		    int numP = Integer.parseInt(userInput);

			Scanner userInput = new Scanner(System.in);
		    //System.out.println("Enter the number of facebookpresons to be created: ");
		    //int numP = userInput.nextInt();
            //int numP = 100;
            //boolean firstPass = true;

            Vector v = new Vector();

           // FacebookPerson_Graphics[] fbp = new FacebookPerson_Graphics[numP];

		    //Ask the user to enter the name for each person, and create the persons
		  while(true){
		    	System.out.println("Create a person with name (enter #### to end the creation of FacebookPersons)");
		        String name = userInput.next();
		        if (name.compareTo("####")==0)
		        break;
		        	boolean personExist = false;
		        	for(int i =0; i< v.size(); i++){
		        		FacebookPerson_Graphics fbp = (FacebookPerson_Graphics)v.elementAt(i);
		        		if(fbp.getName().equalsIgnoreCase(name)){
		        			personExist = true;
		        			break;
		        		}
		        	}
		    if(!personExist){
		    	FacebookPerson_Graphics p = new FacebookPerson_Graphics(name);
		    	System.out.println("FacebookPerson "+name+" is created!");
		    	v.add(p);
		    }
		    else
		    	System.out.println("Name already exist. Try aggain!");
		  }
		    System.out.println("-------select a person and type the mood below--------");

		    //Ask the user to set the mood for a person, and update the mood, enter "####" to exit
		    while(true){
		    	System.out.println("Enter the name for a person (enter #### to exit):");
		        String name = userInput.next();
		        if(name.equals("####"))
		             System.exit(0);
		      FacebookPerson_Graphics fbp_search = null;
		        for(int i=0; i< v.size(); i++){
		        	FacebookPerson_Graphics fbp = (FacebookPerson_Graphics)v.elementAt(i);
		            if(fbp.getName().equalsIgnoreCase(name)){
		               fbp_search = fbp;
		                break;
		            }
		        }
		        if(fbp_search != null){  // found the person
		        	System.out.println("Enter the mood for the person:");
		            String mood = userInput.next();
		            fbp_search.setMood(mood);
		        }
		        else
		            System.out.println("unrecognized name!");
		    } // end while
		  } // end main
		}