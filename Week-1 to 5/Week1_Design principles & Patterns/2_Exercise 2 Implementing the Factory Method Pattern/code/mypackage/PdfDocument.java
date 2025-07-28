package mypackage;

public class PdfDocument implements Document{

	@Override
	public void open() {
		System.out.println("Pdf Document is opened");
	}

	@Override
	public void save() {
		System.out.println("Pdf Document is saved");
	}

	@Override
	public void close() {
		System.out.println("Pdf Document is closed");
	}

}
