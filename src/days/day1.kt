package days

import util.InputReader
import kotlin.math.abs

fun compareListDifferences(list1: List<Int>, list2: List<Int>): Int {
    return list1.zip(list2).sumOf { (el1, el2) ->
        abs(el1 - el2)
    }
}


fun calculateSortedListDifferences(list1: List<Int>, list2: List<Int>): Int {
    return compareListDifferences(list1.sorted(), list2.sorted())
}


fun splitLinesIntoLists(lines: List<String>): Pair<List<Int>, List<Int>> {
    val (list1, list2) = lines.map {
        val splitLine = it.split("   ")
        val first = splitLine[0].toInt()
        val second = splitLine[1].toInt()
        Pair(first, second)
    }.unzip()
    return Pair(list1, list2)
}

fun main() {
    val exampleLines: List<String> = InputReader().readInput(1, 1)
    val locationLists: Pair<List<Int>, List<Int>> = splitLinesIntoLists(exampleLines)
    println(calculateSortedListDifferences(locationLists.first, locationLists.second))
}