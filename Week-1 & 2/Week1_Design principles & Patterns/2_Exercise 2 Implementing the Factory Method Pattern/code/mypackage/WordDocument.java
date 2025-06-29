package mypackage;

public class WordDocument implements Document {

	@Override
	public void open() {
		   System.out.println("Word Document is opened");
	}

	@Override
	public void save() {
		System.out.println("Word Document is saved");
	}

	@Override
	public void close() {
		   System.out.println("Word Document is closed");
	}
	
}
