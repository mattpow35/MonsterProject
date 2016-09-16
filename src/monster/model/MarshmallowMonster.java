package monster.model;

public class MarshmallowMonster
{
	
	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	private boolean hasSpine;
	private int legCount;
	private String userName;
	
	public MarshmallowMonster()
	{
		this.name = "no name here";
		this.antennaCount = -231231.123;
		this.eyeCount = -23456;
		this.hasBellyButton = false;
		this.armCount = -2315;
		this.noseCount = -7756;
		this.hasSpine = false;
		this.userName = "no name";
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int armCount, int noseCount, boolean hasSpine, int legCount, String userName)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
		this.hasSpine = hasSpine;
		this.legCount = legCount;
		this.userName = userName;
	}
	public String toString()
	{
		String description = "Name is " + this.name;
		
		return description; 
		
	}
	
	//getters
	public String getname()
	{
		return name;
	}
	 
	public double getantennaCount()
	{
		return antennaCount;
	}
	
	public int geteyeCount()
	{
		return eyeCount;
	}
	
	public boolean gethasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getarmCount()
	{
		return armCount;
	}
	
	public int getnoseCount()
	{
		return noseCount;
	}
	
	public boolean gethasSpine()
	{
		return hasSpine;
	}

	public int getlegCount()
	{
		return legCount;
	}
	
	public String getuserName()
	{
		return userName;
	}
	
	
	//setters
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setantennaCount(int antennaCount)
	{
		this.antennaCount = antennaCount;
	}
	
	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void sethasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	
	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setnoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}
	
	public void sethasSpine(boolean hasSpine)
	{
		this.hasSpine = hasSpine;
	}
	
	public void setlegCount(int legCount)
	{
		this.legCount = legCount;
	}
	
	public void setuserName(String userName)
	{
		this.userName = userName;
	}
	
	
	
	
	
	
	
	
	
}

