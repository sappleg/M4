package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Derrek Keyser
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should take the string
     * input and return its characters rotated
     * 1 position.
     * given "gtg123b" it should return
     * "tg123bg".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
    	char[] x = input.toCharArray();
        
        for(int i = 0; i > x.length; i++){
      	  int num1 = (int) (Math.random() * x.length);
      	  int num2 = (int) (Math.random() * x.length);
      	  char temp1 = x[num1];
      	  char temp2 = x[num2];
      	  
      	  x[num1] = temp2;
      	  x[num2] = temp1;
        }
        
        String endString = new String(x);
        return endString;
      return null;
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

