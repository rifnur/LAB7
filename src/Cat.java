public class Cat {
    private String name;
    private int appetite;
    private boolean staiety;
    public Cat (String name, int appetite, boolean staiety){
        this.name = name;
        this.appetite = appetite;
        this.staiety = staiety;
    }
    public void eat(Plate p) {
        p.decreaseFood(name,appetite);
    }

     public boolean isStaiety() {
        staiety=true;
        return staiety;
    }
}
