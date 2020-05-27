import factories.HouseFactory;
import factories.StoneHouseFactory;
import factories.WoodHouseFactory;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        HouseFactory factory;
        if(Locale.getDefault().getCountry().equals("RU")) {
            factory = new StoneHouseFactory();
        } else {
            factory = new WoodHouseFactory();
        }

        factory.createWall().build();
        factory.createRoof().waterProtect();
        factory.createWindow().open();
    }
}
