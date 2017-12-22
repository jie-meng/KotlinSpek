package com.jmengxy.kotlinspek.utils

import org.mockito.Mockito

/**
 * Created by jiemeng on 22/12/2017.
 */

fun <T> any(): T {
    Mockito.any<T>()
    return uninitialized()
}

fun <T> uninitialized(): T = null as T