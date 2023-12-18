import java.util.Scanner;
import model.Point;
import model.Shape;
import java.io.File;
import java.io.FileNotFoundException;
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/serafimbronnikov/IdeaProjects/courseAITU/src/source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNextLine()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x,y);
            shape.addPoint( point );
        }
        System.out.println(shape.calculatePerimetr());
        System.out.println(shape.getLongest());

        Point point1 = new Point(1,2);
        System.out.println(point1);
    }
}