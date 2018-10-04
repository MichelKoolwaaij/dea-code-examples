
package oose.dea.services.rest;

import oose.dea.Interface.ItemDAO;
import oose.dea.Interface.ItemService;
import oose.dea.domain.Item;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/rest")
public class ItemRestService implements ItemService {

    @Inject
    private ItemDAO itemDAO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> findAll() {

        return itemDAO.list();
    }
}
