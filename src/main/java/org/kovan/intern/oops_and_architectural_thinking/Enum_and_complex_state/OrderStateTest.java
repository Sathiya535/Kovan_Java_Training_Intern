package org.kovan.intern.oops_and_architectural_thinking.Enum_and_complex_state;

enum OrderState {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED
}

class Order {

    private OrderState state = OrderState.NEW;

    public OrderState getState() {
        return state;
    }

    // control valid state transitions
    public void changeState(OrderState nextState) {

        if (
                (state == OrderState.NEW && nextState == OrderState.PROCESSING) ||
                        (state == OrderState.PROCESSING && nextState == OrderState.SHIPPED) ||
                        (state == OrderState.SHIPPED && nextState == OrderState.DELIVERED)
        ) {
            state = nextState;
            System.out.println("Order moved to: " + state);
        } else {
            System.out.println("Invalid transition: " + state + " -> " + nextState);
        }
    }
}

// Test class
public class OrderStateTest {
    public static void main(String[] args) {

        Order order = new Order();

        order.changeState(OrderState.DELIVERED);   //  Invalid
        order.changeState(OrderState.PROCESSING);  //  Valid
        order.changeState(OrderState.SHIPPED);     //  Valid
        order.changeState(OrderState.DELIVERED);   //  Valid
    }
}

