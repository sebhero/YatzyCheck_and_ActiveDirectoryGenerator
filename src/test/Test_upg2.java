package test;

import uppgift2.Yatzy;

public class Test_upg2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final Skrivare2 skrivare = new Skrivare2();
		Skrivare2.skrivUt("Rolling the dices");
		final Yatzy yatzyGame = new Yatzy();
		Skrivare2.skrivUt(yatzyGame.toString());
		final String saveTheseDices = skrivare
				.askRow("Wich dices do you want to save?: ");

		yatzyGame.rollDices(yatzyGame
				.convertStringToBooleanList(saveTheseDices));
		Skrivare2.skrivUt(yatzyGame.toString());

		Skrivare2.skrivUt("Sort");
		yatzyGame.sort();
		Skrivare2.skrivUt(yatzyGame.toString());

		Skrivare2.skrivUt("Check if Yatzy");
		Skrivare2.skrivUt(yatzyGame.toString());
		if (yatzyGame.isYatzy())
		{
			Skrivare2.skrivUt("Is Yatzy!!!");

		}
		else
		{
			Skrivare2.skrivUt("No Yatzy");
		}
	}
}
