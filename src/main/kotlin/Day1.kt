import java.io.File

fun main() {
    val input = File("src/main/resources/day1.txt")
        .readLines()
        .map(String::toInt)
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}

fun part1(input: List<Int>) =
    input.windowed(2)
        .count { it.first() < it.last() }

fun part2(input: List<Int>) =
    input.windowed(3)
        .map { it.sum() }
        .windowed(2)
        .count { it.first() < it.last() }