import java.util.Scanner;

public class ForLoop_Q4 {
    /**
     * Question:4 - Marks:4
     * 4.1 Create the class with the name "ForLoop_Q4"
     * 4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
     * 4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
     * 4.4	Create the main method
     * 4.5 Create the Object and call the 'printMyName' method into the main method.
     *
     * @param name
     * @param howManyTime
     */
    public void printMyName(String name, int howManyTime) {

        for (int i = 0; i < howManyTime; i++) {
            System.out.println("Kuntal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many time to irreate : ");
        int num = sc.nextInt();
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Kuntal", num);
    }
}
