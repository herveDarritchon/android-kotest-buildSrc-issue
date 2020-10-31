package mypackage

class KotestExampleTest: StringSpec({
    "1 + 1 = 2" {
        (1 + 1) shouldBe 2
    }
})