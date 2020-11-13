plugins {
    kotlin("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "2.0.4"
}

group = "app.piko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.1stleg:jnativehook:2.1.0")
}

tasks {
    jar {
        manifest {
            attributes["Main-Class"] = "app.piko.keyviewer.MainKt"
        }
    }

    shadowJar {
        classifier = "shadow"
    }
}
