rootProject.name = "ModuleTemplate"

include(":TNE-Module-Core")
include(":TNE-Module-Sponge")
include(":TNE-Module-Bukkit")
project(":TNE-Module-Core").projectDir = file("ModuleCore")
project(":TNE-Module-Sponge").projectDir = file("ModuleSponge")
project(":TNE-Module-Bukkit").projectDir = file("ModuleBukkit")


pluginManagement {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.8.0")
}