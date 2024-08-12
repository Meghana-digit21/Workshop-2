package FunctionalInterface;

public class StringLengthTesting {
    public static void main(String[] args) {
        StringLength stringLen = s -> s.length();
        System.out.println("Length of 'Hello There': " + stringLen.length("Hello There"));
        System.out.println("Length of '88927492': " + stringLen.length("88927492"));
        System.out.println("Length of 'Length of sentence with numbers 2344223': " + stringLen.length("Word Length with numbers 2344223"));
        System.out.println("Length of empty String: " + stringLen.length(""));
        System.out.println("Length of 'Java999': " + stringLen.length("Java999"));
        System.out.println("Length of string with numbers, special characters '%%$@@#@SPeciAL': " + stringLen.length("%%$@@#@SPeciAL"));



    }

}








