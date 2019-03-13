
public class Pit implements Boardable {
    @Override
    public boolean canShare(Boardable item) {
        return false;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    public String toString() { return ""; }
}
