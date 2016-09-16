package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("joey",
				                                    2,
				                                    1,
				                                    true,
				                                    2,
				                                    1,
				                                    true,
				                                    2, "I don't know your name");
		keyboardInput = new Scanner(System.in);
	}

	public void start()
	{
		
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("Me has " + firstMonster.geteyeCount() + " eye.");
//		if (firstMonster.geteyeCount() == 1)
//		{
//			System.out.println("--HE ONLY HAS ONE EYE!! How Scary!!--");
//		}
		
		System.out.println("Me has " + firstMonster.getantennaCount() + " antennas, me uses them to feel around and sense me surroundings.");
		
		System.out.println("Do you want to change me name?");
		String answer = keyboardInput.nextLine();
		
		if (answer .equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setname(newName);
		}
		else
		{
			System.out.println("FINE, don't change my name! >:/");
		}
		System.out.println(firstMonster);
		
		System.out.println("What is your name?");
		String newuserName = keyboardInput.nextLine();
		System.out.println("Hello " + newuserName);

		
		
		System.out.println("can I change you name?");
		String nameanswer = keyboardInput.nextLine();
		
		if (nameanswer .equalsIgnoreCase("yes"))
		{
			System.out.println("your name is now Mr. Derp. ha ha ha");
			firstMonster.setuserName("Mr. Derp");
			

			
			
		}
		else
		{
			System.out.println("ok then, you are no fun!!!! :(");
			firstMonster.setuserName(newuserName);
			
		}
		
		System.out.println("My body is made of candy..... Are you hungry?");
		String eatMe = keyboardInput.nextLine();
		
		if (eatMe .equalsIgnoreCase("yes"))
		{
			System.out.println("oh no! please do not eat me! Go find some other food " + firstMonster.getuserName());
			
		}
		
	}

	
}

