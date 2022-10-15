public class Phone {
    private String number;
    private String model;
    private double weight;

    public void userInfo() {
        System.out.println("Номер:" + this.number + "\nМодель:" + this.model + "\nВес:" + this.weight + "\n");
    }

    public String getNumber() {
        return "Номер: " + number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void receiveCall(String userOne) {
        System.out.println("Вам звонит " + userOne);
    }

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String userOne, String number) {
        System.out.println("Звонит: " + userOne + "\nНомер: " + number);
    }

    void sendMessage(String... a) {
        for (String elem : a) {
            System.out.println(elem);
        }
    }
}


