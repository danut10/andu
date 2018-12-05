package cegeka.firsttask;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class RunClass
{
	//~ Instance fields --------------------------

	/**  */
	private final String christmassTree = ""
		+ "  *\n"
		+ " * *\n"
		+ "* * *\n";
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		new RunClass().showChristmassTree();
	}
	

	/** DOCUMENT ME! */
	public void showChristmassTree()
	{
		System.out.print(christmassTree);
	}
}
