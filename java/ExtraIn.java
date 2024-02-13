public class ExtraIn {
    public static void main(String[] args) {
        Square s=new Square();
        Rectangle R=new Rectangle();
        Circle c=new Circle();
        s.l=10;
        R.l=10;
        R.b=20;
        c.r=10;
        System.out.println(s.area());
        System.out.println(R.area());
        System.out.println(c.area());        
    }    
}
class Shape{
    int edge;
    int vertex;
    String color;
}
class Square extends Shape{
    int l;
    double area(){
        return l*l;
    }
}
class Rectangle extends Shape{
    int l,b;
    double area(){
        return l*b;
    }
}
class Circle extends Shape{
    int r;
    double area(){
        return Math.PI*r*r;
    }
}
