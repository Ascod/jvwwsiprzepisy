package kacper.przepissy.recipe;

import com.amazonaws.services.opsworks.model.UserProfile;
import kacper.przepissy.bucket.BucketName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
public class RecipeService {
    private final RecipeDataAccessService recipeDataAccessService;

    @Autowired
    public RecipeService(RecipeDataAccessService recipeDataAccessService) {
        this.recipeDataAccessService = recipeDataAccessService;
    }
    List<Recipe> getRecipes(){
        return recipeDataAccessService.getRecipes();
    }

    public void uploadRecipe(UUID recipeId, MultipartFile file) {
        isFileEmpty(file);
        // 2. If file is an image
        isImage(file);

        // 3. The user exists in our database
        Recipe user = getRecipeOrThrow(recipeId);

        // 4. Grab some metadata from file if any
        Map<String, String> metadata = extractMetadata(file);

        // 5. Store the image in s3 and update database (userProfileImageLink) with s3 image link
        String path = String.format("%s/%s", BucketName.PROFILE_IMAGE.getBucketName(), user.getRecipeId());
        String filename = String.format("%s-%s", file.getOriginalFilename(), UUID.randomUUID());


    }

    byte[] downloadUserProfileImage(UUID userProfileId) {

        String path = String.format("%s/%s",
                BucketName.PROFILE_IMAGE.getBucketName());

        return null;
    }

    private Map<String, String> extractMetadata(MultipartFile file) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put("Content-Type", file.getContentType());
        metadata.put("Content-Length", String.valueOf(file.getSize()));
        return metadata;
    }

    private Recipe getRecipeOrThrow(UUID recipeId) {
        return recipeDataAccessService
                .getRecipes()
                .stream()
                .filter(userProfile -> userProfile.getRecipeId().equals(recipeId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("User profile %s not found", recipeId)));
    }

    private void isImage(MultipartFile file) {

    }

    private void isFileEmpty(MultipartFile file) {
        if (file.isEmpty()) {
            throw new IllegalStateException("Cannot upload empty file [ " + file.getSize() + "]");
        }
    }
    }

