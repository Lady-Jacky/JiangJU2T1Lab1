public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int coordinate) {
        x = coordinate;
        y = coordinate;
    }

    public Point() {
        x = 0;
        y = 0;
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

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "The point is in quadrant 1.";
        } else {
            if (x < 0 && y > 0) {
                return "The point is in quadrant 2.";
            } else {
                if (x < 0 && y < 0) {
                    return "The point is in quadrant 3.";
                } else {
                    if (x > 0 && y < 0) {
                        return "The point is in quadrant 4.";
                    } else {
                        if (x == 0 && y != 0 || x != 0 && y == 0) {
                            return "The point is on an axis.";
                        } else {
                            return "The point is on the origin.";
                        }
                    }
                }
            }
        }
    }
}
