package kacper.przepissy.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/recipe")
@CrossOrigin("*")
public class RecipeController {

    private  final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @PostMapping(
            path = "{recipeId}/image/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadRecipe(@PathVariable("recipeId") UUID recipeId,
                             @RequestParam("file") MultipartFile file) {
        recipeService.uploadRecipe(recipeId, file);
    }
}
