package kacper.przepissy.recipe;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class Recipe {
    private String title;
    private UUID recipeId;
    private String author;
    private String recipe;
    private String comments;
    private String recipeImageLink;


    public Recipe(UUID recipeId, String author,String title, String recipe, String comments, String recipeImageLink) {
        this.recipeId = recipeId;
        this.author = author;
        this.title = title;
        this.recipe = recipe;
        this.comments = comments;
        this.recipeImageLink = recipeImageLink;
    }

    public UUID getRecipeId() {
        return recipeId;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getRecipe() {
        return recipe;
    }
    public String getComments() {
        return comments;
    }

    public Optional<String> getRecipeImageLink() {
        return Optional.ofNullable(recipeImageLink);
    }

    public void setRecipeId(UUID recipeId) {
        this.recipeId = recipeId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public void setComments(String comments) {
        this.recipe = comments;
    }

    public void setRecipeImageLink(String recipeImageLink) {
        this.recipeImageLink = recipeImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe1 = (Recipe) o;
        return Objects.equals(recipeId, recipe1.recipeId) &&
                Objects.equals(author, recipe1.author) &&

                Objects.equals(title, recipe1.title) &&
                Objects.equals(recipe, recipe1.recipe) &&
                Objects.equals(comments, recipe1.comments) &&
                Objects.equals(recipeImageLink, recipe1.recipeImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, author, title, recipe, comments, recipeImageLink);
    }

    public void setUserProfileImageLink(String filename) {
    }
}
