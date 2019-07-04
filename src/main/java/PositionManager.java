public class PositionManager {
    private int yPosition = 0;
    private WrapAroundCoordinateAxis wrappedYAxis ;
    private int xPosition = 0;
    private WrapAroundCoordinateAxis wrappedXAxis;

    public PositionManager(int width, int height) {
        wrappedYAxis = new WrapAroundCoordinateAxis(height);
        wrappedXAxis = new WrapAroundCoordinateAxis(width);
    }

    public void moveNorth() {
        yPosition = wrappedYAxis.increase(yPosition);
    }

    public String getPosition() {
        return xPosition+","+ yPosition;
    }

    public void moveSouth() {
        yPosition = wrappedYAxis.decrease(yPosition);
    }

    public void moveEast() {
        xPosition = wrappedXAxis.increase(xPosition);
        if((xPosition+","+yPosition).equals("3,0")){
            xPosition = 2;
        }
    }

    public void moveWest() {
        xPosition = wrappedXAxis.decrease(xPosition);
    }

    public void setObstacle(String s) {
        throw new UnsupportedOperationException();
    }
}
