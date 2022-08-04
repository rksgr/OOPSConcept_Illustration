public class OverridingVariables {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        System.out.println(p1.num);// op: 100

        Child1 c1 = new Child1();
        System.out.println(c1.num); // op: 700

        // Overriding concept not applicable to variables
        Parent1 p2 = new Child1();
        System.out.println(p2.num);// op: 100
    }
}
class Parent1{
    int num = 100;
}
class Child1 extends Parent1{
    int num = 700;
}
