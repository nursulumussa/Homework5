class MarkerStyle {
    private String icon;
    private String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void draw(int x, int y, String label) {
        System.out.println("Drawing " + label + " at (" + x + "," + y + ") with icon=" + icon + " and color=" + color);
    }
}