public class DocBuilder implements Builder {
    private Documentation doc;

    @Override
    public void reset() {
        doc = new Documentation();
    }

    @Override
    public void prepare() {
        System.out.println("Получение разрешения на строительство ");
        doc.setBase(true);
    }

    @Override
    public void mainWork() {
        System.out.println("Подготовка сметы");
        doc.setBuilding(true);
    }

    @Override
    public void addServiceLines() {
        System.out.println("Документы на подключение коммуникаций");
        doc.setServiceLines(true);

    }

    @Override
    public void finish() {
        System.out.println("Акт ввода в эксплуатацию");
        doc.setFinish(true);
    }

    public Documentation getResult() {
        return doc;
    }
}
