fun main(args: Array<String>) {
    var game = Yahtzee()

    for (turn in 0..1) {
        game.getDiceValues()
        print("Turn " + (turn +1) + ". Would you like to keep rolling?\n")
        if (readLine()!! == "yes") {
            print("\nWhich dice would you like to roll?\n")
            var userInput = readLine()!!.split(' ').map(String::toInt)
            if (userInput.size != 0) {1
                for(input in userInput) {
                    game.dice.roll(input - 1)
                }
            }
        }
        else {
            break
        }
    }

    for (i in 0..3) {
        game.dice.setValue(i, 1)
    }
    game.getDiceValues()
    if (game.isYahtzee()) {
        print("You got Yahtzee!")
    }
    else if(game.isFourOfAKind()) {
        print("You got four of kind!")
    }
    else if (game.isStraight()) {
        print("You got straight!")
    }
}