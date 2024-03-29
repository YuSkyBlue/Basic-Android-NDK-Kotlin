cmake_minimum_required(VERSION 3.10.2)

project("sample-jni")


# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add_library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.
# Specifies a shared library.
add_library(
        # Sets the name of the library.
        ${CMAKE_PROJECT_NAME}

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        sample-jni.cpp
)


find_library(
        # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that you want CMake to locate.
        log
)

target_link_libraries(
        # Specifies the target library.
        ${CMAKE_PROJECT_NAME}

        # Links the target library to the log library included in the NDK.
        ${log-lib}
)