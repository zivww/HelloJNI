
#include <jni.h>
#include <stdio.h>
#include "HelloWorldJNI.h"

JNIEXPORT void JNICALL Java_HelloWorldJNI_printByC (JNIEnv *env, jobject obj){

    printf("Hello from C\n");
    return;
}
