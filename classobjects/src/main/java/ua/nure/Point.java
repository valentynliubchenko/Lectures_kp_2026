package ua.nure;

public record Point(int x, int y) {
    public Point {
        if(x>100)
            x =100;
        if(y>50)
            y =50;
    }
    static Point getPoint(int x, int y) {
        return new Point(x, y);
    }


    static double distance(Point a, Point b) {
        int dx = a.x() - b.x();
        int dy = a.y() - b.y();
        return Math.sqrt(dx * dx + dy * dy);
    }
//    @Override
//    public String toString() {
//        return "My Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
}
