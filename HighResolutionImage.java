class HighResolutionImage implements Image {
    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading full-resolution image: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail for: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + filename);
    }
}