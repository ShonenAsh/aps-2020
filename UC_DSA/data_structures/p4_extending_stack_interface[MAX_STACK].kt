package UC_DSA.C2

class Item(val value: Int, var next: Item? = null)

class StackWithMax(var start: Item? = null, var aux_start: Item? = null) {

    fun push(value: Int) {
        val x = Item(value)
        val y = x
        if (this.start == null) {
            this.start = x
            this.aux_start = y
        } else {
            x.next = this.start
            this.start = x

            if (y.value > this.aux_start!!.value) {
                y.next = this.aux_start
                this.aux_start = y
            } else {
                val top = Item(this.aux_start!!.value)
                top.next = this.aux_start
                this.aux_start = top
            }
        }
    }

    fun pop(): Int? {
        if (this.start == null) {
//            print("Underflow!!\n")
            return null
        } else {
            val x = this.start
            this.start = this.start!!.next
            this.aux_start = this.aux_start!!.next
            return x!!.value
        }
    }

    fun peek() = if (this.start != null) start!!.value else null

    fun max() = if (this.aux_start != null) aux_start!!.value else null

}

fun main() {
    val mStack = StackWithMax()
    val n = readLine()!!.toInt()
    for (i in 1..n){
        val op = readLine()!!.split(" ")
        when {
            op.size > 1 -> {
                val v = op[1].toInt()
                mStack.push(v)
            }
            op[0] == "pop" -> {
                mStack.pop()
            }
            else -> {
                print("${mStack.max()}\n")
            }
        }
    }
}