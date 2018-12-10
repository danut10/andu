package com.cegeka.test.ui.busu.factory;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Tree4 implements Tree
{
	//~ Static fields/initializers ---------------
	/**  */
	private static int height;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  segmentHeight
	 */
	private static void showDinamicTree4(int segmentHeight)
	{
		int trunkSpaces = computeBlankSpaces(height);
		for (int j = 3; j <= segmentHeight; j++)
		{
			showTreeSegment(j);
		}
		showTrunk4(trunkSpaces);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  segmentHeight
	 */
	private static void showTreeSegment(int segmentHeight)
	{
		int blankSpaces = computeBlankSpaces(height);

		int blancSpaceRatio = 1;
		for (int i = 0; i < segmentHeight; i++)
		{
			for (int j = 0; j < blankSpaces; j++)
			{
				System.out.print(" ");
			}

			for (int k = 0; k < ((i * blancSpaceRatio) + 1); k++)
			{
				System.out.print("*");
			}
			blankSpaces -= blancSpaceRatio;
			blancSpaceRatio++;
			System.out.println();
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk4(int height)
	{
		for (int i = 0; i < height; i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	/** @see  com.cegeka.test.ui.busu.factory.Tree#draw(int) */
	public void draw(int height)
	{
		showDinamicTree4(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   height
	 * @return
	 */
	private static int computeBlankSpaces(int height)
	{
		int blankSpaces = 0;
		for (int i = 0; i < height; i++)
		{
			blankSpaces += i;
		}

		return blankSpaces;
	}
	
	/** @see  com.cegeka.test.ui.busu.factory.Tree#draw() */

	public void draw()
	{
		Scanner s = new Scanner(System.in);

		try
		{
			System.out.println("Enter largest segment height:");
			height = Integer.parseInt(s.nextLine());
			if (height < 3)
			{
				System.out.println("Must be greater than 3");
			}
			else
			{
				showDinamicTree4(height);
			}
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
