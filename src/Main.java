import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10, 10, 15);
        double collisions = 0.0;
        int times = 0;
        ArrayList<Rectangle> collide = new ArrayList<Rectangle>();
        for (int i = 0; i < 1000000; i++) {
            int randomx = (int) (Math.random() * 50 + 1);
            int randomy = (int) (Math.random() * 50 + 1);
            int randomLength = (int) (Math.random() * 40 + 10);
            int randomWidth = (int) (Math.random() * 5 + 5);
            Rectangle random = new Rectangle(randomLength, randomWidth, randomx, randomy);
            if (random.getTopLeftx() <= rectangle.getTopLeftx() && random.getBottomRightx() >= rectangle.getTopLeftx()) {
                collisions++;
            } else if (random.getTopLeftx() >= rectangle.getTopLeftx() && random.getBottomRightx() <= rectangle.getBottomRightx())
            collisions++;
        }
        System.out.println(collisions / 1000000);
    }
}
