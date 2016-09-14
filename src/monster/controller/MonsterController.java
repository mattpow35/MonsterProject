package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("joey",
				                                    2,
				                                    0,
				                                    true,
				                                    2,
				                                    1,
				                                    true,
				                                    2);
	}

	public void start()
	{
		
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("My monster has " + firstMonster.getEyeCount() + " eyes.");
		if(firstMonster.getEyeCount() < 1)
		{
			System.out.println("HE HAS NO EYES!!!! How can he see???");
		}
		

	}
}
