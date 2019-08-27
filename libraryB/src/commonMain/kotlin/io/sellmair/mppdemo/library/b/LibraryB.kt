package io.sellmair.mppdemo.library.b

import io.sellmair.mppdemo.library.a.LibraryA

object LibraryB {
    fun work() = print("work")
    fun useLibraryA() = LibraryA.work()
}