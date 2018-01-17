package practice;

/**
 * this is for practice.
 * @author andrew
 *
 */
public  class Prac {
  
  private int num; 
  
  public Prac(int aNum) {
    this.num = aNum; 
  }
  
  //the purpose of this is to print a number. 
  public void printNum() {
    System.out.println(num);
  }
  
  // adds 5 to number
  public void addFive() {
    this.num = this.num + 5;
  }
  
  // adds 7 to a number.
  public void addSeven() {
    this.num = num + 7; 
  }
}