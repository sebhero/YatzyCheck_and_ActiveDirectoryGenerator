package test;

import uppgift2.Yatzy;

public class Test_upg2_B
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final Yatzy playYatzy = new Yatzy();
		final Double rolls = 10_000_000.0;
		int gotYatzy = 0;
		final long startTime = System.currentTimeMillis();

		Skrivare2.skrivUt("Throwing dices... ");
		for (Double roll = 1.0; roll < rolls; roll++)
		{
			playYatzy.rollDices();
			if (playYatzy.isYatzy())
			{
				gotYatzy++;
			}
		}

		final long endTime = System.currentTimeMillis();
		final long timeTook = endTime - startTime;

		Skrivare2.skrivUt("Done... (" + String.format("%2dm", timeTook) + ")");
		Skrivare2.skrivUt("You got Yatzy " + gotYatzy + " wich is "
				+ calcProcents(gotYatzy));
	}

	private static String calcProcents(int gotYatzy)
	{

		return Double.toString((gotYatzy / 10_000_000.0) * 100) + " procent";
	}
}
