public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point p1){
        return Math.sqrt((x - p1.x)*(x - p1.x) + (y - p1.y)*(y - p1.y));
    }
    public double distance(int a, int b){
        return Math.sqrt((x - a)*(x - a) + (y - b)*(y - b));
    }
}
