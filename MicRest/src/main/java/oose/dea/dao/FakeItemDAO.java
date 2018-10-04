package oose.dea.dao;

import oose.dea.Interface.ItemDAO;
import oose.dea.domain.Item;

import javax.enterprise.inject.Alternative;
import java.util.ArrayList;
import java.util.List;

@Alternative
public class FakeItemDAO implements ItemDAO {
    public List<Item> list() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Frikandel", "Snacks", "Lekker wel!"));
        items.add(new Item("Kroket", "Snacks", "Ook lekker in bed!"));
        return items;
    }
}
