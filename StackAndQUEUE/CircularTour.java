class CircularTour {

    static int findStart(int[] petrol, int[] distance) {

        int n = petrol.length;
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < n; i++) {

            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        if (surplus + deficit >= 0)
            return start;
        else
            return -1;
    }

    public static void main(String[] args) {

        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        System.out.println(findStart(petrol, distance));
    }
}