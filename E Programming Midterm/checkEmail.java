public class checkEmail {
//Ask a user to enter an email address
// Allow the user to keep on entering an email address until the email address is valid
//To check if the email is valid:
//1. An Email address must contain "@"
//2. An Email address must contain "."


    public static void main(String[] args) {
      String email;
      System.out.println("Please enter an email: ");
      //to read user input you use readLine.
      email = System.console().readLine();

      //Inster code here.
      //hint: Use While loop to solve the problem.  

    }



/*Output Example
    Please enter an email: 
    gleven
    you enter an invalid email
    Please re-enter an email:
    gleven@
    you enter an invalid email
    Please re-enter an email:
    gleven@gmail.com
    gleven@gmail.com is a valid email
*/
}
