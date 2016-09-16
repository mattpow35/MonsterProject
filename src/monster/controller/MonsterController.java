package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("joey",
				                                    2,
				                                    1,
				                                    true,
				                                    2,
				                                    1,
				                                    true,
				                                    2);
	}

	public void start()
	{
		
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("My monster has " + firstMonster.geteyeCount() + " eye.");
		if(firstMonster.geteyeCount() == 1)
		{
			System.out.println("HE ONLY HAS ONE EYE!! How Scary!!");
		}
		
		System.out.println("He has " + firstMonster.getantennaCount() + " antennas, he uses them to feel around and sense his surroundings.");
	}
	
}

