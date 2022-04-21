package za.ac.wsu.s221760571;
/**
 * @author P MAJEZI 221760571
 */
public class Circle {
    private float radius;
    private int x;
    private int y;
    
    public Circle(){
        this.radius = 0;
        this.x = 0;
        this.y = 0;
    }
    
    public Circle(float radius, int x, int y) {
        if (radius < 0) {
            System.out.println("Radius cannot be less than zere");
        } else {
            this.radius = radius; 
            
        }
        this.x = x;
        this.y =y;
    }
    
    public void setRadius(float radius){
        if (radius < 0){
            System.out.println("Radius cannot be less than zero");
        } else {
            this.radius = radius;
        }
    }

    public void setX(int x){
        this.x = x; 
    }
    public void setY(int y){
        this.y = y;
    }
    public float getRadius() {
        return radius;
    }
    public int getX(){
        return x; 
    }
    public int getY(){
        return y;
    }
    public float calculateArea(){
        float area;
        area = (float) (this.radius * this.radius) * (float) Math.PI;
        return area;
    }
    public float calculateCircumference(){
        float circumference;
        circumference = 2 * (float) Math.PI * this.radius;
        return circumference;
    }
    public float calculateDiameter(){
        return 2 * this.radius;
    }
    @Override
    public String toString(){
        return "Circle with " + "radius = " + radius + ", x = " + x + ", y = "+ y;
    }  
}
