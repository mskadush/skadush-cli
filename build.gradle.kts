plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

group = "za.co.skadush.cli"
version = "1.1-SNAPSHOT"

dependencies {

    implementation(libs.clikt)

    // optional support for rendering markdown in help messages
    implementation(libs.clikt.markdown)
}

application {
    mainClass.set("za.co.skadush.cli.MainKt")
    applicationName = "skadush-cli"
}
