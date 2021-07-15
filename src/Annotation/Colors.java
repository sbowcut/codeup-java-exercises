package Annotation;

class Red {
    public void show(){
        System.out.println("I am Red");
    }

}

class Orange extends Red{
    @Override // comments for the compiler // it checks to see if that comment is doing
    // what it's supposed to

    // hey this method should be overriding the method in its parent class of red
    public void show(){
        System.out.println("I am Orange");
    }
}
 public class Colors {
     public static void main(String[] args) {
         Red redobj = new Red();
         Orange orangeobj = new Orange();
         redobj.show();
         orangeobj.show();
     }
 }