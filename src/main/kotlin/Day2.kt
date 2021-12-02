import java.io.File

fun main() {
    val input = File("src/main/resources/day2.txt")
        .readLines()
        .map { it.split(" ") }
        .map { it.first() to it.last().toInt() }
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}

fun part1(input: List<Pair<String, Int>>): Int {
    var horizontal = 0
    var depth = 0
    for (command in input) {
        when (command.first) {
            "forward" -> horizontal += command.second
            "up" -> depth -= command.second
            "down" -> depth += command.second
        }
    }
    return horizontal * depth
}

fun part2(input: List<Pair<String, Int>>): Int {
    var horizontal = 0
    var depth = 0
    var aim = 0
    for (command in input) {
        when (command.first) {
            "forward" -> {
                horizontal += command.second
                depth += aim * command.second
            }
            "up" -> aim -= command.second
            "down" -> aim += command.second
        }
    }
    return horizontal * depth
}