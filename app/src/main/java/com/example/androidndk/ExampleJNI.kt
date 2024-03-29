package com.example.androidndk


class ExampleJNI {
    // Native method declaration
    external fun addNumbers(a: Int, b: Int): Int

    companion object {
        // Load the native library on runtime
        init {
            System.loadLibrary("sample-jni")
        }
    }
}