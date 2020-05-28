public class Program {
    public static void main(String[] args) {
        PriceBuilder priceBuilder = new PriceBuilder();
        DocBuilder docBuilder = new DocBuilder();
        HouseBuilder houseBuilder = new HouseBuilder();

        Director salesman = new Director(priceBuilder);
        Director manager = new Director(docBuilder);
        Director foreman = new Director(houseBuilder);

        salesman.make(true);
        int price = priceBuilder.getResult();
        System.out.printf("Результат работы продавца - цена: %d\n\n", price);

        foreman.make(true);
        House house = houseBuilder.getResult();
        System.out.printf("Результат работы прораба - дом:\n%s\n", house);

        manager.make(true);
        Documentation doc = docBuilder.getResult();
        System.out.printf("Результат работы менеджера - пакет документов:\n%s\n", doc);
    }
}
