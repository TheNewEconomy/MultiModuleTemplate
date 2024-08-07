/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1" apply true
}

dependencies {
    api(project(":TNE-Module-Core"))
    compileOnly("org.spigotmc:spigot-api:1.18.2-R0.1-SNAPSHOT")
}

repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

tasks {
    compileJava {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    jar {
        dependsOn(shadowJar)
        archiveFileName = "original-TNE-Module-Bukkit-${project.version}.jar"
    }

    shadowJar {
        archiveFileName = "TNE-Module-Bukkit-${project.version}.jar"
    }
}

description = "A TNE Bukkit Module"