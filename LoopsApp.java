//TASK 1:
public class LoopsApp {
    public static void main(String[] args){
         int i;
         for(i=1; i<5000; i=2*i+1){
              System.out.println("Count is: " + i);
         }
    }

}

//TASK 2:

// First, in line 1, the “LoopsApp” class is created. Then, the main method is created. This is all quite basic. Thirdly, an integer “int” named “i” is initiated. (Using the name of “i” for the integer in a for loop is traditional.) Fourthly, the for loop itself is defined. Inside the set of round brackets, there are three pieces of information, separated by semicolons, which define how many times the code in the curly braces will be run. The first piece of information sets an initial value for i, the second has a logical test (when the results of this test are true the code in the curly braces will be run), and the third has a mathematical equation which will change the value of i each time the code runs. Finally, on the fifth line of code, enclosed in curly braces we have the code that is executed when the logical test in the round brackets is true. Which in this case, is a println statement which prints the string “Count is: “ and then concatenates on the value of i.
// Code Output:

// The first time our code runs i is 1. 1 is less than 5,000, so “Count is: 1” is printed. i is then set to 2*1+1 which is 3. So the second time our code runs i is 3. 3 is still less than 5,000, so “Count is: 3” printed. i is then set to 2*3+1, which is 7. 7 is less than 5,000, so our code will run a third time. This repeats until the value of i is equal to or greater than 5,000, when the program ends.


