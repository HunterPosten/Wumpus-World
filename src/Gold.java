public class Gold implements Boardable {

    @Override
    public boolean canShare(Boardable item) {
        return true;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    public String toString() { return ""; }
}
