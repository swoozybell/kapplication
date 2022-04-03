
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.31" // <1>

    application // <2>
}

repositories {
    mavenCentral() // <3>
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) // <4>

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") // <5>

    implementation("com.google.guava:guava:30.1.1-jre") // <6>

    testImplementation("org.jetbrains.kotlin:kotlin-test") // <7>

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit") // <8>
}

application {
    mainClass.set("demo.AppKt") // <9>
}
