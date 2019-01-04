package com.cegeka.test.ui.busu.factory.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			TreeFactory shapeFactory = new TreeFactory();
			System.out.print("tip ramura(A, R, S, F):");
			String leafPattern = input.readLine();
			System.out.print("nr ramuri:");
			int nrOfSegments = Integer.parseInt(input.readLine());
			Tree tree = shapeFactory.getShape(leafPattern, nrOfSegments);
			tree.draw();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				input.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
