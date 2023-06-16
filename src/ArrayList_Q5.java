public class ArrayList_Q5 {
    /**
     * 5.1 Create the class with the name "ArrayList_Q5"
     * 5.2 Create the main method
     * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
     * 5.4 Print the list using a forEach loop.
     * <p>
     * Output
     * Scrum
     * Java
     * Jira
     * Selenium
     * Cucumber
     * Postman
     * Rest Assured
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] arrName = {"Java ", "Jira ", "Selenium ", "Cucumber ", "Postman ", "Rest Assured " };
        for (String s : arrName) {
            System.out.println(s);


        }
    }
}