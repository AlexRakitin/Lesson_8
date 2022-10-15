public class Main {
    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("Создайте класс Phone, который содержит переменные number, model и weight.\nСоздайте три экземпляра этого класса.");
        System.out.println("*********");
        Phone mobile1 = new Phone("+375 33 6216196", "IPhone", 150.5);
        Phone mobile2 = new Phone("+375 33 6555961", "Samsung", 200.5);
        Phone mobile3 = new Phone("+375 29 2802239", "Nokia", 300.5);
        mobile1.userInfo();
        mobile2.userInfo();
        mobile3.userInfo();
        System.out.println("*********");
        System.out.println("Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.\nВыводит на консоль сообщение Звонит name");
        System.out.println("*********");
        mobile1.receiveCall("Билли");
        mobile1.setNumber("+375 33 101");
        System.out.println(mobile1.getNumber());
        System.out.println();
        mobile2.receiveCall("Вилли");
        mobile2.setNumber("+375 33 102");
        System.out.println(mobile2.getNumber());
        System.out.println();
        mobile2.receiveCall("Дилли");
        mobile2.setNumber("+375 33 103");
        System.out.println(mobile2.getNumber());
        System.out.println("*********");
        System.out.println("Добавьте перегруженный метод receiveCall, который принимает два параметра \n- имя звонящего и номер телефона звонящего. Вызвать этотметод");
        System.out.println("*********");
        Phone mobile4=new Phone();
        mobile4.receiveCall("Кнопочка", "104");
        System.out.println("*********");
        System.out.println("Создать метод sendMessage с аргументами переменной длины. Данный\n" +
                "метод принимает на вход номера телефонов, которым будет отправлено\n" +
                "сообщение. Метод выводит на консоль номера этих телефонов.");
        Phone mobile = new Phone();
        mobile.sendMessage(mobile1.getNumber(),mobile2.getNumber(),mobile3.getNumber());
    }
}