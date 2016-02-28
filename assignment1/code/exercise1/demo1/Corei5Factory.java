
package exercise1.demo1;

public class Corei5Factory implements ProcessorFactory {

	@Override
	public Processor createProcessor() {
		return new Corei5();
	}

}
