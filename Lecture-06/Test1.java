// interface Drawable{  
//     public void draw();  
//     }  
//     public class Test {  
//     public static void main(String[] args) {  
//     int width=10;  
//     Drawable d=new Drawable(){  
//     public void draw(){System.out.println("Drawing "+width);}};  d.draw();}}

interface Drawable {
    public void draw();
}

public class Test1 {
    public static void main(String[] args) {
        int width = 10;
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}