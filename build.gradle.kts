plugins {
    kotlin("jvm")
    application
}

group = "za.co.skadush.cli"
version = "1.0-SNAPSHOT"

dependencies {

    implementation("com.github.ajalt.clikt:clikt:5.0.2")

    // optional support for rendering markdown in help messages
    implementation("com.github.ajalt.clikt:clikt-markdown:5.0.2")
}

application {
    mainClass.set("za.co.skadush.cli.MainKt")
}
