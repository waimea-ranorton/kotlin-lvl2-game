import java.security.Principal

/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   CHAIN REACTION
 * Project Author: PROJECT AUTHOR HERE
 * GitHub Repo:    https://github.com/waimea-ranorton/kotlin-lvl2-game
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */

val board = mutableListOf<String>()
var player1 = "P1"
var player2 = "P2"

var p1Points: Int = 0
var p2Points: Int = 0

//main game loop
//Players insert names, board is shown, player1 places counter, points updated, player 2 places counter, points updated
// so on until a win or lose.

fun main() {
    showIntro()
    showRules()
    getPlayerNames()
    createboard()

    //loop, broken if player win or lose
    while (true) {
        showboard()
        println("$player1 Enter square: ")
        getPlacement("■")
        showboard()
        checkChain()
        showboard()

        showboard()
        println("$player2 Enter square: ")
        getPlacement("○")
        showboard()
        checkChain()
        showboard()

        if (p1Points >= 10) {
            println("Congratulations $player1 you are the winner")
            println("P1=$p1Points  P2=$p2Points")
            break
        }

        if (p2Points >= 10) {
            println("Congratulations $player2 you are the winner")
            println("P1=$p1Points  P2=$p2Points")
            break
        }

        }
    }


//----------------------------------------------------------------------------------------------------------------------
//This function creates a decorative title
fun showIntro() {
    println("=========================".cyan())
    println("\uD83D\uDCA3    CHAIN REACTION   \uD83D\uDCA3".blue())
    println("=========================".cyan())
    println("")

}

//----------------------------------------------------------------------------------------------------------------------
fun showRules() {
    while (true) {
        println("See game rules?")
        println("Type Y for rules, Press Enter to skip")
        println("")
        val answer = readlnOrNull()
        if (answer == "Y") {
            println("")
            println(
                "- Players take turns, You may not skip your turn\n" +
                        "- On your turn you must place one of your bombs on an empty square, but ...\n" +
                        "- You cannot place your bomb directly between two opponent bombs since it would immediately be 'defused' (see the defuse rule below)\n" +
                        "- After placing, the following rules apply (in order):\n" +
                        "- Defuse rule:  if any opponent bomb now has one of your bombs on each side, it is 'defused' and removed from the board (note: two bombs can be defused in one go)\n" +
                        "- Chain reaction rule: if your bomb creates an unbroken chain of 3 or more of your own bombs, the entire chain 'explodes' - all bombs in the chain are removed and you score points equal to the length of the chain\n" +
                        "- The first player to reach 10 points wins\n"
            )
            break
        }

        else
            break
    }
}
//----------------------------------------------------------------------------------------------------------------------
//This function asks both players for usernames that will be used though out the game
fun getPlayerNames() {
    while (true) {
        println("Hello Players")
        println("Insert Player 1 name: ".green())
        val answer = readlnOrNull()
        if (!answer.isNullOrBlank()) {
            player1 = answer.green()
            break
        }
    }

    while (true) {
        println("Insert Player 2 name: ".blue())
        val answer2 = readlnOrNull()
        if (!answer2.isNullOrBlank()) {
            player2 = answer2.blue()
            break
        }

    }
}

//-----------------------------------------------------------------------------------------------------------

//This function creates the counters
//each " " is a possible loaction for a counter

fun createboard() {
    println(" ")
    repeat(12) {
        board.add(" ")
    }

}

//This function creates the structure of the board, it helps the user understand the game
fun showboard() {

    //numbers
    for (i in 1..board.size) {
        print("$i".padEnd(6).padStart(12))
    }

    //top
    println()
    print("┏".cyan())
    println("━━━━━━━━━━━┳".repeat(board.size-1).cyan() + ("━━━━━━━━━━━┓").cyan())

    //counters
    for (i in 0..<board.size) {
        print("┃".cyan() + "${board[i].padEnd(5).padStart(10)} ")
    }
    println("┃".cyan())

    //bottom
    print("┗".cyan())
    println("━━━━━━━━━━━┻".repeat(board.size-1).cyan() + ("━━━━━━━━━━━┛").cyan())

}
//----------------------------------------------------------------------------------------------------------------------
//We need to ask the player where they want to place their counter, if they do this it needs to be placed, here is the
//fumction that does that.

fun getPlacement(counter: String) {

    var location: Int?

    while (true) {
        println("Options")
        println("1,2,3,4,5,6,7,8,9,10,11,12")

        location = readlnOrNull()?.toIntOrNull()

        if (location != null && location in 1..12) break

        else println("Invalid input"); return

    }

    board[location!! - 1] = counter

}

//----------------------------------------------------------------------------------------------------------------------
fun checkChain() {
    //The code needs to check over the board, to see whether or not there are three or more of the same counter in a row
//--------------------------------------
    val EMPTY = " "
    var currentChain = EMPTY
    var chainCount = 0
    var chainStart = 0

//--------------------------------------
    for (i in 0..<board.size) {

//        println("Checking: $i...")

        // Not already tracking a chain, or tracking a different player chain?
        if (currentChain == EMPTY || board[i] != currentChain) {
            // Start tracking it
            currentChain = board[i]
            chainCount = 1
            chainStart = i
        }
        // Already tracking a chain
        else {
            // So just count
            chainCount++
            if (chainCount >= 3) {
                boom(chainStart, chainCount)
            }
        }
    }
}

fun boom(start: Int, length: Int) {
    //remove counters and add chainCount call these points
    println("BOOM!!! $start, $length")

    //checking which player counters apply to

    if (board[start] == "■") {
        //adding player points for each counter (length)
        p1Points += length
        println("player1 points =$p1Points")
    }

    else {
        p2Points += length
        println("player2 points =$p2Points")
    }

    for (i in start ..<(start + length) ) {
        board[i] = " "
    }
}

//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------


    fun tie() {
        //make function that if whole board is filled player tie
    }

