package com.cegeka.test.ui.andu;

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
	private static final char TREE_PART = '*';

	/**  */
	private static final char EMPTY_SPACE = ' ';
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   branches
	 * @return
	 */
	private int getArrayHeight(int branches)
	{
		return (branches * (2 + branches + 1) / 2) + 1;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	private int getArrayWidth(int branches)
	{
		return (2 * branches) + 1;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   branches
	 * @return
	 */
	private char[][] makeTree(int branches)
	{
		if (branches < 1)
		{
			System.out.println("Please enter a number > 0");

			return null;
		}
		char[][] tree = new char[getArrayHeight(branches)][getArrayWidth(branches)];

		int branchNr = branches;
		int middle = branches;
		int branchHeight = branches;

		for (int x = tree.length - 2; x >= 0; x--)
		{
			for (int y = tree[x].length - 1; y >= 0; y--)
			{
				tree[x][y] = EMPTY_SPACE;
				if (branchHeight < 0)
				{
					branchNr--;
					branchHeight = branchNr;
				}
				if ((y <= (middle + branchHeight)) && (y >= (middle - branchHeight)))
				{
					tree[x][y] = TREE_PART;
				}
			}
			branchHeight--;
		}

		// Adding the trunk
		for (int i = 0; i < getArrayWidth(branches); i++)
		{
			tree[tree.length - 1][i] = EMPTY_SPACE;
		}
		tree[tree.length - 1][middle] = '*';

		return tree;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  tree
	 */
	private void readTree(char[][] tree)
	{
		for (int x = 0; x < tree.length; x++)
		{
			for (int y = 0; y < tree[x].length; y++)
			{
				System.out.print(tree[x][y]);
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		System.out.print("Please enter the number of branches for the tree: ");
		Scanner in = new Scanner(System.in);
		int branches = in.nextInt();

		new Main().readTree(new Main().makeTree(branches));
	}
}
