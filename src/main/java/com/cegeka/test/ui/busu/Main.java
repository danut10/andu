package com.cegeka.test.ui.busu;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Main
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		// showHardcodedTree();
		showDinamicTree();
	}
	
	/** DOCUMENT ME! */
	private static void showDinamicTree()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter height:");
		int height = s.nextInt();
		showDinamicTree(height);
	}
	
	/** DOCUMENT ME! */
	private static void showHardcodedTree()
	{
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("   *  ");
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree(int height)
	{
		int blancSpaces = height - 1;
		for (int i = 0; i < height; i++)
		{
			boolean addedBlancSpaces = false;
			if (!addedBlancSpaces)
			{
				for (int j = 0; j < blancSpaces; j++)
				{
					System.out.print(" ");
				}
				addedBlancSpaces = true;
			}
			blancSpaces--;
			for (int k = 0; k < ((i * 2) + 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < (height - 1); i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
}
