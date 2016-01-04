package uppgift2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Yatzy
{
	int[]	dices	= new int[5];

	public Yatzy()
	{

		rollDices();
	}

	public void rollDices()
	{
		for (int i = 0; i < dices.length; i++)
		{
			dices[i] = (int) (Math.random() * 6) + 1;
		}
	}

	public void rollDices(boolean rollDie1, boolean rollDie2, boolean rollDie3,
			boolean rollDie4, boolean rollDie5)
	{
		final boolean[] rollDieList =
		{ rollDie1, rollDie2, rollDie3, rollDie4, rollDie5 };
		this.rollDices(rollDieList);
	}

	public void rollDices(boolean[] rollDieList)
	{
		for (int i = 0; i < dices.length; i++)
		{
			if (rollDieList[i])
			{
				dices[i] = (int) (Math.random() * 6) + 1;
			}
		}
	}

	/**
	 * Checks if you have Yatzy
	 * 
	 * @return true if you got Yatzy else false
	 */
	public boolean isYatzy()
	{
		final int firstDie = dices[0];
		for (final int die : dices)
		{
			if (die != firstDie)
			{
				return false;
			}
		}
		return true;
	}

	public void sort()
	{
		Arrays.sort(dices);

		final List<Integer> intList = new ArrayList<Integer>(5);
		for (final int i : dices)
		{
			intList.add(i);
		}
		// snyggare lösning vore ifall jag inte använden ett primitivt int []
		// utan Arraylist..
		Collections.sort(intList, Collections.reverseOrder());
		for (int i = 0; i < intList.size(); i++)
		{
			dices[i] = intList.get(i);
		}

	}

	@Override
	public String toString()
	{
		return dices[0] + " " + dices[1] + " " + dices[2] + " " + dices[3]
				+ " " + dices[4] + " ";
	}

	public boolean[] convertStringToBooleanList(String saveTheseDices)
	{

		final String[] numStr = saveTheseDices.split("\\s");
		final int[] intArray = new int[numStr.length];

		final boolean dicesList[] = new boolean[dices.length];
		for (int i = 0; i < numStr.length; i++)
		{
			// convert the num to a number for a array that start with 0
			intArray[i] = Integer.parseInt(numStr[i]) - 1;
		}

		Arrays.fill(dicesList, true);
		for (final int saveMe : intArray)
		{
			dicesList[saveMe] = false;
		}
		return dicesList;
	}
}
