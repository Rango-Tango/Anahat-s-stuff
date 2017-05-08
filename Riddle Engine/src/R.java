
public class R {
	
	 public int check (int  name, String lname) // check
	    {
	        int check = 1; // check = 1
	        for (int counter = 0 ; counter < numEntries ; counter++) //loop checks every entry
	        {
	            if (name.equals (contacts [counter] [0]) && lname.equals (contacts [counter] [1])) //if contact has same first name and last name as input run code
	            {
	                check = 0; // check = 0
	            }
	        }
	        if (check == 1)
	        {
	            return 1; //returns 1
	        }
	        else
	        {
	            return 0; //returns 0
	        }
	    }

}
