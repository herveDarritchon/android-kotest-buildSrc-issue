package mypackage

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MyServiceTest : StringSpec({
    "1 + 1 = 2" {
        (1 + 1) shouldBe 2
    }
})