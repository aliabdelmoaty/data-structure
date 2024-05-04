import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        for (int i = 0; i < people.length; i++) {
            if (people[i] <= limit) {
                int p = 0;
                for (int j = people.length - 1; j >= i; j--) {
                    if ((people[i] + people[j]) <= limit) {

                        p++;
                        people[j] = limit + 1;
                        break;
                    }

                }
                if (p == 0) {
                    boat++;
                } else {
                    boat++;
                }

            }

        }
        return boat;
    }

    public int numRescueBoats1(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }

    public static void main(String[] args) {
        int[] people = { 1, 2 };
        int limit = 3;
        BoatsToSavePeople b = new BoatsToSavePeople();
        System.out.println(b.numRescueBoats(people, limit));
    }
}
