package io.sellmair.mppdemo.library.c

import io.sellmair.mppdemo.library.a.AndroidTestLibraryA
import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.b.LibraryB

class LibraryCAndroidTest {
    fun test() {
        LibraryA.work()
        LibraryB.work()
        AndroidTestLibraryA.work()
        LibraryC.work()
    }
}