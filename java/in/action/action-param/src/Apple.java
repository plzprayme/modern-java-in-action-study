public class Apple {
    int weight;
    Color color;

    public Apple() {
        this.weight = 0;
        this.color = Color.RED;
    }

    public Apple(int weight) {
        this.weight = weight;
        this.color = Color.RED;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
