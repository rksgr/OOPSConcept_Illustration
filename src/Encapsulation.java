public class Encapsulation {
    public static void main(String[] args) {
        UserClass uc = new UserClass();

        //System.out.println(uc.userAge);// CTE due to variable being private in another class
        //uc.userAge = 21;// CTE due to variable being private in another class
        // Need to use getters and setters to fetch and change various attributes
        System.out.println("User age is: "+ uc.getUserAge());
        uc.setUserAge(21);
        System.out.println("user age changed to: "+ uc.getUserAge());
    }
}

class UserClass{
    private int userAge = 19;
    private String userAddr;

    public int getUserAge(){
        return userAge;
    }
    public void setUserAge(int userAge){
        this.userAge = userAge;
    }
}
