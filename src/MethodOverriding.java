public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m2();
        // Parent class reference can hold child class object
        // Usage of parent reference to hold child class object is an example of polymorphism
        Parent p1 = new Child();
        p1.m1();
        p1.m2();
        p1.m4();// op: child class method
        // Child class reference cannot be used to hold parent class object
        //Child c = new Parent();
        Child c = new Child();
        c.m1();
        c.m3();
        c.m5();
    }
}

class Parent{
    public void m1(){
        System.out.println("We cannot decrease the scope of a method during override," +
                "though we can increase it");
    }
    public void m2(){
        System.out.println("Parent class reference holding parent class object" +
                            "can be used to call only parent class method");
    }
    public void m4(){
        System.out.println("parent class method");
    }

    public void m5() {
        System.out.println("Child class reference holding child class object can call" +
                            "parent as well as child class-specific methods.");
    }

}
class Child extends Parent {
    //Gives compile time error, since we cannot decrease the scope of a method during override.
//    protected void m1(){
//        System.out.println("Can we decrease the scope of a method during override? No");
//    }
    // This method cannot be called by a parent class object
    public void canParentClassObjectCallChildClassMethod() {
        System.out.println(" Parent Class Object cannot Call Child Class Method.");
    }

    // This method cannot be called by a parent class reference holding Child Class Object
    public void m2() {
        System.out.println(" Can Parent Class reference holding Child Class Object call child class method?" +
                "Yes if it is overridden.");
    }

    public void m3() {
        System.out.println(" Can Parent Class reference holding Child Class Object call child class specific-method? No");
    }

    // If a method present in both parent AWA child class,
    // the child class method is called by parent class reference holding child class object
    public void m4() {
        System.out.println("Child class method");
    }
}