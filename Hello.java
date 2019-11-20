package hello;
// Java code for Stream map(Function mapper) 
// to get a stream by applying the 
// given function to this stream. 
import java.util.*; 
  
class Hello { 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        System.out.println("The stream after applying "
                           + "the function is : "); 
  
        // Creating a list of Integers 
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream 
        list.stream().map(number -> number * 3).forEach(System.out::println); 

        Lecturer l = new Lecturer("spankie", "male", "Nigerian", "2018-04-18", "Mr.", 123, 20000, 3);
        System.out.println(l.getName());
        System.out.println(l.getNationality());
        System.out.println(l.bioData());
        System.out.println(l.Salary());
    } 
}
