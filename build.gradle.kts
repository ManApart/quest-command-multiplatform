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

// Exclude kotlin runtime
//configurations {
//	all {
//		exclude("org.jetbrains.kotlin","kotlin-stdlib")
//	}
//}

korge {
	id = "org.rack.manapart"
	dependencyMulti("org.rak.manapart:quest-command:SNAPSHOT")
//	targetAll()

	targetJvm()
//	targetAndroid()
	targetJs()
}