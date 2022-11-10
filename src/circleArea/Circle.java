package circleArea;

public class Circle {
    double radius,area;
    public double areaByRadius(){
        area=Math.PI*radius*radius;
        return area;
    }
    public double areaByCircumference(double circumference){
        area=(circumference*circumference)/(4*Math.PI);
        return area;
    }
    public double AreaByDiameter(double diameter) {
        area = (Math.PI / 4)* (diameter * diameter);
        return area;
    }

    public double CircleAreaByDiameter(double diameter) {
        radius = diameter/2;
        area = Math.PI * radius * radius;
        return area;
    }

}
