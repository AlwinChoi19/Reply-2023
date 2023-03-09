import java.util.Collections;

public class Model {
	private int[][] gameboard;
	int gameboardSizeX, gameboardSizeY;
	int[] availableRatings;
	Coord currCoord = new Coord;
	
	public Model(int[][] gameboard, int gameboardSizeX, int gameboardSizeY){
		this.gameboard = gameboard;
		this.gameboardSizeX = gameboardSizeX;
		this.gameboardSizeY = gameboardSizeY;
		this.availableRatings = getAvailableRatingsSorted();
	}
	
	public int[] getAvailableRatingsSorted() {
		ArrayList<int> list = new ArrayList<>();
		for(int i = 0; i < gameboardSizeX; i++) {
			for(int j = 0; j < gameboardSizeY; j++) {
				if(list.contains(gameboard[i][j])) {
					continue;
				}
				list.add(gameboard[i][j]);
			}
		}
		Collections.sort(list);
		int[list.size()] arr = new int[];
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	
	public Coord[] getRatings(int val){
		ArrayList<Coord> list = new ArrayList<>();
		for(int i = 0; i < gameboardSizeX) {
			for(int j = 0; j < gameboardSizeY) {
				if(gameboard[x][y] == val) {
					list.add(new Coord(x,y));
				}
			}
		}
		return list.toArray(Coord[]::new);
	}
	
	public int getValAtPos(int x, int y) {
		return gameboard[x][y];
	}
	
	public Coord getNearestCoordWithValue(Coord coord, int val) {
		int[] wallsDist = new int[4];
		/*
		 * 0 => dist to left wall
		 * 1 => dist to upper wall
		 * 2 => dist to right Wall
		 * 4 => dist to lower Wall
		 */
		wallsDist[0] = coord.getX();
		wallsDist[1] = coord.getY();
		wallsDist[2] = gameboardSizeX - coord.getX();
		wallsDist[3] = gameboardSizeY - coord.getY();
		Coord[] ratings = getRatings(val);
		
		for(int i = 0; i < getIndexOfSmallestVal(wallsDist); i++) {
			
		}
		
	}
	
	private int euklidDist(int x1, int x2, int y1, int y2) {
		
	}
	
	public int getIndexOfSmallestVal(int[] arr) {
		int tmp = Integer.MAX_VALUE;
		int tmpIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < tmp) {
				tmp = arr[i];
				tmpIndex = i;
			}
		}
		return tmpIndex;
	}
	
	public Coord getCoord(Coord currPos, int deltaX, int deltaY) {
		int xPos = getXCoord(currPos, deltaX);
		int yPos = getYCoord(currPos, deltaY);
		
		return new Coord(xPos, yPos);
	}
	
	public int getXCoord(Coord currPos, int deltaX) {
		int xPos = currPos.getX();
		
		if(xPos + deltaX > gameboardSizeX - 1) {
			xPos = xPos + deltaX % gameboardSizeX;
		}else if(xPos + deltaX < 0){
			xPos = Math.abs(gameboardSizeX - (xPos - deltaX));
		}else {
			xPos += deltaX;
		}
		return xPos;
	}
	
	public int getYCoord(Coord currPos, int deltaY) {
		int yPos = currPos.getY();
		
		if(yPos + deltaY > gameboardSizeY - 1) {
			yPos = (yPos + deltaY) % gameboardSizeX;
		}else if(yPos + deltaY < 0){
			yPos = Math.abs(gameboardSizeY - (yPos - deltaY));
		}else {
			yPos += deltaY;
		}
		
	}
}
