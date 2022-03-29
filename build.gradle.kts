import com.soywiz.korge.gradle.*

group = "org.rak.manapart"
version = ""

buildscript {
	val korgePluginVersion: String by project

	repositories {
		mavenLocal()
		mavenCentral()
		google()
		maven { url = uri("https://plugins.gradle.org/m2/") }
	}
	dependencies {
		classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
	}
}

apply<KorgeGradlePlugin>()

korge {
	id = "org.rack.manapart"

	//    implementation("org.rak.manapart:quest-command:0.0.5") {
//	implementation("org.rak.manapart:quest-command:SNAPSHOT") {
//		exclude("org.jetbrains.kotlin","kotlin-stdlib")
//	}
	dependencyMulti("org.rak.manapart:quest-command:SNAPSHOT")
//	project.korge.addDependency("jvmMainImplementation", "org.rak.manapart:quest-command:SNAPSHOT")
// To enable all targets at once
	//targetAll()

// To enable targets based on properties/environment variables
	//targetDefault()

// To selectively enable targets

	targetJvm()
	targetJs()
}