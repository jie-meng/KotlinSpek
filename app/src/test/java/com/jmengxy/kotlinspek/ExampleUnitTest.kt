package com.jmengxy.kotlinspek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.any
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mockito

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnitPlatform::class)
class MomentsPresenterSpec : Spek({

    val dataSource = Mockito.mock(DataSource::class.java)

    beforeEachTest {
    }

    afterEachTest {
    }

    describe("DataSource fetch") {

        given("with any input data") {
            beforeEachTest {
                Mockito.`when`(dataSource.fetch(anyInt(), any(Arg::class.java))).thenReturn(1)
            }

            it("should return 1") {
                assertEquals(1, dataSource.fetch(0, Arg()))
            }
        }
    }
});

