plugins {
	java
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
}

repositories {
	mavenCentral()
}

dependencies {
	compileOnly("org.projectlombok:lombok:1.18.30")
	annotationProcessor("org.projectlombok:lombok:1.18.30")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.h2database:h2")

	testCompileOnly("org.projectlombok:lombok:1.18.30")
	testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<Test> {
	useJUnitPlatform()
	jvmArgs("-Xmx1g")
}
kotlin {
	jvmToolchain(17)
}