public enum Season {
    SPRING(10), SUMMER(35), AOTUM(25), WINTER(-10);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
