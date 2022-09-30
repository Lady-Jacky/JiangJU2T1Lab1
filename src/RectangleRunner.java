public class RectangleRunner {
    public static void main (String[] args){
        Rectangle rec1 = new Rectangle(150, 200);
        Rectangle rec2 = new Rectangle(125);
        Rectangle rec3 = new Rectangle();

        rec1.setWidth(75);
        rec2.setWidth(75);
        rec3.setWidth(75);

        int area1 = rec1.calculateArea();
        int area2 = rec2.calculateArea();
        int area3 = rec3.calculateArea();
        int totalArea = area1 + area2 + area3;

        System.out.println(rec1.calculateArea());
        System.out.println(rec2.calculateArea());
        System.out.println(rec3.calculateArea());
        System.out.println("These 3 plots requires " + totalArea + " square feet of seeds.");

    }
}
