package io.sellmair.mppdemo.library.c

import io.sellmair.mppdemo.library.a.DefinedInLibraryAAndroidMain
import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.b.LibraryB

object AndroidLibraryC {
    fun useLibraryA() = LibraryA.work()
    fun useLibraryB() = LibraryB.work()
    fun useLibraryAAndroid() = DefinedInLibraryAAndroidMain
}