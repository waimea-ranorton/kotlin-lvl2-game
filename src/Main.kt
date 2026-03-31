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
//    getPlayerNames()

//Placing bombs-----------------------------------------------------------------------------------------------------------------
//asking player where

    createboard()

    while (true) {
        showboard()

        println("$player1 Enter square: ")
        println("Options")
        println("1,2,3,4,5,6,7,8,9,10,11,12")
        println()
        val location = readln()

        if (location.isNullOrBlank()) return

        for (i in 0..<board.size) {
            if (board[i] == "x") {
                board[i] = location
                break
            }
        }
    }
}


//    for (i in 0..<board.size) {
//        if (board[i] == "") {
//            board[i] = location
//            break
//        }
//    }

        // Check for a win -> break

        // Switch pplayer





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


//----------------------------------------------------------------------------------------------------------------------

//board

fun createboard() {
    println("")
    repeat(12) {
        board.add("X")
    }
}

//board
fun showboard() {

    for (i in 1..board.size) {
        print("$i")
    }

    //top
    println()
    print("┍".cyan())
    println("━━━━━━━━━━━┳".repeat(board.size).cyan())

    for (i in 0..<board.size) {
        print("|".cyan() + "${board[i].padEnd(5).padStart(10)} ")
    }
    println("|".cyan())

    //bottom
    print("┕".cyan())
    println("━━━━━━━━━━━┻".repeat(board.size).cyan())

}
//----------------------------------------------------------------------------------------------------------------------

