package io.sellmair.mppdemo.library.c

import io.sellmair.mppdemo.library.a.LibraryA
import io.sellmair.mppdemo.library.b.LibraryB

object LibraryC {
    fun work() = println("work")
    fun useLibraryA() = LibraryA.work()
    fun useLibraryB() = LibraryB.work()
}