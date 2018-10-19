import java.util.ArrayList;
import java.util.List;

public class Order implements CreditCard {
    protected List<Food>ordered;

    public Order(){
        ordered = new ArrayList<>();
    }

    public void addFood(Food food){
        ordered.add(food);
    }

    public int total(){
        int total = 0;

        for(Food food:ordered){
            total += food.getPrice();
        }
        return total;
    }

    public void display(){
        for(Food food:ordered){
            food.display();
        }

        System.out.println(total() + " kr TOTAL");
    }

    public boolean payWith(CreditCard card){
        if(card.withdraw(total())){
            return true;
        }else {
            System.out.println("ERROR: Payment failed");
            return false;
        }
    }

    public boolean withdraw(int amount){
        if(amount > 0){
            return true;
        }else {
            return false;
        }
    }
}
