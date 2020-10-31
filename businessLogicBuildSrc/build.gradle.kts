plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

dependencies {
    // (Required) Writing and executing Unit Tests on the JUnit Platform
    //testImplementation( "org.junit.jupiter:junit-jupiter-api")
    //testRuntimeOnly( "org.junit.jupiter:junit-jupiter-engine")

    // (Optional) If you need("Parameterized Tests"
    //testImplementation( "org.junit.jupiter:junit-jupiter-params")

    // (Optional) If you also have JUnit 4-based tests
    //testImplementation( "junit:junit:4.13.1")
    //testImplementation( "org.junit.vintage:junit-vintage-engine:5.7.0")

    //testImplementation(platform("org.junit:junit-bom:5.7.0"))
    //testImplementation("org.junit.jupiter:junit-jupiter")
    val kotest_version = "4.3.0"
    testImplementation("io.kotest:kotest-runner-junit5:$kotest_version") // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core:$kotest_version") // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property:$kotest_version") // for kotest property test
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

// config JVM target to 1.8 for kotlin compilation tasks
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}