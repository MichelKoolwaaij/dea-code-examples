package oose.dea.dao;

import oose.dea.Interface.ItemDAO;
import oose.dea.domain.Item;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import java.util.ArrayList;
import java.util.List;

@Alternative
public class YetOtherItemDAO implements ItemDAO {
    public List<Item> list() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Lada", "Auto", "Lekker snel"));
        items.add(new Item("Dikke BMW", "Auto", "Auw!"));
        return items;
    }
}
