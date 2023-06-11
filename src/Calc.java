class Calc {

    public static void cramer(float a1, float a2, float a3, float b1, float b2, float b3, float c1, float c2, float c3, float d1, float d2, float d3) {
        String result;

        System.out.println("Evaluating the result...");

        float x = d1 * b2 * c3 + d3 * b1 * c2 + d2 * b3 * c1 - d3 * b2 * c1 - d1 * b3 * c2 - d2 * b1 * c3;
        float y = a1 * d2 * c3 + a3 * d1 * c2 + a2 * d3 * c1 - a3 * d2 * c1 - a1 * d3 * c2 - a2 * d1 * c3;
        float z = a1 * b2 * d3 + a3 * b1 * d2 + a2 * b3 * d1 - a3 * b2 * d1 - a1 * b3 * d2 - a2 * b1 * d3;
        float d = a1 * b2 * c3 + a3 * b1 * c2 + a2 * b3 * c1 - a3 * b2 * c1 - a1 * b3 * c2 - a2 * b1 * c3;

        float dx = x / d;
        float dy = y / d;
        float dz = z / d;
        String space = " ";
        result = "\nX = " + String.valueOf(dx) + ",Y = " + String.valueOf(dy) + ",Z = " + String.valueOf(dz);
        System.out.print(result);
    }
}