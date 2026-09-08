public class Main {
    public static void main(String[] args) {
        int value = 17 ;
        String binaryString = MathByte.toBinaryString(value);
        int fromBinaryString = MathByte.fromBinaryString(binaryString);

        System.out.println(binaryString);
        System.out.println(fromBinaryString);
        System.out.println(fromBinaryString == value);


    }
}