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

fun main() {
    showIntro()
    getPlayerNames()

//Placing bombs-----------------------------------------------------------------------------------------------------------------
//asking player where

    createboard()
    while (true) {
        showboard()

    while (true) {
        println("$player1 Enter square: ")
        println("Options")
        println("1,2,3,4,5,6,7,8,9,10,11,12")
        var location = readlnOrNull()?.toIntOrNull()
        if (location != null && location in 1..12)
            addCounter()

    }


//
//    for (i in 0..<board.size) {
//        if (board[i] == "") {
//            board[i] = location
//            break
//        }
//    }

        // Check for a win -> break

        // Switch pplayer

    }
}


fun showIntro() {
    println("=========================".cyan())
    println("\uD83D\uDCA3    CHAIN REACTION   \uD83D\uDCA3".blue())
    println("=========================".cyan())
    println("")
}
//----------------------------------------------------------------------------------------------------------------------
fun getPlayerNames() {
    while (true) {
        println("Hello Players")
        println("Insert Player 1 name: ")
        val answer = readlnOrNull()
        if (!answer.isNullOrBlank()) {
            player1 = answer
            break
        }
    }

    while (true) {
        println("Insert Player 2 name: ")
        val player2 = readlnOrNull()
        if (player2 != null && player2.isNotBlank()) break
    }

}
//----------------------------------------------------------------------------------------------------------------------
fun addCounter() {
    while (true) {
        println
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

