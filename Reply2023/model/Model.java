import java.util.Collections;

public class Model {
	private int[][] gameboard;
	int gameboardSizeX, gameboardSizeY;
	Coord currCoord = new Coord;
	
	public Model(int[][] gameboard, int gameboardSizeX, int gameboardSizeY){
		this.gameboard = gameboard;
		this.gameboardSizeX = gameboardSizeX;
		this.gameboardSizeY = gameboardSizeY;
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
}
