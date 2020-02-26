/*

JNI test

*/

class HelloWorldJNI {
    private native void printByC();
    public static void main(String[] args) {
        new HelloWorldJNI().printByC();
    }
    static {
        System.setProperty("java.library.path", ".");
        System.loadLibrary("HelloWorldJNI");
    }
}
