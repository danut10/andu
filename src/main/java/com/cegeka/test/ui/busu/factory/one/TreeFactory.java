package com.cegeka.test.ui.busu.factory.one;

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
	public Tree getShape(String leafPattern, int nrOfSegments)
	{
		if (leafPattern == null)
		{
			return null;
		}
		if (leafPattern.equalsIgnoreCase("R"))
		{
			return new TreeRegular(nrOfSegments);
		}
		else if (leafPattern.equalsIgnoreCase("F"))
		{
			return new TreeFat(nrOfSegments);
		}
		else if (leafPattern.equalsIgnoreCase("S"))
		{
			return new TreeSlim(nrOfSegments);
		}
		else if (leafPattern.equalsIgnoreCase("A"))
		{
			return new TreeAuthentic(nrOfSegments);
		}

		return null;
	}
}
