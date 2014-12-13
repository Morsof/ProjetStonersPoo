class Direction {
	private int x,y;
	boolean isCorrect;
	Direction(int x, int y) {
		this.x=x;
		this.y=y;
		if((x<2 && x>-2) && (y<2 && y>-2)){
			this.isCorrect=true;
		}else{
			this.isCorrect=false;
		}
	}
	Direction(Direction d){
		this.x=d.x;
		this.y=d.y;
	}
	
	void setX(int x){
		this.x=x;
	}
	void setY(int y){
		this.y=y;
	}
	int getX(){
		return this.x;
	}
	int getY(){
		return this.y;
	}
}