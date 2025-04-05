public class Main {
    public static void main(String[] args) {

        Image image1 = new ImageProxy("house1.jpg");
        image1.displayThumbnail();
        image1.displayFullImage();

        AgentUploader agent = new AgentUploader(false);
        agent.uploadImage("villa.png");


        for (int i = 0; i < 1000; i++) {
            MapMarker marker = new MapMarker(i, i, "Hospital", "hospital.png", "red");
            marker.render();
        }
        System.out.println("Unique marker styles used: " + MarkerStyleFactory.getTotalStyles());
    }
}
