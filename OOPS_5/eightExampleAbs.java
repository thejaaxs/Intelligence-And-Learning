// File Handler Using OOPS 
interface FileHandler5 {
    void readFile();

    void writeFile();

    void deleteFile();
}

class TextFileHandler5 implements FileHandler5 {
    @Override
    public void readFile() {
        System.out.println("Reading text file...");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing to text file...");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting text file...");
    }
}

public class eightExampleAbs {
    public static void main(String[] args) {
        FileHandler5 act1 = new TextFileHandler5();
        // System.out.println();
        act1.deleteFile();
        // System.out.println();
        act1.writeFile();
        // System.out.println();
        act1.readFile();
    }
}
