package util

import java.io.File

class InputReader {
    private fun read(day: Int, part: Int, isExample: Boolean): List<String> {
        val fileName = if (isExample) "example" else "input"

        val fullPath = "input/day$day/$fileName$part.txt"
        return File(fullPath).readLines()
    }
    fun readExample(day: Int, part: Int): List<String>{
        return this.read(day, part, true)
    }

    fun readInput(day: Int, part: Int): List<String>{
        return this.read(day, part, false)
    }

}