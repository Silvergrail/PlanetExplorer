package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: Jussi Sauvola 1957709
// Finish time:
public class PlanetExplorer {
	
	private int pos_y = 0;
	private int pos_x = 0;
	private String facing = "NORTH";
	private char f;
	private char b;
	private char r;
	private char l;
	
	public PlanetExplorer(int x, int y, String obstacles){
	String Grid[][] = new String[x][y];
		
		
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	public String executeCommand(String command){
		
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == f && facing == "NORTH") {
				pos_y += 1;
			} else if (command.charAt(i) == f && facing == "SOUTH") {
				pos_y =- 1;			
			} else if (command.charAt(i) == f && facing == "WEST") {
				pos_x =- 1;			
			} else if (command.charAt(i) == f && facing == "EAST") {
				pos_x =+ 1;			
			}
			
			else if (command.charAt(i) == b && facing == "NORTH") {
				pos_y =- 1;
			} else if (command.charAt(i) == b && facing == "SOUTH") {
				pos_y =+ 1;
			} else if (command.charAt(i) == b && facing == "WEST") {
				pos_x =+ 1;
			} else if (command.charAt(i) == b && facing == "EAST") {
				pos_x =- 1;
			}
			else if (command.charAt(i) == r && facing == "NORTH") {
					facing = "EAST";		
				} else if (command.charAt(i) == r && facing == "EAST") {
					facing = "SOUTH";
				} else if (command.charAt(i) == r && facing == "SOUTH") {
					facing = "WEST";
				} else if (command.charAt(i) == r && facing == "WEST") {
					facing = "NORTH";
				}
					if (command.charAt(i) == l && facing == "NORTH") {
						facing = "WEST";
					} else if (command.charAt(i) == l && facing == "WEST") {
						facing = "SOUTH";
					} else if (command.charAt(i) == l && facing == "SOUTH") {
						facing = "EAST";
					} else if (command.charAt(i) == l && facing == "EAST") {
						facing = "NORTH";
					}
			
		}
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return ("" +pos_x+ "," +pos_y+ "," + facing);
	}
}
