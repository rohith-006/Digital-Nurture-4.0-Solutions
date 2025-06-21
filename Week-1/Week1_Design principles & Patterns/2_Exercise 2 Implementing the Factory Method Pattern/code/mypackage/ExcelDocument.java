package mypackage;

public class ExcelDocument implements Document {

	@Override
	public void open() {
		System.out.println("Excel Document is opened");
	}

	@Override
	public void save() {
		System.out.println("Excel Document is saved");
	}

	@Override
	public void close() {
		System.out.println("Excel Document is closed");
	}

}
