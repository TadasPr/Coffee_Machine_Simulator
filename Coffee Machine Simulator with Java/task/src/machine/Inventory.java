package machine;

public class Inventory {

    protected int waterContainsMl;
    protected int milkContainsMl;
    protected int beansContainsGram;
    protected int cupsContains;
    protected int moneyContains;

    public Inventory(int water, int milk, int beans, int cups, int money) {
        this.waterContainsMl = water;
        this.milkContainsMl = milk;
        this.beansContainsGram = beans;
        this.cupsContains = cups;
        this.moneyContains = money;
    }

    public void setWaterContainsMl(int water) {
        this.waterContainsMl += water;
    }

    public void setMilkContainsMl(int milk) {
        this.milkContainsMl += milk;
    }

    public void setBeansContainsGram(int beans) {
        this.beansContainsGram += beans;
    }

    public void setCupsContains(int cups) {
        this.cupsContains += cups;
    }

    public void setMoneyContains(int money){
        this.moneyContains = money;
    }

    public int getWaterContainsMl() {
        return waterContainsMl;
    }

    public int getMilkContainsMl() {
        return milkContainsMl;
    }

    public int getBeansContainsGram() {
        return beansContainsGram;
    }

    public int getCupsContains() {
        return cupsContains;
    }

    public int getMoneyContains() {
        return moneyContains;
    }

}
