package reply.model;

public class Snake {
	int length;
	Coord[] body;
	int value;
	Coord startingPoint;
	Coord currPos;
	
	public Coord getCurrPos() {
		return currPos;
	}

	public void setCurrPos(Coord currPos) {
		this.currPos = currPos;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Coord[] getBody() {
		return body;
	}

	public void setBody(Coord[] body) {
		this.body = body;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Coord getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(Coord startingPoint) {
		this.startingPoint = startingPoint;
	}

	public Snake(int length) {
		this.length = length;
		body = new Coord[length];
		value = 0;
	}
}
