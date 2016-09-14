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
		

	}
}
