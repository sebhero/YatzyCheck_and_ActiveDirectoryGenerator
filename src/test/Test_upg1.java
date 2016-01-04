package test;

import uppgift1.Username;

public class Test_upg1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final Username activeDirectory = new Username();
		activeDirectory.addUser("Bo Ek");
		activeDirectory.addUser("Erik Edström");
		activeDirectory.addUser("Jörgen Svensson");
		activeDirectory.addUser("James Bond");

		Username.listNames(activeDirectory.getUserList());
	}
}
