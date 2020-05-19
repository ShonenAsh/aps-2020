fun lcm_of_array_elements(element_array: IntArray): Long {
    var lcm_of_array_elements: Long = 1
    var divisor = 2
    while (true) {
        var counter = 0
        var divisible = false
        for (i in element_array.indices) {

            if (element_array[i] == 0) {
                return 0
            } else if (element_array[i] < 0) {
                element_array[i] = element_array[i] * -1
            }
            if (element_array[i] == 1) {
                counter++
            }

            if (element_array[i] % divisor == 0) {
                divisible = true
                element_array[i] = element_array[i] / divisor
            }
        }

        if (divisible) {
            lcm_of_array_elements = lcm_of_array_elements * divisor
        } else {
            divisor++
        }
        if (counter == element_array.size) {
            return lcm_of_array_elements
        }
    }
}


fun main(args: Array<String>) {
    val element_array = intArrayOf(2, 7, 3, 9, 4)
    println(lcm_of_array_elements(element_array))
}
