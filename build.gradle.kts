plugins {
    java
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "edu.pswiderski"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.zalando:logbook-spring-boot-starter:3.4.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit-pioneer:junit-pioneer:unspecified")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
