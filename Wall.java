public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public Wall() {
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;

        if (width < 0)
            this.width = 0;
    }

    public void setHeight(double height) {
        this.height = height;

        if (height < 0)
            this.height = 0;
    }

    public double getArea() {
        return width * height;
    }
}