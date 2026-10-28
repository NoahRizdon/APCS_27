/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
			x.getAge();
			x.getActor();
			x.getVillain();
		
		Spiderman Tobey = new Spiderman(48, "Tobey Maguire", "Green Goblin");
			System.out.println(Tobey.getActor() + " is " + Tobey.getAge() + " and fights " + Tobey.getVillain());

		Spiderman Andrew = new Spiderman(40, "Andrew Garfield", "Electro");
			System.out.println(Andrew.getActor() + " is " + Andrew.getAge() + " and fights " + Andrew.getVillain());

		Spiderman Tom = new Spiderman(27, "Tom Holland", "The Vulture");
			System.out.println(Tom.getActor() + " is " + Tom.getAge() + " and fights " + Tom.getVillain());
		
	}
}
