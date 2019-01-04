package com.cegeka.test.ui.busu.factory.one;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TreeAuthentic implements Tree
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
	public TreeAuthentic(int nrOfSegments)
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
			int k = 0, u = nrOfSegments + 1 - a;
			for (int i = computeHeightAdjustment(a) - 1 + 3 + nrOfSegments - 1 - a; i >= computeHeightAdjustment(a);
				i--)
			{
				for (int j = base - 1 - k - adjust(a); j >= (0 + k + adjust(a)); j--)
				{
					tree[i][j] = '*';
				}

				k += u;
				u--;
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
	private int adjust(int a)
	{
		int i = 0, b = 0;
		while (a > 0)
		{
			b += nrOfSegments + 1 - i;
			i++;
			a--;
		}

		return b;
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
		for (int o = 0; o < (nrOfSegments - 1 - a); o++)
		{
			b += o + 3;
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
		return 7 + adjustBase();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	private int adjustBase()
	{
		int i = 0;
		for (int u = 3; u < (3 + nrOfSegments - 1); u++)
		{
			i += u;
		}

		return i * 2;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	private int computeHeight()
	{
		int height = 0;
		for (int i = 3; i <= (3 + nrOfSegments - 1); i++)
		{
			height += i;
		}

		return height;
	}
}
