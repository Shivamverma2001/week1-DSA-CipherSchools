public class Lecture2 {
    /**
     * People meet each other or not
     * 
     * @param p1 people 1
     * @param p2 people 2
     * @param s1 speed 1
     * @param s2 speed 2
     * @return
     */
    public static boolean isMeet(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2) {
            return false;
        } else if (p2 > p1 && s2 > s1) {
            return false;
        }
        while (p1 >= p2) {
            if (p1 == p2) {
                return true;
            }
            p1 += s1;
            p2 += 2;
        }
        return false;
    }

    public static boolean isMeetOptimized(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2) {
            return false;
        } else if (p2 > p1 && s2 > s1) {
            return false;
        }
        int distance = Math.abs(p1 - p2);
        int speed = Math.abs(s1 - s2);
        if (distance % speed == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int p1 = 6;
        int p2 = 8;
        int s1 = 6;
        int s2 = 4;
        // boolean ans = isMeet(p1, p2, s1, s2);
        boolean ans = isMeetOptimized(p1, p2, s1, s2);
        if (ans == true) {
            System.out.println("They meet");
        } else {
            System.out.println("They didn't");
        }
    }
}
