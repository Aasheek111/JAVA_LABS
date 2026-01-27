public class MethodOverloadin {

    private int number;
    private String name;

    MethodOverloadin(int number){
        this.number=number;
        System.out.println(number);

    }
    MethodOverloadin(int number,String name){
        this.number=number;
        this.name=name;
        System.out.println(number);
        System.out.println(name);

    }

    public static void main(String[] args) {
        
        MethodOverloadin m1= new MethodOverloadin(1);
        MethodOverloadin m2= new MethodOverloadin(2,"GOD");


    }

    
}
