package io.sellmair.mppdemo.library.b

import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.a.LibraryAAndroidTest

class LibraryBAndroidTest {
    fun work() {
        LibraryAAndroidTest.work()
        LibraryA.work()
    }
}