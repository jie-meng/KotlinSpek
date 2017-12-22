package com.jmengxy.kotlinspek

/**
 * Created by jiemeng on 22/12/2017.
 */
interface DataSource {
    fun fetch(inputA: Int, inputB: Arg): Int
}
