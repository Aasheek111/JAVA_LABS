
public class Main {

    public static void main(String[] args){


    Shape[] shape = new Shape[2];

    shape[0]=new Circle();
    shape[1]=new Rectangle();

    for (Shape s: shape){
        s.display();
        s.calculateare();

    }
    }

    
}
