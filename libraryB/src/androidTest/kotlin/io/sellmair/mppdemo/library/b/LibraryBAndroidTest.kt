package io.sellmair.mppdemo.library.b

import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.a.LibraryAAndroidTest

class LibraryBAndroidTest {
    fun work() {

        /*
        This line of code is always resolved by the IDE, even though it should not
        `LibraryAAndroidTest` is defined in `libraryA/androidTest` which is not available
        inside this module. Compiling will tell, that this reference is unresolved
         */
        LibraryAAndroidTest.work()


        /*
        This line of code will always compile, since `LibraryA` is defined inside
        `libraryA/commonMain and libraryB declares this as dependency.


        The ide *cannot* resolve this reference for some (seemingly valid) definitions
        of `libraryB/build.gradle.kts`
         */
        LibraryA.work()
    }
}