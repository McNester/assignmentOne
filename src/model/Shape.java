package model;


import java.util.ArrayList;

public class Shape {

    private ArrayList <Point> pointsList = new ArrayList<>();





    public double calculatePerimetr(){
        double perimetr = 0;
        for (int i = 0; i < pointsList.size()-1; i++) {
           perimetr += pointsList.get(i).getDistance(pointsList.get(i+1));
        }
        perimetr += pointsList.get(pointsList.size()-1).getDistance(pointsList.get(0));

        return perimetr;

    }

    public double getLongest(){

        double maxDistance = Double.MIN_VALUE;
        double currentDistance = -1;
        for (int i = 0; i < pointsList.size()-1; i++) {
            currentDistance = pointsList.get(i).getDistance(pointsList.get(i+1));
            if(currentDistance > maxDistance){
                maxDistance = currentDistance;
            }
        }
        currentDistance = pointsList.get(pointsList.size()-1).getDistance(pointsList.get(0));
        if(currentDistance > maxDistance){
            maxDistance = currentDistance;
        }

        return maxDistance;


    }



    public void addPoint(Point point){
        pointsList.add(point);
    }
    public void removePointById(int id){
        pointsList.remove(id);
    }
    public void updatePointById(int id,Point point){
        pointsList.set(id,point);
    }
    public Point getPoinById(int id){
        return pointsList.get(id);
    }


}
