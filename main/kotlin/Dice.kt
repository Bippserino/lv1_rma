import kotlin.random.Random

class Dice(private val numDice: Int) {
    private val dice = IntArray(numDice)

    fun roll(index: Int) {
        dice[index] = Random.nextInt(1, 7)
    }

    fun getValue(index: Int): Int {
        return dice[index]
    }

    fun toRoll(index: Int) {
        dice[index] = 0
    }

    fun reset() {
        for (i in 0 until numDice) {
            dice[i] = 0
        }
    }

    fun getValues() : IntArray {
        return dice.copyOf()
    }

    fun setValue(index: Int, value: Int) {
        dice[index] = value
    }
}