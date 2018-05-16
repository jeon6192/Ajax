package ex10_9.geometry_common;

public class Polygon {
	public int[] x;
	protected int[] y;
	protected Polygon(int vertexNum) {	// 꼭지점 개수
		x=new int[vertexNum];
		y=new int[vertexNum];
	}
	protected void setPoint(int index, int x, int y) {
		this.x[index]=x;
		this.y[index]=y;
	}
	

}
