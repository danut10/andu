package com.cegeka.test.ui.busu.factory;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TreeFactory
{
	//~ Instance fields --------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   shapeType
	 * @return
	 */

	public int height;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   shapeType
	 * @return
	 */
	public Tree getShape(String shapeType)
	{
		if (shapeType == null)
		{
			return null;
		}
		if (shapeType.equalsIgnoreCase("Pattern1"))
		{
			return new Tree1();
		}
		else if (shapeType.equalsIgnoreCase("Pattern2"))
		{
			return new Tree2();
		}
		else if (shapeType.equalsIgnoreCase("Pattern3"))
		{
			return new Tree3();
		}
		else if (shapeType.equalsIgnoreCase("Pattern4"))
		{
			return new Tree4();
		}

		return null;
	}
}
