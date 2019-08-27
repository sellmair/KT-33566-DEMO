package io.sellmair.mppdemo.library.c

import io.sellmair.mppdemo.library.a.LibraryAAndroidTest
import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.b.LibraryB

class LibraryCAndroidTest {
    fun test() {
        LibraryA.work()
        LibraryB.work()
        LibraryAAndroidTest.work()
        LibraryC.work()
    }
}