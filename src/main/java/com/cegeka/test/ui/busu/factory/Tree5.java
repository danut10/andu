package com.cegeka.test.ui.busu.factory;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Tree5 implements Tree
{
	//~ Static fields/initializers ---------------
	/**  */
	private static int segmentNumbers;
	//~ Methods ----------------------------------
	/** @see  com.cegeka.test.ui.busu.factory.Tree#draw() */
	public void draw()
	{
		Scanner s = new Scanner(System.in);

		try
		{
			System.out.println("Enter segment numbers:");
			segmentNumbers = Integer.parseInt(s.nextLine());

			showDinamicTree5();
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private void showDinamicTree5()
	{
		int trunkSpaces = segmentNumbers + 3 - 1;
		for (int j = 1; j <= segmentNumbers; j++)
		{
			showTreeSegment(j);
		}
		showTrunk5(trunkSpaces);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  segmentHeight
	 */
	private static void showTreeSegment(int segmentNumber)
	{
		int blancSpaceRatio = 1;
		for (int i = 1; i <= (segmentNumber + 3); i++)
		{
			for (int j = 0; j < (segmentNumbers + 3 - blancSpaceRatio); j++)
			{
				System.out.print(" ");
			}

			for (int k = 0; k < ((i * 2) - 1); k++)
			{
				System.out.print("*");
			}
			blancSpaceRatio++;
			System.out.println();
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk5(int trunkSpaces)
	{
		for (int i = 0; i < (trunkSpaces); i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
}
