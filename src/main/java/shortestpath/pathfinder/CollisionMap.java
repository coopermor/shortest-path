package shortestpath.pathfinder;

public class CollisionMap extends FlagMap {
    public CollisionMap(int minX, int minY, int maxX, int maxY) {
        super(minX, minY, maxX, maxY, 2);
    }

    public CollisionMap(byte[] data) {
        super(data, 2);
    }

    public boolean n(int x, int y, int z) {
        return get(x, y, z, 0);
    }

    public boolean s(int x, int y, int z) {
        return n(x, y - 1, z);
    }

    public boolean e(int x, int y, int z) {
        return get(x, y, z, 1);
    }

    public boolean w(int x, int y, int z) {
        return e(x - 1, y, z);
    }

    public boolean ne(int x, int y, int z) {
        return n(x, y, z) && e(x, y + 1, z) && e(x, y, z) && n(x + 1, y, z);
    }

    public boolean nw(int x, int y, int z) {
        return n(x, y, z) && w(x, y + 1, z) && w(x, y, z) && n(x - 1, y, z);
    }

    public boolean se(int x, int y, int z) {
        return s(x, y, z) && e(x, y - 1, z) && e(x, y, z) && s(x + 1, y, z);
    }

    public boolean sw(int x, int y, int z) {
        return s(x, y, z) && w(x, y - 1, z) && w(x, y, z) && s(x - 1, y, z);
    }
}
