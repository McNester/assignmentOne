package model;

public class Point {
    private double x;
    private double y;
    private int id;


    public Point(double x, double y){
        setX(x);
        setY(y);
        setId();
    }

    public double getDistance(Point dest){
        double x2 = dest.getX();
        double y2 = dest.getY();

        double x1 = this.x;
        double y1 = this.y;

        double firstEq = x2 - x1;
        double secondEq = y2 - y1;

        double distance = Math.sqrt( Math.pow(firstEq,2) + Math.pow(secondEq,2) );

        return distance;

    }


    @Override
    public String toString() {
        return "X value: "+ this.x+"\n"+"Y value: "+ this.y +"\n"+ "Point id: "+ this.id;
    }



    //get and set

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = (int) System.currentTimeMillis();
    }
}
