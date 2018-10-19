import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {
    protected List<String> toppings;

    public Pizza(){
        super("Pizza", 45);
        toppings = new ArrayList<>();
    }

    public void addTopping (String topping){
        toppings.add(topping);
        price+= 10;
    }

    @Override
    public void display(){
        System.out.print(price + " kr "+name+" { ");
        String separator = "";
        for (String top : toppings) {
            System.out.print(separator);
            System.out.print(top);
            separator = ", ";    // after first iteration, a space between the words
        }
        System.out.println(" }");

    }

    public void setName(String name){
        this.name = name;
    }
}
