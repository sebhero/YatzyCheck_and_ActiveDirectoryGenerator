package uppgift1;

import java.util.HashMap;
import java.util.Map.Entry;

import test.Skrivare2;

public class Username
{
	private final HashMap<String, String>	UserList	= new HashMap<>();

	public Username()
	{
	}

	public static String creatUsername(String surename)
	{
		// split on whitespaces
		final String[] nameArray = surename.split("\\s");

		final String part1 = getFirstLetters(nameArray[0]);

		final String part2 = getFirstLetters(nameArray[1]);
		final String username = part1 + part2;
		Skrivare2.skrivUt("username= " + username);
		return username;
	}

	private static String getFirstLetters(final String text)
	{
		if (text.length() < 3)
		{
			return (String) text.subSequence(0, 2);
		}
		else
		{
			return (String) text.subSequence(0, 3);
		}
	}

	public static void listNames(String[] surenames, String[] usernames)
	{
		for (int i = 0; i < surenames.length; i++)
		{
			Skrivare2.skrivUt(surenames[i] + " (" + usernames[i] + ")");
		}
	}

	public static void listNames(HashMap<String, String> userlist)
	{
		for (final Entry<String, String> entry : userlist.entrySet())
		{
			Skrivare2.skrivUt(entry.getKey() + " (" + entry.getValue() + ")");
		}
	}

	public void addUser(String surename)
	{
		this.getUserList().put(surename, creatUsername(surename));
	}

	public HashMap<String, String> getUserList()
	{
		return UserList;
	}

}
