class MapMarker {
    private int x, y;
    private String label;
    private MarkerStyle style;

    public MapMarker(int x, int y, String label, String icon, String color) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.style = MarkerStyleFactory.getStyle(icon, color);
    }

    public void render() {
        style.draw(x, y, label);
    }
}