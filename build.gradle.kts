plugins {
    id("java")
    id("io.spring.dependency-management") version "1.1.4"
    id("org.springframework.boot") version "3.1.5"
    id("org.flywaydb.flyway") version "9.22.3"

}

group = "fun.example.bookshop"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2:2.1.210")
    implementation("org.flywaydb:flyway-core:9.22.3")
    implementation("org.bitbucket.b_c:jose4j:0.9.3")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.assertj:assertj-core:3.24.2")

}

tasks.test {
    useJUnitPlatform()
}