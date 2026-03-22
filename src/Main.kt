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
    println("=========================".cyan())
    println("\uD83D\uDCA3    CHAIN REACTION   \uD83D\uDCA3".blue())
    println("=========================".cyan())
    println("")

    createboard()
    while(true) {
        showboard()
        break
    }
}


fun createboard() {
    repeat(12) {
        board.add("")
    }
}

fun showboard() {
    //top

    println("")
    print("┍".cyan())
    print("━━━━━━━━━━━┳".repeat(board.size).cyan())

    for (i in 0..<board.size) {
        print(" ${board[i].padEnd(12)} ")
    }

    //bottom
    println(" ")
    println("┕━━━━━━━━━━━┻".repeat(board.size).cyan())

}

