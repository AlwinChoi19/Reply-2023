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
	
	public Coord getCoord(Coord currPos, int deltaX, int deltaY) {
		int xPos = currPos.getX();
		int yPos = currPos.getY();
		
		if(xPos + deltaX > gameboardSizeX - 1) {
			xPos = xPos + deltaX % gameboardSizeX;
		}else if(xPos + deltaX < 0){
			xPos = Math.abs(gameboardSizeX - (xPos - deltaX));
		}else {
			xPos += deltaX;
		}
		
		if(yPos + deltaY > gameboardSizeY - 1) {
			yPos = (yPos + deltaY) % gameboardSizeX;
		}else if(yPos + deltaY < 0){
			yPos = Math.abs(gameboardSizeY - (yPos - deltaY));
		}else {
			yPos += deltaY;
		}
		return new Coord(xPos, yPos);
	}
}
