package three.controller;



import three.view.StringView;

/**
 * String controller class for the third project in java.
 * @author plar4927
 *
 */
public class StringController
{
	
	//declaration section
	//All needed model and view objects

	
	private StringView myView;
	
	/**
	 * creates StringController constructor for initializing objects.
	 */			
	public StringController()
	{
		myView = new StringView();
	}

	/**
	 * Starts the myView method from StringView class.
	 */
	public void start()
	{
//		myView.displayError();
//		String myResponse = myView.getResponse();
//		myView.showPassedValue(myResponse);
//		myView.moreInteractive("Palmer", myResponse);
		myView.callTestMethods();
		
				
	}

	private void moreInteractive(String string, String string2)
	{
		// TODO Auto-generated method stub
		
	}
}
