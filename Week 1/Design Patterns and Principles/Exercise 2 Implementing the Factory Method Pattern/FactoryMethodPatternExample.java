interface Document{
    void open();
    void save();
}
class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening Word document...");
    }
    @Override
    public void save(){
        System.out.println("Saving Word document...");
    }
}
class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening PDF document...");
    }
    @Override
    public void save(){
        System.out.println("Saving PDF document...");
    }
}
class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening Excel document...");
    }
    @Override
    public void save(){
        System.out.println("Saving Excel document...");
    }
}
abstract class DocumentFactory{
    public abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}
public class FactoryMethodPatternExample{
    public static void main(String[] args){
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();
        System.out.println("Testing Word Document:");
        wordDoc.open();
        wordDoc.save();
        System.out.println("\nTesting PDF Document:");
        pdfDoc.open();
        pdfDoc.save();
        System.out.println("\nTesting Excel Document:");
        excelDoc.open();
        excelDoc.save();
    }
}
