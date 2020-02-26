javac HelloWorldJNI.java
javah -jni HelloWorldJNI
gcc -shared -I/usr/lib/jvm/java-8-openjdk-amd64/include -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux HelloWorldJNI.c -o libHelloWorldJNI.so
java HelloWorldJNI

#export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:~/Desktop/JNI
