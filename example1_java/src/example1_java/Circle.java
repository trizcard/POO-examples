package example1_java;

public class Circle {
    private float radius;
    private float x;
    private float y;
    private String color;
    
    public void init(float nRadius, float nX, float nY, String nColor){
        radius = nRadius;
        x = nX;
        y = nY;
        color = nColor;
    }
    
    public void changeRadius(float nRadius, boolean op){
        if(op){
            radius =+ nRadius;
        }
        else{
            radius =- nRadius;
        }
    }
    
    public void changeX(float nX, boolean op){
        if(op){
            x =+ nX;
        }
        else{
            x =- nX;
        }
    }
    
    public void changeY(float nY, boolean op){
        if(op){
            y =+ nY;
        }
        else{
            y =- nY;
        }
    }
    
    public void changeColor(String nColor){
        color = nColor;
    }
    
    public float returnRadius(){
        return radius;
    }
    
    public String returnColor(){
        return color;
    }
    
    public void showCircle(){
        System.out.println("Radius: " + radius);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Color: " + color);
    }
}