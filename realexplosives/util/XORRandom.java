package realexplosives.util;

public class XORRandom {
	
	public static long random(long seed)
	{
		seed ^= (seed << 21);
		seed ^= (seed >>> 35);
		seed ^= (seed << 4);
		return seed;
	}

}
