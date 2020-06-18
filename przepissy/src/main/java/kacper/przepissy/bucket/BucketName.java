package kacper.przepissy.bucket;

public enum BucketName {

    PROFILE_IMAGE("przepisy-wwsi-zaliczenie");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
