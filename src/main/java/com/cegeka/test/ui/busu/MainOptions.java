package com.cegeka.test.ui.busu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class MainOptions
{
	//~ Static fields/initializers ---------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */

	private static int height;
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		showDinamicTree();
	}
	
	/** DOCUMENT ME! */
	private static void showDinamicTree()
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			while (true)
			{
				System.out.println("Choose one of 4 tree patterns:");
				int pattern;

				pattern = Integer.parseInt(input.readLine());

				switch (pattern)
				{
					case 1:
					{
						System.out.println("Enter height:");
						int height = Integer.parseInt(input.readLine());
						showDinamicTree1(height);
						break;
					}

					case 2:
					{
						System.out.println("Enter height:");
						int height = Integer.parseInt(input.readLine());
						showDinamicTree2(height);
						break;
					}

					case 3:
					{
						System.out.println("Enter height:");
						int height = Integer.parseInt(input.readLine());
						showDinamicTree3(height);
						break;
					}

					case 4:
					{
						System.out.println("Enter largest segment height:");
						height = Integer.parseInt(input.readLine());
						if (height < 3)
						{
							System.out.println("Must be greater than 3");
						}
						else
						{
							showDinamicTree4(height);
						}
						break;
					}

					default:
					{
						System.out.println("Wrong Answer");
						break;
					}
				} // end switch
				System.out.println();
				System.out.println("exit(Y or N)?:");
				String exit = input.readLine();
				if (exit.equals("Y"))
				{
					return;
				}
			} // end while
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
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
		} // end try-catch-finally
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree1(int height)
	{
		int blancSpaces = height - 1;
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < blancSpaces; j++)
			{
				System.out.print(" ");
			}
			blancSpaces--;
			for (int k = 0; k < ((i * 2) + 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		showTrunk1(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree2(int height)
	{
		int blankSpaces = (height - 1) * 2;
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < blankSpaces; j++)
			{
				System.out.print(" ");
			}

			blankSpaces -= 2;
			for (int k = 0; k < ((i * 4) + 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		showTrunk2(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree3(int height)
	{
		int blankSpaces = height - 1;
		for (int i = 0; i < height; i++)
		{
			showLine(blankSpaces, i);
			showLine(blankSpaces, i);

			blankSpaces--;
		}
		showTrunk3(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showDinamicTree4(int segmentHeight)
	{
		int trunkSpaces = computeBlankSpaces(height);
		for (int j = 3; j <= segmentHeight; j++)
		{
			showTreeSegment(j);
		}
		showTrunk4(trunkSpaces);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTreeSegment(int segmentHeight)
	{
		int blankSpaces = computeBlankSpaces(height);

		int blancSpaceRatio = 1;
		for (int i = 0; i < segmentHeight; i++)
		{
			for (int j = 0; j < blankSpaces; j++)
			{
				System.out.print(" ");
			}

			for (int k = 0; k < ((i * blancSpaceRatio) + 1); k++)
			{
				System.out.print("*");
			}
			blankSpaces -= blancSpaceRatio;
			blancSpaceRatio++;
			System.out.println();
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param   height
	 * @return
	 */
	private static int computeBlankSpaces(int height)
	{
		int blankSpaces = 0;
		for (int i = 0; i < height; i++)
		{
			blankSpaces += i;
		}

		return blankSpaces;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  blankSpaces
	 * @param  i
	 */
	private static void showLine(int blankSpaces, int i)
	{
		for (int j = 0; j < blankSpaces; j++)
		{
			System.out.print(" ");
		}
		for (int k = 0; k < ((i * 2) + 1); k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk1(int height)
	{
		for (int i = 0; i < (height - 1); i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk2(int height)
	{
		for (int i = 0; i < ((height - 1) * 2); i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk3(int height)
	{
		showTrunk1(height);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  height
	 */
	private static void showTrunk4(int height)
	{
		for (int i = 0; i < height; i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
}
