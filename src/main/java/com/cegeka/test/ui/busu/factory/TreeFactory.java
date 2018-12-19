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
		if (shapeType.equalsIgnoreCase("Regular"))
		{
			return new Tree1();
		}
		else if (shapeType.equalsIgnoreCase("Fat"))
		{
			return new Tree2();
		}
		else if (shapeType.equalsIgnoreCase("Slim"))
		{
			return new Tree3();
		}
		else if (shapeType.equalsIgnoreCase("A"))
		{
			return new Tree4();
		}
		else if (shapeType.equalsIgnoreCase("Tip5"))
		{
			return new Tree5();
		}

		return null;
	}
}
