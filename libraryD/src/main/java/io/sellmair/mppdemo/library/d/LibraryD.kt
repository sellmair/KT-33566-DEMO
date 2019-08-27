package io.sellmair.mppdemo.library.d

import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.b.LibraryB
import io.sellmair.mppdemo.library.c.LibraryC

object LibraryD {
    fun useLibraryA() = LibraryA.work()
    fun useLibraryB() = LibraryB.work()
    fun useLibraryC() = LibraryC.work()
}