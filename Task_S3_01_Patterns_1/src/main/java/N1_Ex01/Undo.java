package N1_Ex01;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<Integer> orderList;

    private Undo() {
        orderList = new ArrayList<>();

    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }


    public String addOrder(int newOrder) {
        orderList.add(newOrder);
        String answer = "Added successfully";
        System.out.println(answer);
        return answer;

    }

    public void deleteOrder(int orderNum) {
        orderList.removeIf(order -> order == orderNum);
        String answer = "Deleted successfully";
        System.out.println(answer);

    }

    public String getlistOrders() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < orderList.size(); i++) {
            result.append("Pedido ").append(i + 1).append(": ").append(orderList.get(i)).append("\n");
        }
        String resultString = result.toString();
        return resultString;
    }
}


