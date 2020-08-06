import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    java
    `java-library`
    id("org.springframework.boot") version "2.3.2.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
    kotlin("jvm") version "1.3.61" apply false
    kotlin("plugin.spring") version "1.3.61" apply false
    kotlin("plugin.jpa") version "1.3.61" apply false
}

allprojects {

    group = "by.dziki"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = JavaVersion.VERSION_11.majorVersion
        targetCompatibility = JavaVersion.VERSION_11.majorVersion
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = JavaVersion.VERSION_11.majorVersion
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply {
//        plugin("java")
//        plugin("java-library")
        plugin("io.spring.dependency-management")
    }
}
