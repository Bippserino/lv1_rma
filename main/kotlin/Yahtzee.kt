class Yahtzee {
    val dice = Dice(6)

    init {
        for(i in 0..5) {
            dice.roll(i)
        }
    }

    fun getDiceValues()  {
        for (i in 0..5) {
            print(dice.getValue(i).toString() + " ")
        }
        print("\n")
    }

    fun isFourOfAKind(): Boolean {
        for (i in 1..6) {
            if (dice.getValues().count { it == i } >= 4) return true
        }
        return false
    }

    fun isYahtzee(): Boolean {
        for (i in 1..6) {
            if (dice.getValues().count { it == i } >= 5) return true
        }
        return false
    }

    fun isStraight(): Boolean {
       var values = dice.getValues().sortedArray()
        var stringValues = ""
        for (c in values) {
            stringValues +=c
        }
        if (stringValues.contains("12345") || stringValues.contains(("23456"))) return true
        return false
    }

}