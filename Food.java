public class Food {
    protected int price;
    protected String name;

    public Food(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println(price + " kr " + name);
    }
}
