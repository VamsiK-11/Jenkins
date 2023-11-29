public class Main{
    static void checkAge(int age){
        if(age<18){
            System.out.println("not eligibe");
        }
        else{
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args){
        checkAge(18);

    }
}