plugins {
    id("java")
    id("idea")
    id("org.sonarqube") version "7.0.0.6105"
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

sonar {
    properties {
        property ("sonar.projectKey", "Met-s_Hexlet")
        property ("sonar.organization", "met-s-1")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
