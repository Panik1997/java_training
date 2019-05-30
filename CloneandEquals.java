import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CloneandEquals {
    private int x;
    private int y;

    public CloneandEquals(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CloneandEquals clone() {
        try {
            System.out.println("Cloning done.");
            return (Main) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed");
            return null;
        }
    }

    public static void main(String[] args) {
        CloneandEquals test = new Main(1, 2);
        CloneandEquals testClone = test.clone();
        List<Main> list1 = new ArrayList<>();
        list1.add(new Main(3, 7));
        list1.add(new Main(6, 6));
        list1.add(new Main(7, 1));
        list1.add(new Main(8, 12));

        for (Main k : list1) {
            System.out.println(Objects.equals(k.getX(), k.getY()));
        }
    }
}
