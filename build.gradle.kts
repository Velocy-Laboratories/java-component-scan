plugins {
    id("java")
    id("maven-publish")
    id ("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "org.velocy"
version = "1.0.1"

repositories {
    mavenCentral()

    maven("https://jitpack.io")
}

dependencies {
    implementation("org.reflections:reflections:0.10.2")

    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}