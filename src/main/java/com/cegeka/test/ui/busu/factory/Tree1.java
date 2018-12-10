package com.cegeka.test.ui.busu.factory;

import java.io.IOException;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Tree1 implements Tree
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree1(int height)
	{
		int blancSpaces = height - 1;
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < blancSpaces; j++)
			{
				System.out.print(" ");
			}
			blancSpaces--;
			for (int k = 0; k < ((i * 2) + 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		showTrunk1(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk1(int height)
	{
		for (int i = 0; i < (height - 1); i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	/**
	 * @throws  IOException
	 * @throws  NumberFormatException
	 * @see     com.cegeka.test.ui.busu.factory.Tree#draw(int)
	 */
	public void draw()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter height:");
		int height;
		try
		{
			height = Integer.parseInt(s.nextLine());
			showDinamicTree1(height);
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
