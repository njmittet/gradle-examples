plugins {
    `maven-publish`
    kotlin("jvm") version "1.3.21"
    id("org.jetbrains.dokka") version "0.9.17"
}

group = "no.njm"
version = "0.0.1"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

// The creating API continues to eagerly create and configure tasks when it is called.
val dokkaJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
    from(tasks.dokka)
}

// The register() API registers a task to be created at a later time if and only if the task is needed.
val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifact(dokkaJar.get())
            artifact(sourcesJar.get())
        }
    }
    repositories {
        maven {
            url = uri("$buildDir/repository")
        }
    }
}


