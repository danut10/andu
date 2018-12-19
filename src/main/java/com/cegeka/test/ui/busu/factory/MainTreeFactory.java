package com.cegeka.test.ui.busu.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class MainTreeFactory
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		showDinamicTree();
	}
	
	/** DOCUMENT ME! */
	private static void showDinamicTree()
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		TreeFactory shapeFactory = new TreeFactory();

		try
		{
			while (true)
			{
				System.out.println("Choose one of 5 tree patterns:");
				System.out.println("Regular");
				System.out.println("Fat");
				System.out.println("Slim");
				System.out.println("A");
				System.out.println("Tip5");
				String pattern = input.readLine();
				Tree tree = shapeFactory.getShape(pattern);
				if (tree != null)
				{
					tree.draw();
				}
				else
				{
					System.out.println("Wrong Answer");
				}
				System.out.println();
				System.out.println("exit(Yes or else)?:");
				String exit = input.readLine();
				if (exit.equals("Yes"))
				{
					return;
				}
			} // end while
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				input.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end try-catch-finally
	}
}
