package kacper.przepissy.datastore;

import kacper.przepissy.recipe.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeRecipeDataStore {
    private static final List<Recipe> RECIPES = new ArrayList<>();

    static {
        RECIPES.add(new Recipe(UUID.randomUUID(),"Karol","Lorem ipsum", "asfasklgfjashgklahksjfghbalsdjlkfghbal","[{\"autor\":\"hania\",\"comment\":\"super\"},{\"autor\":\"marek\",\"comment\":\"jadlem lepsze\"},{\"autor\":\"ola\",\"comment\":\"bomba musze to sprobowac\"},{\"autor\":\"eugenio\",\"comment\":\"ojej super\"},{\"autor\":\"marek\",\"comment\":\"fajne\"},{\"autor\":\"krzys\",\"comment\":\"co to ma byc?\"}]",null));
        RECIPES.add(new Recipe(UUID.randomUUID(),"Karolina","Loremum", "afksdjglakgjdlnak","[{\"autor\":\"hania\",\"comment\":\"super\"},{\"autor\":\"marek\",\"comment\":\"jadlem lepsze\"},{\"autor\":\"ola\",\"comment\":\"bomba musze to sprobowac\"},{\"autor\":\"eugenio\",\"comment\":\"ojej super\"},{\"autor\":\"marek\",\"comment\":\"fajne\"},{\"autor\":\"krzys\",\"comment\":\"co to ma byc?\"}]",null));
        RECIPES.add(new Recipe(UUID.randomUUID(),"Robert","Lffjasdkflajsflakj", "asfasgagasraG","[{\"autor\":\"hania\",\"comment\":\"super\"},{\"autor\":\"marek\",\"comment\":\"jadlem lepsze\"},{\"autor\":\"ola\",\"comment\":\"bomba musze to sprobowac\"},{\"autor\":\"eugenio\",\"comment\":\"ojej super\"},{\"autor\":\"marek\",\"comment\":\"fajne\"},{\"autor\":\"krzys\",\"comment\":\"co to ma byc?\"}]",null));
        RECIPES.add(new Recipe(UUID.randomUUID(),"Karolina","Loreasjflk;ajsf;laksfjmum","FAGAJGLKASGlskdjghsjkgadhsak;djl","[{\"autor\":\"hania\",\"comment\":\"super\"},{\"autor\":\"marek\",\"comment\":\"jadlem lepsze\"},{\"autor\":\"ola\",\"comment\":\"bomba musze to sprobowac\"},{\"autor\":\"eugenio\",\"comment\":\"ojej super\"},{\"autor\":\"marek\",\"comment\":\"fajne\"},{\"autor\":\"krzys\",\"comment\":\"co to ma byc?\"}]", null));
    }
    public static List<Recipe> getRecipes() {
        return RECIPES;
    }
}
