package kacper.przepissy.recipe;

import kacper.przepissy.datastore.FakeRecipeDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeDataAccessService {

    private final FakeRecipeDataStore fakeRecipeDataStore;

    @Autowired
    public RecipeDataAccessService(FakeRecipeDataStore fakeRecipeDataStore) {
        this.fakeRecipeDataStore = fakeRecipeDataStore;
    }

    List<Recipe> getRecipes() {
        return fakeRecipeDataStore.getRecipes();
    }
}
