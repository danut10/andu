package com.cegeka.test.ui.busu.factory.one;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TreeSlim implements Tree
{
	//~ Instance fields --------------------------
	/**  */
	int base, height;

	/**  */
	int nrOfSegments;
	//~ Constructors -----------------------------
	/**
	 * Creates a new TreeRegular object.
	 *
	 * @param  nrOfSegments
	 */
	public TreeSlim(int nrOfSegments)
	{
		super( );
		this.nrOfSegments = nrOfSegments;
	}
	//~ Methods ----------------------------------
	/** @see  com.cegeka.test.ui.busu.factory.one.Tree#draw() */
	public void draw()
	{
		base = computeBase();
		height = computeHeight();
		char[][] tree = new char[height + 1][base];
		initialized(tree);

		for (int a = 0; a < nrOfSegments; a++)
		{
			int k = 0;
			for (int i = computeHeightAdjustment(a) - 1 + 5 + ((nrOfSegments - 1 - a) * 2);
				i >= computeHeightAdjustment(a); i -= 2)
			{
				for (int j = base - 1 - k - (a); j >= (0 + k + (a)); j--)
				{
					tree[i][j] = '*';
					if (i != 0)
					{
						tree[i - 1][j] = '*';
					}
				}
				k++;
			}
		}
		tree[height][(base / 2)] = '*';
		for (int i = 0; i <= height; i++)
		{
			for (int j = 0; j < base; j++)
			{
				System.out.print(tree[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   a
	 * @return
	 */
	private int computeHeightAdjustment(int a)
	{
		int b = 0;
		for (int o = 0; o < ((nrOfSegments - 1 - a) * 2); o += 2)
		{
			b += o + 5;
		}

		return b;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  tree
	 */
	private void initialized(char[][] tree)
	{
		for (int i = 0; i <= height; i++)
		{
			for (int j = 0; j < base; j++)
			{
				tree[i][j] = 0;
			}
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	private int computeBase()
	{
		return 5 + ((nrOfSegments - 1) * 2);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	private int computeHeight()
	{
		int height = 0;
		for (int i = 5; i <= (5 + ((nrOfSegments - 1) * 2)); i += 2)
		{
			height += i;
		}

		return height;
	}
}
