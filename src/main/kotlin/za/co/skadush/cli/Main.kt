package za.co.skadush.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.help
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt
import com.github.ajalt.clikt.parameters.types.int

class Hello : CliktCommand() {
//    private val count: Int by option().int().default(1).help("Number of greetings")
    private val version: String = "1.x.x"
//    private val name: String by option().prompt("Your name").help("The person to greet")
//    private val gs: Array<String> = "git status".split(" ").toTypedArray()

    override fun run() {
//        repeat(count) {
//            echo("Hello $count!")
//        }
        echo("version: $version")
//        try {
//            // Execute the command
//            val process = ProcessBuilder(*gs)
//                .redirectOutput(ProcessBuilder.Redirect.INHERIT)
//                .redirectError(ProcessBuilder.Redirect.INHERIT)
//                .start()
//
//            // Wait for the process to finish and capture the exit code
//            val exitCode = process.waitFor()
//            echo("Command finished with exit code $exitCode")
//        } catch (e: Exception) {
//            echo("Failed to execute command: ${e.message}")
//        }
    }
}

fun main(args: Array<String>) = Hello().main(args)