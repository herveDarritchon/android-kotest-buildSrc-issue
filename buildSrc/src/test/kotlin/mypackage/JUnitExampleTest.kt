package mypackage

class JUnitExampleTest{
    @Test
    fun `1 + 1 = 2`() {
        Assertions.assertEquals(2, 1 + 1, "1 + 1 should equal 2")
    }
}