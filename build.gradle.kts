plugins {
    id("java")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

plugins {
    id("java")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.intuit.karate:karate-junit5:1.1.0")
    implementation("ch.qos.logback:logback-classic:1.2.13") // Actualiza la versión aquí
    testImplementation("org.testng:testng:7.7.0") // Actualiza la versión aquí
}

tasks.test {
    useJUnitPlatform()
}


tasks.test {
    useJUnitPlatform()
}
