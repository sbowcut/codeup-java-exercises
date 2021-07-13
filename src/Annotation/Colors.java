package Annotation;

class Red {
    public void show(){
        System.out.println("I am Red");
    }

}

class Orange extends Red{
    @Override
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