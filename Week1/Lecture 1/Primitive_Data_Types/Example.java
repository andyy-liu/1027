public class Example {
    public static void main(String[] args) {
        byte byte1 = -128; // 8-bit signed integer allows for values from -128 to +127
        short short1 = 32767; // 16-bit signed integer that allows for values from -32,768 to +32,767
        int int1 = -2147483648; // 32-bit signed integer that allows for values from -2,147,483,648 to +2,147,483,647
        long long1 = 9223372036854775807L; // 64-bit signed integer that allows for values from -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 (note the required 'L' at the end)
        float float1 = 3.2F;// 32-bit floating point
        double double1 = 3.2; // 64-bit floating point
        char char1 = '\u03A9'; // 16-bit unicode character
        boolean bool1 = false;

        System.out.println(char1);
    }    
}
