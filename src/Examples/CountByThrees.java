package Examples;

public class CountByThrees {
    public static void main(String[] args) {

        int count = 0;
        do {
            if (count % 3 == 0)
                System.out.println(count);
            count++;
        } while (count < 301);
    }
}
