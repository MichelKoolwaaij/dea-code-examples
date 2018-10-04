package oose.dea.dao;

import oose.dea.Interface.ItemDAO;
import oose.dea.domain.Item;

import javax.enterprise.inject.Alternative;
import java.util.ArrayList;
import java.util.List;

@Alternative
public class OtherItemDAO implements ItemDAO {
    public List<Item> list() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Kanarie", "Dieren", "Fluit!"));
        items.add(new Item("Koe", "Dieren", "Eet gras!"));
        return items;
    }
}
