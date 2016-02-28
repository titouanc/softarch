
package exercise1.demo1;

public class Corei7Factory implements ProcessorFactory {

	@Override
	public Processor createProcessor() {
		return new Corei7();
	}

  

}
