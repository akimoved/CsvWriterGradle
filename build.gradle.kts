plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(libs.org.junit.jupiter.junit.jupiter)
    compileOnly(libs.org.projectlombok.lombok)
}

group = "org.writer"
version = "1.0-SNAPSHOT"
description = "csv"
java.sourceCompatibility = JavaVersion.VERSION_21

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            groupId = "org.writer"
            artifactId = "csv-writer"
            version = "1.0.0"
        }
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
