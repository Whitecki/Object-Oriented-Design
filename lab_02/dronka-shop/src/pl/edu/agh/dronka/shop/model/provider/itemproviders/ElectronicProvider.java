package pl.edu.agh.dronka.shop.model.provider.itemproviders;

import pl.edu.agh.dronka.shop.model.Category;
import pl.edu.agh.dronka.shop.model.Item;
import pl.edu.agh.dronka.shop.model.items.ElectronicItem;
import pl.edu.agh.dronka.shop.model.provider.CSVReader;
import pl.edu.agh.dronka.shop.model.provider.Provider;

public class ElectronicProvider implements Provider {

    @Override
    public Item createItem(String name, Category category, int price, int quantity, String[] dataLine, CSVReader reader) {
        boolean isMobile = Boolean.parseBoolean(reader.getValue(
                dataLine, "Mobilny"));
        boolean isUnderWarranty = Boolean.parseBoolean(reader.getValue(
                dataLine, "Gwarancja"));
        return new ElectronicItem(name, category, price, quantity, isMobile, isUnderWarranty);
    }
}
