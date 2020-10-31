plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

dependencies {
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