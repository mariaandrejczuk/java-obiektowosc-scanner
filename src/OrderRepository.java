public class OrderRepository {
    Order[] orders;
    int index = 0;

    OrderRepository(int size) {
        this.orders = new Order[size];
    }

    void add(Order order) {
        orders[index++] = order;
    }
}
