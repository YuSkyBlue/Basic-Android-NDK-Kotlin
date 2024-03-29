#include <jni.h>
#include <string>
#include <jni.h>


extern "C" JNIEXPORT jint JNICALL Java_com_example_androidndk_ExampleJNI_addNumbers(JNIEnv *env, jobject thiz, jint a, jint b) {
    return a + b;
}