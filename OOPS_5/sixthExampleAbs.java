// Online Book Store Using OOPS

interface DigitalBook {
    void download();
}

interface PhysicalBook {
    void ship();
}

class Ebook implements DigitalBook {
    public void download() {
        System.out.println("Ebook is Downloading !!");
    }
}

class HardCoverBook implements PhysicalBook {
    public void ship() {
        System.out.println("HardCover Book is Shipping !!");
    }
}

public class sixthExampleAbs {
    public static void main(String[] args) {
        DigitalBook book1 = new Ebook();
        book1.download();
        System.out.println();
        PhysicalBook book2 = new HardCoverBook();
        book2.ship();
    }
}