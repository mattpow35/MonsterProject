package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("joey", 2, 1, true, 2, 1, true, 2, "I don't know your name");
		keyboardInput = new Scanner(System.in);
	}

	public void start()
	{
		
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("Me has " + firstMonster.geteyeCount() + " eye.");

		
		System.out.println("Me has " + firstMonster.getantennaCount() + " antennas, me uses them to feel around and sense me surroundings.");
		
		monsterDecisions();
		
		loopMonster(); //method call
	}
	
	private void monsterDecisions()
	{
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
		
		if (eatMe.equalsIgnoreCase("yes"))
		{
			System.out.println("oh no! please do not eat me! Go find some other food " + firstMonster.getuserName());
			
		}
		else 
		{
			System.out.println("GOOD! I was worried you might eat me. Im glad we are friends " + firstMonster.getuserName() + " :)");
		}
	}
	private void loopMonster()
	{
		//define a variable for condition/test
		int numberOfTimes = 0;

		while (numberOfTimes < 1000)
			{
				//code to do
				System.out.print("First monster words " + firstMonster);
				//change var
				numberOfTimes++;
			}
		
		for(int count = 0; count < 1000; count++)
			{
				System.out.println("First Monster words " + firstMonster);
			}
		
		
		
		int eat = 0;
		while (eat < 10)
			{
				System.out.println("I am eating");
				eat++;
			}
			System.out.println("I ate 10 pieces of food.");
		
		int height = 1;
		while (height <= 12)
			{
				if (height == 1)
				{
					System.out.println("I was " + height + " foot tall when I was " + height + " year old");
				}
				else
				{
					System.out.println("I was " + height + " feet tall when I was " + height + " years old");
				}
				height++;
			}
		System.out.println("Me is now 13 years old and 13 feet tall :)");
		
		
		
		
	}
}

