package three.view;

import javax.swing.JOptionPane;
/**
 * view object for the String project.
 * @author plar4927
 *
 */
public class StringView
{

	

	/**
	 * Show the error when a non integer is typed. displayError method. have to type actual number not spell it out.
	 */
	public void displayError()
	{
		int test;
		String temp;
		
		JOptionPane.showMessageDialog(null, " Let's watch the program crash!");
		temp = JOptionPane.showInputDialog("Type your favorite number!");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, " Your favorite number is " + test);
		
	}
	
	/**
	 * variable must be assigned a value, whether you use it in method or it is null.
	 * @return
	 */
	public String getResponse()
	{
		String response = JOptionPane.showInputDialog(null, "Say something funny.");
		
		return response;
		
		//if you get an error that says local variable may not have been initialized: give value for your variables.
		
	}
	
	public void showPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, currentValue + ", is that supposed to be funny...");
		
	}
	
	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey " + first + "\n" + "says: " + second);
	}
	
	private void endsWith (String suffix)
	{
		String suffixString = JOptionPane.showInputDialog(null, "Type in a word to test its suffix");
		JOptionPane.showMessageDialog(null, "We are doing the endsWith method test");
		JOptionPane.showMessageDialog(null, "My String is: " + suffixString);
		if (suffixString.endsWith("sion"))
		{
			JOptionPane.showMessageDialog(null, "Yes my String ends in sion");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "No your String doesn't end in sion");	
		}

	}
	
	private void toUpperCase()
	{
		String upperCaseWordString = JOptionPane.showInputDialog(null, "Type in your favorite saying.");
		JOptionPane.showMessageDialog(null, "Your favorite saying is: " + upperCaseWordString );
		JOptionPane.showMessageDialog(null, "Get excited!!!!!!!");
		JOptionPane.showMessageDialog(null, upperCaseWordString.toUpperCase());	
		
		
	}
	
	public void callTestMethods ()
	{
		endsWith(null);
		toUpperCase();
		testSubString(5);
		
	}
	
	private void testSubString(int startPosition)
	{
		String testString = "supercallifragilisiticexpialidocious";
		JOptionPane.showMessageDialog(null, "The substring method test!");
		JOptionPane.showMessageDialog(null, "We are going to go from the " + startPosition + " in the test string");
		JOptionPane.showMessageDialog(null, "the test string is: " + "/n" + testString);
		JOptionPane.showMessageDialog(null, "the testString.substring(startPosition) call gives us: " + "/n" + testString.substring(startPosition));
	}
}
