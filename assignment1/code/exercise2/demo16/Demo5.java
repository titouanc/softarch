
package exercise2.demo16;

public class Demo5 {

  public static void main(String[] args) {
	   
    System.out.println("Walter Johnson, the best pitcher of all time!");
    Pitcher walterJohnson = new Pitcher(new CutterFastBall());
    System.out.println("Give me a cutter!");
    walterJohnson.throwBall();
    System.out.println("Give me a slider!");
    walterJohnson.changePitchType(new SliderBreakingBall());
    walterJohnson.throwBall();
    System.out.println("Give me a fosh!");
    walterJohnson.changePitchType(new FoshChangeup());
    walterJohnson.throwBall();

    // Using Java 8 features. Lambdas
    System.out.println("Give me a sluver!");
    walterJohnson.changePitchType(
    		() -> System.out.println("Slurve!"));
    walterJohnson.throwBall();
    
    System.out.println("Give me a sinker!");
    walterJohnson.changePitchType(
    		() -> System.out.println("Sinker!"));
    walterJohnson.throwBall();
    
    walterJohnson.changePitchType(() -> System.out.println("Bite!"));
    walterJohnson.throwBall();
  }
}
