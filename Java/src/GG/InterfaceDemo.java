interface Animal{
    public void eat();

}
class Dog implements Animal{
    public void eat(){
        System.out.println("The dog barks");
    }


}
class InterfaceDemo{
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.eat();

    }
}