
package exercise1.demo1;

public class Demo1 {

	private Processor processor;

	public void createProcessor(final ProcessorFactory factory) {
		setProcessor(factory.createProcessor());

	}

	public Corei5Factory getCorei5Factory() {
		return new Corei5Factory();
	}

	public Corei7Factory getCorei7Factory() {
		return new Corei7Factory();
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public Processor getProcessor(){
		return processor;
	}

	public static void main(String[] args) {

		Demo1 app = new Demo1();

		System.out.println("Core i5 example");
		ProcessorFactory i5;
		i5 = app.getCorei5Factory();
		app.createProcessor(i5);
		System.out.println(app.getProcessor().getDescription());
		

		System.out.println("Core i7 example");
		ProcessorFactory i7;
		i7 = app.getCorei7Factory();
		app.createProcessor(i7);
		System.out.println(app.getProcessor().getDescription());

	}

}
