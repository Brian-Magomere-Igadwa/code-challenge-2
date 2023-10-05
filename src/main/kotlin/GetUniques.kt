class GetUniques(
    private val list1: List<Int>,
    private val list2: List<Int>
) {
    private val mergedList = list1 + list2
    private val uniques = mergedList.toSet().toList().sorted()

    fun printUniques(): List<Int> {
        return uniques
    }

}