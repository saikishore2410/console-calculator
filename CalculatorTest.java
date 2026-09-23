public class CalculatorTest {
  static void check(boolean x,String m){if(!x)throw new AssertionError(m);}
  public static void main(String[] a){
    check(Calculator.add(2,3)==5,"add");
    check(Calculator.subtract(7,2)==5,"subtract");
    check(Calculator.multiply(4,3)==12,"multiply");
    check(Calculator.divide(8,2)==4,"divide");
    check(Double.isNaN(Calculator.divide(8,0)),"zero division");
    System.out.println("Calculator tests passed");
  }
}