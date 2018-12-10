package com.cegeka.test.ui.busu.factory;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Tree3 implements Tree
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree3(int height)
	{
		int blankSpaces = height - 1;
		for (int i = 0; i < height; i++)
		{
			showLine(blankSpaces, i);
			showLine(blankSpaces, i);

			blankSpaces--;
		}
		showTrunk3(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  blankSpaces
	 * @param  i
	 */
	private static void showLine(int blankSpaces, int i)
	{
		for (int j = 0; j < blankSpaces; j++)
		{
			System.out.print(" ");
		}
		for (int k = 0; k < ((i * 2) + 1); k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk3(int height)
	{
		for (int i = 0; i < (height - 1); i++)
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
			showDinamicTree3(height);
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
