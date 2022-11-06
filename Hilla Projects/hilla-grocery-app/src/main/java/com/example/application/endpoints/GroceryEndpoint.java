package com.example.application.endpoints;

import com.example.application.model.GroceryItem;
import com.example.application.repository.GroceryRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.util.List;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint
@AnonymousAllowed
public class GroceryEndpoint {
    private final GroceryRepository  repository;

    public GroceryEndpoint(GroceryRepository repository) {
        this.repository = repository;
    }
    private @Nonnull List<@Nonnull GroceryItem> findAll(){
        return this.repository.findAll();

    }
    /**
     * @param item
     * @return
     */
    public GroceryItem addGroceryItem(GroceryItem item){
        return this.repository.save(item);
    }

}
