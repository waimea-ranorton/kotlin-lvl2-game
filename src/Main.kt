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
fun main() {
    //header
    println("=========================".cyan())
    println("\uD83D\uDCA3    CHAIN REACTION   \uD83D\uDCA3".blue())
    println("=========================".cyan())
    println("")


//getting player names--------------------------------------------------------------------------------------------------
    var player1: String?
    while (true) {
        println("Hello Players")
        println("Insert Player 1 name ")
        player1 = readlnOrNull()
        if (player1 != null && player1.isNotBlank()) break
    }

    var player2: String?
    while (true) {
        println("Hello Players")
        println("Insert Player 2 name ")
        player2 = readlnOrNull()
        if (player2 != null && player2.isNotBlank()) break
    }

//----------------------------------------------------------------------------------------------------------------------


//putting the gameboard up
    createboard()
    while(true) {
        showboard()
        break
    }
}

//----------------------------------------------------------------------------------------------------------------------
//board
fun createboard() {
    repeat(12) {
        board.add("")
    }
}

//board
fun showboard() {

    //top
    println("")
    print("┍".cyan())
    print("━━━━━━━━━━━┳".repeat(board.size).cyan())

    for (i in 0..<board.size) {
        print(" ${board[i].padEnd(12)} ")
    }

    //bottom
    println("")
    print("┕")
    println("━━━━━━━━━━━┻".repeat(board.size).cyan())

}

//----------------------------------------------------------------------------------------------------------------------

//getting player move x2
fun placebomb(): Int {
    while (true) {
        print("Player 1 Enter sqaure")
    }
}
//
//fun updateboard(): {
//
//}
//
//fun updatepoints(): {
//
//}
//
//fun checkforwin(): {
//
//}
