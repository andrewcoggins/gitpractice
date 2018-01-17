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
  
  // adds 9 to a number.
  public void addNine() {
    this.num = num + 9; 
  }
  
  // adds 11 to a number
  public void addEleven(){
    this.num = num+11;
  }
  
  //add 12 to a number
  public void addTwelve() {
    this.num = num + 12; 
  }
}