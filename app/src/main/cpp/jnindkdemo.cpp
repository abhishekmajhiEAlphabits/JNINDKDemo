// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("jnindkdemo");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("jnindkdemo")
//      }
//    }


#include <jni.h>

extern "C"
{
JNIEXPORT
        jstring
JNICALL
Java_com_example_jnindkdemo_MainActivity_getMessageFromNative(
        JNIEnv *env,
        jobject callingObject)
{
    return env->NewStringUTF("Native code rules!");
}
};
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_jnindkdemo_MainActivity_getMsgFromJni(JNIEnv *env, jobject thiz) {
    // TODO: implement getMsgFromJni()
    return env->NewStringUTF("Native code rules! Abhishek");
}