package chapter11;

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    /**
     * default method if a new method is added to interface later on.
     * This is to prevent breaking the code of the classes that implement the interface.
     */
    default String getBarcode() {
        return "no barcode";
    }
}
