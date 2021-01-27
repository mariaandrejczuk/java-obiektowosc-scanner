public class Order {
    String name;
    String text;
    int quantity;

    public Order(String name, String text, int quantity) {
        this.name = name;
        this.text = text;
        this.quantity = quantity;
    }
    void display(){
        System.out.println(name+" | "+text+" | "+quantity);
        //System.out.println("Text: "+text);
        //System.out.println("Quantity: "+quantity);
    }
}
