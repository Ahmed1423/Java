// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Figure {
    
    double length;
    double width;
    
    Figure() {
        this.length = 0;
        this.width = 0;
    }
    
    Figure(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    void area() {
        System.out.println("Figure is an abstract thing, implementation would not exist");
    }
    
}

class Rectangle extends Figure{
    Rectangle() {
        super();
    }
    
    Rectangle(double length, double width) {
        super(length, width);
    }
    
    void area() {
        System.out.println(this.length * this.width);
    }
}

class Triangle extends Figure{
    Triangle() {
        super();
    }
    
    Triangle(double length, double width) {
        super(length, width);
    }
    
    void area() {
        System.out.println((this.length * this.width) / 2);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        
        Rectangle r1 = new Rectangle(2, 4);
        r1.area();  
        
        Triangle t = new Triangle();
        t.area();
        
        Triangle t1 = new Triangle(3, 6);
        t1.area();
    }
}