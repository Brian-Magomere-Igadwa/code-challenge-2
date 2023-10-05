fun main(args: Array<String>) {
    val result = GetUniques(list1 = listOf(1, 2, 4, 5), list2 = listOf(2,  4, 8, 7, 0, 9))
        .printUniques()
        .toString()
    println("Outcome: $result")
}