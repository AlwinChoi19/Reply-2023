package reply.model;

public class Snake {
	int length;
	Coord[] body;
	int value;
	
	public Snake(int length) {
		this.length = length;
		body = new Coord[length];
		value = 0;
	}
}
