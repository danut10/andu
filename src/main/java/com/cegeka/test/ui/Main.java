package com.cegeka.test.ui;

import java.util.Scanner;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Main
{
	//~ Static fields/initializers ---------------
	/**  */
	private static final String christmassTree = ""
		+ "  *\n"
		+ " * *\n"
		+ "* * *\n"
		+ "  *\n";

	/**  */
	private static final String TREE_PART = "*";

	/**  */
	private static final String EMPTY_SPACE = " ";
	//~ Instance fields --------------------------
	/**  */
	private int height;
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param   height
	 * @return
	 */
	private String getTree(int height)
	{
		StringBuilder builder = new StringBuilder();
		if (height < 1)
		{
			System.out.println("Please enter a height > 0");

			return EMPTY_SPACE;
		}
		for (int i = 1; i <= height; i++)
		{
			// empty spaces height + i
			// stars height + empty spaces
			for (int empty = 1; empty <= (height - i); empty++)
			{
				builder.append(EMPTY_SPACE);
			}
			for (int star = 1; star <= i; star++)
			{
				builder.append(TREE_PART);
				builder.append(EMPTY_SPACE);
			}
			builder.append("\n");
		}
		for (int x = 1; x < height; x++)
		{
			builder.append(EMPTY_SPACE);
		}
		builder.append(TREE_PART);

		return builder.toString();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		System.out.print("Please enter a height for the tree:");
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		System.out.println(new Main().getTree(height));
	}
}