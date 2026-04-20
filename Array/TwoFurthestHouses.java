package Array;

public class TwoFurthestHouses {
    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 6, 1, 1, 1 };
        System.out.println(maxDistance(arr));
    }

    static int maxDistance(int[] colors) {
        int distance = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    distance = Math.max(distance, Math.abs(j - i));
                }
            }
        }
        return distance;
    }

}
