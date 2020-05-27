import windows.Window;

public class Program {

    public static void main(String[] args) {
        Supplier[] suppliers = new Supplier[]{new Supplier(), new CompanyA(), new CompanyB()};
        Window window;
        for(Supplier s : suppliers) {
            window = s.createWindow().install();
            window.open();
            window.close();
        }
    }
}
