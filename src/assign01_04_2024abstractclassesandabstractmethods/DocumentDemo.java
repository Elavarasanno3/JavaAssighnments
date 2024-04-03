package assign01_04_2024abstractclassesandabstractmethods;

abstract class Document {

    private String title;

    public Document(String title) {
        this.title = title;
    }

    public abstract String getFileType();

    public String getTitle() {
        return title;
    }

    public void printDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("File Type: " + getFileType());
    }
}

class PDFDocument extends Document {

    public PDFDocument(String title) {
        super(title);
    }

    @Override
    public String getFileType() {
        return "PDF";
    }
}

class TextDocument extends Document {

    public TextDocument(String title) {
        super(title);
    }

    @Override
    public String getFileType() {
        return "Text";
    }
}

class ImageDocument extends Document {

    public ImageDocument(String title) {
        super(title);
    }

    @Override
    public String getFileType() {
        return "Image";
    }
}

public class DocumentDemo {

    public static void main(String[] args) {
        Document pdfDocument = new PDFDocument("My Report");
        Document textDocument = new TextDocument("My Notes");
        Document imageDocument = new ImageDocument("Scenery");

        pdfDocument.printDetails();
        textDocument.printDetails();
        imageDocument.printDetails();
    }
}
