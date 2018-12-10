package com.cegeka.test.ui.busu.factory;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Tree2 implements Tree
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree2(int height)
	{
		int blankSpaces = (height - 1) * 2;
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < blankSpaces; j++)
			{
				System.out.print(" ");
			}

			blankSpaces -= 2;
			for (int k = 0; k < ((i * 4) + 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		showTrunk2(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk2(int height)
	{
		for (int i = 0; i < ((height - 1) * 2); i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	/** @see  com.cegeka.test.ui.busu.factory.Tree#draw(int) */
	public void draw()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter height:");
		int height;
		try
		{
			height = Integer.parseInt(s.nextLine());
			showDinamicTree2(height);
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
