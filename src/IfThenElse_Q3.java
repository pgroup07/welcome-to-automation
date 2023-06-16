public class IfThenElse_Q3 {
    /**
     * 3.1 Create the class with the name "IfThenElse_Q3"
     * 3.2 Create a method with the name "isTeen" with a boolean return type and one parameter with type int and name "age".
     * 3.3 Write the logic into the "isTeen" method. if the age is less than or equal to 18 then return 'true'
     * else return 'age'.
     * 3.4 Create the main method
     * 3.5 Create the Object and call the 'isTeen' method inside the sout statement.
     * Output
     * 15  - true
     * 25  - false
     *
     * @param age
     * @return
     */
    public static boolean isTeen(int age) {

        if (age <= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isTeen(15));
        System.out.println(isTeen(25));
    }
}
