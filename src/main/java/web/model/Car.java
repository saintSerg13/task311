package web.model;

public class Car {
    private String collor;
    private String model;
    private String cost;

    public Car(String collor, String model, String cost){
        this.collor = collor;
        this.model = model;
        this.cost = cost;
    }

    public String getCollor() {
        return collor;
    }

    public String getModel() {
        return model;
    }

    public String getCost() {
        return cost;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
